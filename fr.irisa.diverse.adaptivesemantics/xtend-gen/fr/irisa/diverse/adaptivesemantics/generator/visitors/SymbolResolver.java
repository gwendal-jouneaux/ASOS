package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SymbolResolver {
  private final Map<SymbolDef, SymbolPath> symbolTable = CollectionLiterals.<SymbolDef, SymbolPath>newHashMap();
  
  public void resolveFor(final Rule node) {
    final EClass concept = node.getConclusion().getFrom().getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getConclusion().getFrom().getChilds();
    final int len = childs.size();
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        final SymbolPath sp = new SymbolPath("node", "", "");
        this.resolveFirst(child, features.get(i), sp);
      }
    }
    EList<Premise> _premises = node.getPremises();
    for (final Premise premise : _premises) {
      this.propagate(premise);
    }
  }
  
  protected void _resolve(final DefConfiguration node, final EStructuralFeature feature, final SymbolPath sp) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    final String type = node.getConcept().getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type);
    _builder.append(") ");
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    _builder.append(_plus_1);
    _builder.append(")");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") ");
    String _valueForm = sp.getValueForm();
    String _plus_2 = (_valueForm + featureGetter);
    _builder_1.append(_plus_2);
    _builder_1.append(")");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") ");
    String _unknownForm = sp.getUnknownForm();
    String _plus_3 = (_unknownForm + featureGetter);
    _builder_2.append(_plus_3);
    _builder_2.append(")");
    final SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      String _termForm_1 = newSymbolPath.getTermForm();
      String _valueForm_1 = newSymbolPath.getValueForm();
      String _valueForm_2 = newSymbolPath.getValueForm();
      final SymbolPath newSP = new SymbolPath(_termForm_1, _valueForm_1, _valueForm_2);
      this.symbolTable.put(node.getSymbol(), newSP);
    }
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.resolve(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _resolve(final VoidList node, final EStructuralFeature feature, final SymbolPath sp) {
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.resolve(node.getSymbol(), feature, sp);
    }
  }
  
  protected void _resolve(final ListDef node, final EStructuralFeature feature, final SymbolPath sp) {
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    String _plus_1 = ((featureGetter + ".get(data.get") + _indexNameFor);
    final String headGetter = (_plus_1 + "())");
    final String tailGetter = featureGetter;
    String _termForm = sp.getTermForm();
    String _plus_2 = (_termForm + headGetter);
    String _valueForm = sp.getValueForm();
    String _unknownForm = sp.getUnknownForm();
    String _plus_3 = (_unknownForm + headGetter);
    SymbolPath headSymbolPath = new SymbolPath(_plus_2, _valueForm, _plus_3);
    String _termForm_1 = sp.getTermForm();
    String _plus_4 = (_termForm_1 + tailGetter);
    String _valueForm_1 = sp.getValueForm();
    String _unknownForm_1 = sp.getUnknownForm();
    String _plus_5 = (_unknownForm_1 + tailGetter);
    SymbolPath tailSymbolPath = new SymbolPath(_plus_4, _valueForm_1, _plus_5);
    SingleTermDef _head = node.getHead();
    if ((_head instanceof SymbolDef)) {
      SingleTermDef _head_1 = node.getHead();
      this.symbolTable.put(((SymbolDef) _head_1), headSymbolPath);
    } else {
      SingleTermDef _head_2 = node.getHead();
      final DefConfiguration head = ((DefConfiguration) _head_2);
      final EClass concept = head.getConcept();
      final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
      final EList<TermDef> childs = head.getChilds();
      final int len = childs.size();
      final String type = concept.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("((");
      _builder.append(type);
      _builder.append(") ");
      String _termForm_2 = headSymbolPath.getTermForm();
      _builder.append(_termForm_2);
      _builder.append(")");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("((");
      _builder_1.append(type);
      _builder_1.append(") ");
      String _valueForm_2 = headSymbolPath.getValueForm();
      _builder_1.append(_valueForm_2);
      _builder_1.append(")");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("((");
      _builder_2.append(type);
      _builder_2.append(") ");
      String _unknownForm_2 = headSymbolPath.getUnknownForm();
      _builder_2.append(_unknownForm_2);
      _builder_2.append(")");
      final SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
      SymbolDef _symbol = head.getSymbol();
      boolean _tripleNotEquals = (_symbol != null);
      if (_tripleNotEquals) {
        String _termForm_3 = newSymbolPath.getTermForm();
        String _valueForm_3 = newSymbolPath.getValueForm();
        String _valueForm_4 = newSymbolPath.getValueForm();
        final SymbolPath valueSP = new SymbolPath(_termForm_3, _valueForm_3, _valueForm_4);
        this.symbolTable.put(head.getSymbol(), valueSP);
      }
      for (int i = 0; (i < len); i++) {
        {
          final TermDef child = childs.get(i);
          this.resolve(child, features.get(i), newSymbolPath);
        }
      }
    }
    SymbolDef _tail = node.getTail();
    this.symbolTable.put(((SymbolDef) _tail), tailSymbolPath);
  }
  
  protected void _resolve(final SymbolDef node, final EStructuralFeature feature, final SymbolPath sp) {
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    String _valueForm = sp.getValueForm();
    String _plus_2 = (_valueForm + featureGetter);
    String _unknownForm = sp.getUnknownForm();
    String _plus_3 = (_unknownForm + featureGetter);
    SymbolPath newSymbolPath = new SymbolPath(_plus_1, _plus_2, _plus_3);
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.resolve(node.getSymbol(), feature, sp);
    }
    this.symbolTable.put(node, newSymbolPath);
  }
  
  protected void _resolveFirst(final DefConfiguration node, final EStructuralFeature feature, final SymbolPath sp) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    final String type = node.getConcept().getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type);
    _builder.append(") data.get");
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder.append(_computedNameFor);
    _builder.append("())");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") data.get");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor_1);
    _builder_1.append("())");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") data.get");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append("())");
    SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.symbolTable.put(node.getSymbol(), newSymbolPath);
    }
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.resolve(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _resolveFirst(final VoidList node, final EStructuralFeature feature, final SymbolPath sp) {
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.resolveFirst(node.getSymbol(), feature, sp);
    }
  }
  
  protected void _resolveFirst(final ListDef node, final EStructuralFeature feature, final SymbolPath sp) {
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.resolveFirst(node.getSymbol(), feature, sp);
    }
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    String _plus_1 = (".get(data.get" + _indexNameFor);
    final String headGetter = (_plus_1 + "())");
    final String tailGetter = "";
    StringConcatenation _builder = new StringConcatenation();
    String _termForm = sp.getTermForm();
    String _plus_2 = (_termForm + featureGetter);
    _builder.append(_plus_2);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("data.get");
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor);
    _builder_1.append("()");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("(data.get");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_1);
    _builder_2.append("() == null ? ");
    String _termForm_1 = sp.getTermForm();
    String _plus_3 = (_termForm_1 + featureGetter);
    _builder_2.append(_plus_3);
    _builder_2.append(" : data.get");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append("())");
    SymbolPath tailSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    StringConcatenation _builder_3 = new StringConcatenation();
    String _termForm_2 = sp.getTermForm();
    String _plus_4 = (_termForm_2 + featureGetter);
    String _plus_5 = (_plus_4 + headGetter);
    _builder_3.append(_plus_5);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("data.get");
    String _computedNameFor_3 = NamingUtils.computedNameFor(feature.getName());
    _builder_4.append(_computedNameFor_3);
    _builder_4.append("()");
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("(data.get");
    String _computedNameFor_4 = NamingUtils.computedNameFor(feature.getName());
    _builder_5.append(_computedNameFor_4);
    _builder_5.append("() == null ? ");
    String _termForm_3 = sp.getTermForm();
    String _plus_6 = (_termForm_3 + featureGetter);
    String _plus_7 = (_plus_6 + headGetter);
    _builder_5.append(_plus_7);
    _builder_5.append(" : data.get");
    String _computedNameFor_5 = NamingUtils.computedNameFor(feature.getName());
    _builder_5.append(_computedNameFor_5);
    _builder_5.append("())");
    SymbolPath headSymbolPath = new SymbolPath(_builder_3.toString(), _builder_4.toString(), _builder_5.toString());
    SingleTermDef _head = node.getHead();
    if ((_head instanceof SymbolDef)) {
      SingleTermDef _head_1 = node.getHead();
      this.symbolTable.put(((SymbolDef) _head_1), headSymbolPath);
    } else {
      SingleTermDef _head_2 = node.getHead();
      final DefConfiguration head = ((DefConfiguration) _head_2);
      final EClass concept = head.getConcept();
      final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
      final EList<TermDef> childs = head.getChilds();
      final int len = childs.size();
      final String type = concept.getName();
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("((");
      _builder_6.append(type);
      _builder_6.append(") ");
      String _termForm_4 = headSymbolPath.getTermForm();
      _builder_6.append(_termForm_4);
      _builder_6.append(")");
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.append("((");
      _builder_7.append(type);
      _builder_7.append(") ");
      String _valueForm = headSymbolPath.getValueForm();
      _builder_7.append(_valueForm);
      _builder_7.append(")");
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.append("((");
      _builder_8.append(type);
      _builder_8.append(") ");
      String _unknownForm = headSymbolPath.getUnknownForm();
      _builder_8.append(_unknownForm);
      _builder_8.append(")");
      final SymbolPath newSymbolPath = new SymbolPath(_builder_6.toString(), _builder_7.toString(), _builder_8.toString());
      SymbolDef _symbol_1 = head.getSymbol();
      boolean _tripleNotEquals_1 = (_symbol_1 != null);
      if (_tripleNotEquals_1) {
        String _termForm_5 = newSymbolPath.getTermForm();
        String _valueForm_1 = newSymbolPath.getValueForm();
        String _valueForm_2 = newSymbolPath.getValueForm();
        final SymbolPath valueSP = new SymbolPath(_termForm_5, _valueForm_1, _valueForm_2);
        this.symbolTable.put(head.getSymbol(), valueSP);
      }
      for (int i = 0; (i < len); i++) {
        {
          final TermDef child = childs.get(i);
          this.resolve(child, features.get(i), newSymbolPath);
        }
      }
    }
    SymbolDef _tail = node.getTail();
    this.symbolTable.put(((SymbolDef) _tail), tailSymbolPath);
  }
  
  protected void _resolveFirst(final SymbolDef node, final EStructuralFeature feature, final SymbolPath sp) {
    SymbolDef _symbol = node.getSymbol();
    boolean _tripleNotEquals = (_symbol != null);
    if (_tripleNotEquals) {
      this.resolveFirst(node.getSymbol(), feature, sp);
    }
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    StringConcatenation _builder = new StringConcatenation();
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    _builder.append(_plus_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("data.get");
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor);
    _builder_1.append("()");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("(data.get");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_1);
    _builder_2.append("() == null ? ");
    String _termForm_1 = sp.getTermForm();
    String _plus_2 = (_termForm_1 + featureGetter);
    _builder_2.append(_plus_2);
    _builder_2.append(" : data.get");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append("())");
    SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    this.symbolTable.put(node, newSymbolPath);
  }
  
  public void propagate(final Premise node) {
    final SymbolPath sp = this.symbolTable.get(node.getFrom().getDef());
    String _termForm = sp.getTermForm();
    String _valueForm = sp.getValueForm();
    String _valueForm_1 = sp.getValueForm();
    final SymbolPath newSP = new SymbolPath(_termForm, _valueForm, _valueForm_1);
    this.symbolTable.put(node.getFrom().getDef(), newSP);
    this.propagateFirst(node.getTo(), newSP);
  }
  
  protected void _propagate(final DefConfiguration node, final EStructuralFeature feature, final SymbolPath sp) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    final String type = node.getConcept().getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type);
    _builder.append(") ");
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    _builder.append(_plus_1);
    _builder.append(")");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") ");
    String _valueForm = sp.getValueForm();
    String _plus_2 = (_valueForm + featureGetter);
    _builder_1.append(_plus_2);
    _builder_1.append(")");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") ");
    String _unknownForm = sp.getUnknownForm();
    String _plus_3 = (_unknownForm + featureGetter);
    _builder_2.append(_plus_3);
    _builder_2.append(")");
    final SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.propagate(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _propagate(final VoidList node, final EStructuralFeature feature, final SymbolPath sp) {
  }
  
  protected void _propagate(final ListDef node, final EStructuralFeature feature, final SymbolPath sp) {
  }
  
  protected void _propagate(final SymbolDef node, final EStructuralFeature feature, final SymbolPath sp) {
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    String _valueForm = sp.getValueForm();
    String _plus_2 = (_valueForm + featureGetter);
    String _unknownForm = sp.getUnknownForm();
    String _plus_3 = (_unknownForm + featureGetter);
    SymbolPath newSymbolPath = new SymbolPath(_plus_1, _plus_2, _plus_3);
    this.symbolTable.put(node, newSymbolPath);
  }
  
  protected void _propagateFirst(final DefConfiguration node, final SymbolPath sp) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    final String type = node.getConcept().getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type);
    _builder.append(") ");
    String _localNameFor = NamingUtils.localNameFor(sp.getTermForm());
    _builder.append(_localNameFor);
    _builder.append(")");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") ");
    String _localNameFor_1 = NamingUtils.localNameFor(sp.getValueForm());
    _builder_1.append(_localNameFor_1);
    _builder_1.append(")");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") ");
    String _localNameFor_2 = NamingUtils.localNameFor(sp.getUnknownForm());
    _builder_2.append(_localNameFor_2);
    _builder_2.append(")");
    SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.propagate(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _propagateFirst(final SymbolDef node, final SymbolPath sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _localNameFor = NamingUtils.localNameFor(sp.getTermForm());
    _builder.append(_localNameFor);
    StringConcatenation _builder_1 = new StringConcatenation();
    String _localNameFor_1 = NamingUtils.localNameFor(sp.getValueForm());
    _builder_1.append(_localNameFor_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    String _localNameFor_2 = NamingUtils.localNameFor(sp.getUnknownForm());
    _builder_2.append(_localNameFor_2);
    SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    this.symbolTable.put(node, newSymbolPath);
  }
  
  public Map<SymbolDef, SymbolPath> getSymbolTable() {
    return this.symbolTable;
  }
  
  public void resolve(final TermDef node, final EStructuralFeature feature, final SymbolPath sp) {
    if (node instanceof DefConfiguration) {
      _resolve((DefConfiguration)node, feature, sp);
      return;
    } else if (node instanceof SymbolDef) {
      _resolve((SymbolDef)node, feature, sp);
      return;
    } else if (node instanceof ListDef) {
      _resolve((ListDef)node, feature, sp);
      return;
    } else if (node instanceof VoidList) {
      _resolve((VoidList)node, feature, sp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, feature, sp).toString());
    }
  }
  
  public void resolveFirst(final TermDef node, final EStructuralFeature feature, final SymbolPath sp) {
    if (node instanceof DefConfiguration) {
      _resolveFirst((DefConfiguration)node, feature, sp);
      return;
    } else if (node instanceof SymbolDef) {
      _resolveFirst((SymbolDef)node, feature, sp);
      return;
    } else if (node instanceof ListDef) {
      _resolveFirst((ListDef)node, feature, sp);
      return;
    } else if (node instanceof VoidList) {
      _resolveFirst((VoidList)node, feature, sp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, feature, sp).toString());
    }
  }
  
  public void propagate(final TermDef node, final EStructuralFeature feature, final SymbolPath sp) {
    if (node instanceof DefConfiguration) {
      _propagate((DefConfiguration)node, feature, sp);
      return;
    } else if (node instanceof SymbolDef) {
      _propagate((SymbolDef)node, feature, sp);
      return;
    } else if (node instanceof ListDef) {
      _propagate((ListDef)node, feature, sp);
      return;
    } else if (node instanceof VoidList) {
      _propagate((VoidList)node, feature, sp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, feature, sp).toString());
    }
  }
  
  public void propagateFirst(final SingleTermDef node, final SymbolPath sp) {
    if (node instanceof DefConfiguration) {
      _propagateFirst((DefConfiguration)node, sp);
      return;
    } else if (node instanceof SymbolDef) {
      _propagateFirst((SymbolDef)node, sp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, sp).toString());
    }
  }
}

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
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.resolve(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _resolve(final VoidList node, final EStructuralFeature feature, final SymbolPath sp) {
  }
  
  protected void _resolve(final ListDef node, final EStructuralFeature feature, final SymbolPath sp) {
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    String _plus_1 = ((featureGetter + ".get(") + _indexNameFor);
    final String headGetter = (_plus_1 + ")");
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
    _builder.append(") ");
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder.append(_computedNameFor);
    _builder.append(")");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") ");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor_1);
    _builder_1.append(")");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") ");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append(")");
    SymbolPath newSymbolPath = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        this.resolve(child, features.get(i), newSymbolPath);
      }
    }
  }
  
  protected void _resolveFirst(final VoidList node, final EStructuralFeature feature, final SymbolPath sp) {
  }
  
  protected void _resolveFirst(final ListDef node, final EStructuralFeature feature, final SymbolPath sp) {
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    String _plus_1 = (".get(" + _indexNameFor);
    final String headGetter = (_plus_1 + ")");
    final String tailGetter = "";
    StringConcatenation _builder = new StringConcatenation();
    String _termForm = sp.getTermForm();
    String _plus_2 = (_termForm + featureGetter);
    _builder.append(_plus_2);
    StringConcatenation _builder_1 = new StringConcatenation();
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("(");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_1);
    _builder_2.append(" == null ? ");
    String _termForm_1 = sp.getTermForm();
    String _plus_3 = (_termForm_1 + featureGetter);
    _builder_2.append(_plus_3);
    _builder_2.append(" : ");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append(")");
    SymbolPath firstSp = new SymbolPath(_builder.toString(), _builder_1.toString(), _builder_2.toString());
    String _termForm_2 = firstSp.getTermForm();
    String _plus_4 = (_termForm_2 + headGetter);
    String _valueForm = firstSp.getValueForm();
    String _unknownForm = firstSp.getUnknownForm();
    String _plus_5 = (_unknownForm + headGetter);
    SymbolPath headSymbolPath = new SymbolPath(_plus_4, _valueForm, _plus_5);
    String _termForm_3 = firstSp.getTermForm();
    String _plus_6 = (_termForm_3 + tailGetter);
    String _valueForm_1 = firstSp.getValueForm();
    String _unknownForm_1 = firstSp.getUnknownForm();
    String _plus_7 = (_unknownForm_1 + tailGetter);
    SymbolPath tailSymbolPath = new SymbolPath(_plus_6, _valueForm_1, _plus_7);
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
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("((");
      _builder_3.append(type);
      _builder_3.append(") ");
      String _termForm_4 = headSymbolPath.getTermForm();
      _builder_3.append(_termForm_4);
      _builder_3.append(")");
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("((");
      _builder_4.append(type);
      _builder_4.append(") ");
      String _valueForm_2 = headSymbolPath.getValueForm();
      _builder_4.append(_valueForm_2);
      _builder_4.append(")");
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("((");
      _builder_5.append(type);
      _builder_5.append(") ");
      String _unknownForm_2 = headSymbolPath.getUnknownForm();
      _builder_5.append(_unknownForm_2);
      _builder_5.append(")");
      final SymbolPath newSymbolPath = new SymbolPath(_builder_3.toString(), _builder_4.toString(), _builder_5.toString());
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
    String _firstUpper = StringExtensions.toFirstUpper(feature.getName());
    String _plus = (".get" + _firstUpper);
    final String featureGetter = (_plus + "()");
    StringConcatenation _builder = new StringConcatenation();
    String _termForm = sp.getTermForm();
    String _plus_1 = (_termForm + featureGetter);
    _builder.append(_plus_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
    _builder_1.append(_computedNameFor);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("(");
    String _computedNameFor_1 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_1);
    _builder_2.append(" == null ? ");
    String _termForm_1 = sp.getTermForm();
    String _plus_2 = (_termForm_1 + featureGetter);
    _builder_2.append(_plus_2);
    _builder_2.append(" : ");
    String _computedNameFor_2 = NamingUtils.computedNameFor(feature.getName());
    _builder_2.append(_computedNameFor_2);
    _builder_2.append(")");
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

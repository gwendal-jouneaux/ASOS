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
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SymbolResolver {
  private final Map<EStructuralFeature, SymbolPath> featureAccessors = CollectionLiterals.<EStructuralFeature, SymbolPath>newHashMap();
  
  private final Map<SymbolDef, EStructuralFeature> symbolFeature = CollectionLiterals.<SymbolDef, EStructuralFeature>newHashMap();
  
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
    Set<SymbolDef> _keySet = this.symbolFeature.keySet();
    for (final SymbolDef symbol : _keySet) {
      {
        final EStructuralFeature feature = this.symbolFeature.get(symbol);
        final SymbolPath paths = this.featureAccessors.get(feature);
        this.symbolTable.put(symbol, paths);
      }
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
    this.featureAccessors.put(feature, newSymbolPath);
    this.symbolFeature.put(node, feature);
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
    this.featureAccessors.put(feature, newSymbolPath);
    this.symbolFeature.put(node, feature);
  }
  
  public void propagate(final Premise node) {
    final EStructuralFeature feature = this.symbolFeature.get(node.getFrom().getDef());
    final SymbolPath sp = this.featureAccessors.get(feature);
    String _termForm = sp.getTermForm();
    String _valueForm = sp.getValueForm();
    String _termForm_1 = sp.getTermForm();
    final SymbolPath newSP = new SymbolPath(_termForm, _valueForm, _termForm_1);
    this.featureAccessors.put(feature, newSP);
    this.propagateFirst(node.getTo(), feature, sp);
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
  
  protected void _propagateFirst(final DefConfiguration node, final EStructuralFeature feature, final SymbolPath sp) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    final String type = node.getConcept().getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type);
    _builder.append(") ");
    String _localNameFor = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
    _builder.append(_localNameFor);
    _builder.append(")");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("((");
    _builder_1.append(type);
    _builder_1.append(") ");
    String _localNameFor_1 = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
    _builder_1.append(_localNameFor_1);
    _builder_1.append(")");
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("((");
    _builder_2.append(type);
    _builder_2.append(") ");
    String _localNameFor_2 = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
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
  
  protected void _propagateFirst(final SymbolDef node, final EStructuralFeature feature, final SymbolPath sp) {
    StringConcatenation _builder = new StringConcatenation();
    String _localNameFor = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
    _builder.append(_localNameFor);
    StringConcatenation _builder_1 = new StringConcatenation();
    String _localNameFor_1 = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
    _builder_1.append(_localNameFor_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    String _localNameFor_2 = NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.getName()));
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
  
  public void propagateFirst(final SingleTermDef node, final EStructuralFeature feature, final SymbolPath sp) {
    if (node instanceof DefConfiguration) {
      _propagateFirst((DefConfiguration)node, feature, sp);
      return;
    } else if (node instanceof SymbolDef) {
      _propagateFirst((SymbolDef)node, feature, sp);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, feature, sp).toString());
    }
  }
}

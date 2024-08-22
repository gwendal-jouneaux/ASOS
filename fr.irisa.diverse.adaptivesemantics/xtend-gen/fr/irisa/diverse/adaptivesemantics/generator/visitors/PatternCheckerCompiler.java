package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils;
import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PatternCheckerCompiler {
  private final String condName = "validPattern";
  
  private static int patternNumber = 0;
  
  public String generateInputCheck(final DefConfiguration pattern) {
    String out = "";
    final EClass concept = pattern.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = pattern.getChilds();
    final int len = childs.size();
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        String _firstUpper = StringExtensions.toFirstUpper(features.get(i).getName());
        String _plus = (".get" + _firstUpper);
        final String featureGetter = (_plus + "()");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(out);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("data.get");
        String _computedNameFor = NamingUtils.computedNameFor(features.get(i).getName());
        _builder_1.append(_computedNameFor);
        _builder_1.append("()");
        String _compile = this.compile(child, ("node" + featureGetter), _builder_1.toString(), features.get(i));
        _builder.append(_compile);
        out = _builder.toString();
      }
    }
    PatternCheckerCompiler.patternNumber++;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    _builder.append(this.condName);
    _builder.append("Input");
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(" = true");
    _builder.append(out);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(this.condName);
    _builder.append("Input");
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generatePremiseCheck(final DefConfiguration pattern, final String computedMember) {
    PatternCheckerCompiler.patternNumber++;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    _builder.append(this.condName);
    _builder.append("Premise");
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(" = true");
    String _compile = this.compile(pattern, computedMember, computedMember, null);
    _builder.append(_compile);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(this.condName);
    _builder.append("Premise");
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateConditionCheck(final DefConfiguration pattern, final String domainAccess) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(true");
    String _compile = this.compile(pattern, domainAccess, domainAccess, null);
    _builder.append(_compile);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _compile(final DefConfiguration node, final String termPath, final String valuePath, final EStructuralFeature feature) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    boolean _isValue = RuleUtils.isValue(concept);
    if (_isValue) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("&& (");
      _builder.append(valuePath, " ");
      _builder.append(" instanceof ");
      String _name = concept.getName();
      _builder.append(_name, " ");
      _builder.append(")");
      String out = _builder.toString();
      for (int i = 0; (i < len); i++) {
        {
          final TermDef child = childs.get(i);
          String _firstUpper = StringExtensions.toFirstUpper(features.get(i).getName());
          String _plus = (".get" + _firstUpper);
          final String featureGetter = (_plus + "()");
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(out);
          String _name_1 = concept.getName();
          String _plus_1 = ("((" + _name_1);
          String _plus_2 = (_plus_1 + ") ");
          String _plus_3 = (_plus_2 + valuePath);
          String _plus_4 = (_plus_3 + ")");
          String _plus_5 = (_plus_4 + featureGetter);
          String _name_2 = concept.getName();
          String _plus_6 = ("((" + _name_2);
          String _plus_7 = (_plus_6 + ") ");
          String _plus_8 = (_plus_7 + valuePath);
          String _plus_9 = (_plus_8 + ")");
          String _plus_10 = (_plus_9 + featureGetter);
          String _compile = this.compile(child, _plus_5, _plus_10, features.get(i));
          _builder_1.append(_compile);
          out = _builder_1.toString();
        }
      }
      return out;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("&& (");
      _builder_1.append(termPath, " ");
      _builder_1.append(" instanceof ");
      String _name_1 = concept.getName();
      _builder_1.append(_name_1, " ");
      _builder_1.append(")");
      String out_1 = _builder_1.toString();
      for (int i = 0; (i < len); i++) {
        {
          final TermDef child = childs.get(i);
          String _firstUpper = StringExtensions.toFirstUpper(features.get(i).getName());
          String _plus = (".get" + _firstUpper);
          final String featureGetter = (_plus + "()");
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(out_1);
          String _name_2 = concept.getName();
          String _plus_1 = ("((" + _name_2);
          String _plus_2 = (_plus_1 + ") ");
          String _plus_3 = (_plus_2 + termPath);
          String _plus_4 = (_plus_3 + ")");
          String _plus_5 = (_plus_4 + featureGetter);
          String _name_3 = concept.getName();
          String _plus_6 = ("((" + _name_3);
          String _plus_7 = (_plus_6 + ") ");
          String _plus_8 = (_plus_7 + termPath);
          String _plus_9 = (_plus_8 + ")");
          String _plus_10 = (_plus_9 + featureGetter);
          String _compile = this.compile(child, _plus_5, _plus_10, features.get(i));
          _builder_2.append(_compile);
          out_1 = _builder_2.toString();
        }
      }
      return out_1;
    }
  }
  
  protected String _compile(final VoidList node, final String termPath, final String valuePath, final EStructuralFeature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& (");
    _builder.append(termPath, " ");
    _builder.append(" instanceof List && ");
    _builder.append(termPath, " ");
    _builder.append(".size() <= data.get");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    _builder.append(_indexNameFor, " ");
    _builder.append("())");
    return _builder.toString();
  }
  
  protected String _compile(final ListDef node, final String termPath, final String valuePath, final EStructuralFeature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& (");
    _builder.append(termPath, " ");
    _builder.append(" instanceof List && ");
    _builder.append(termPath, " ");
    _builder.append(".size() > data.get");
    String _indexNameFor = NamingUtils.indexNameFor(feature.getName());
    _builder.append(_indexNameFor, " ");
    _builder.append("())");
    SingleTermDef _head = node.getHead();
    String _indexNameFor_1 = NamingUtils.indexNameFor(feature.getName());
    String _plus = ((termPath + ".get(data.get") + _indexNameFor_1);
    String _plus_1 = (_plus + "())");
    String _compile = this.compile(_head, _plus_1, valuePath, feature);
    _builder.append(_compile, " ");
    return _builder.toString();
  }
  
  protected String _compile(final SymbolDef node, final String termPath, final String valuePath, final EStructuralFeature feature) {
    return "";
  }
  
  public String compile(final TermDef node, final String termPath, final String valuePath, final EStructuralFeature feature) {
    if (node instanceof DefConfiguration) {
      return _compile((DefConfiguration)node, termPath, valuePath, feature);
    } else if (node instanceof SymbolDef) {
      return _compile((SymbolDef)node, termPath, valuePath, feature);
    } else if (node instanceof ListDef) {
      return _compile((ListDef)node, termPath, valuePath, feature);
    } else if (node instanceof VoidList) {
      return _compile((VoidList)node, termPath, valuePath, feature);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, termPath, valuePath, feature).toString());
    }
  }
}

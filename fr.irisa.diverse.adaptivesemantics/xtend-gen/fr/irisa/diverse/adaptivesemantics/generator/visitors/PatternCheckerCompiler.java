package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
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
        if ((child instanceof DefConfiguration)) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(out);
          String _compile = this.compile(child, NamingUtils.computedNameFor(features.get(i).getName()));
          _builder.append(_compile);
          out = _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(out);
          String _compile_1 = this.compile(child, ("node" + featureGetter));
          _builder_1.append(_compile_1);
          out = _builder_1.toString();
        }
      }
    }
    PatternCheckerCompiler.patternNumber++;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    _builder.append(this.condName);
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(" = true");
    _builder.append(out);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(this.condName);
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
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(" = true");
    String _compile = this.compile(pattern, computedMember);
    _builder.append(_compile);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("if(");
    _builder.append(this.condName);
    _builder.append(PatternCheckerCompiler.patternNumber);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _compile(final DefConfiguration node, final String path) {
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = node.getChilds();
    final int len = childs.size();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& (");
    _builder.append(path, " ");
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
        String _plus_3 = (_plus_2 + path);
        String _plus_4 = (_plus_3 + ")");
        String _plus_5 = (_plus_4 + featureGetter);
        String _compile = this.compile(child, _plus_5);
        _builder_1.append(_compile);
        out = _builder_1.toString();
      }
    }
    return out;
  }
  
  protected String _compile(final VoidList node, final String path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& (");
    _builder.append(path, " ");
    _builder.append(" instanceof List && ");
    _builder.append(path, " ");
    _builder.append(".empty())");
    return _builder.toString();
  }
  
  protected String _compile(final ListDef node, final String path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& (");
    _builder.append(path, " ");
    _builder.append(" instanceof List)");
    String _compile = this.compile(node.getHead(), (path + ".get(0)"));
    _builder.append(_compile, " ");
    return _builder.toString();
  }
  
  protected String _compile(final SymbolDef node, final String path) {
    return "";
  }
  
  public String compile(final TermDef node, final String path) {
    if (node instanceof DefConfiguration) {
      return _compile((DefConfiguration)node, path);
    } else if (node instanceof SymbolDef) {
      return _compile((SymbolDef)node, path);
    } else if (node instanceof ListDef) {
      return _compile((ListDef)node, path);
    } else if (node instanceof VoidList) {
      return _compile((VoidList)node, path);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, path).toString());
    }
  }
}

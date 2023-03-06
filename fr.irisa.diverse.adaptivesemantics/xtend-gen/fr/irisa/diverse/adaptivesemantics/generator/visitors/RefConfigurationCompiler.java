package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import fr.irisa.diverse.adaptivesemantics.generator.AdaptSemGenerator;
import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef;
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
public class RefConfigurationCompiler {
  private static final Map<EClass, Integer> varIndexes = CollectionLiterals.<EClass, Integer>newHashMap();
  
  private final Map<SymbolDef, SymbolPath> ruleTable;
  
  private String lastRefConfig = "";
  
  public RefConfigurationCompiler(final Map<SymbolDef, SymbolPath> table) {
    this.ruleTable = table;
  }
  
  protected String _compile(final RefConfiguration node) {
    String out = "";
    final EClass concept = node.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermRef> childs = node.getChilds();
    final int len = childs.size();
    final Integer classindex = RefConfigurationCompiler.varIndexes.getOrDefault(concept, Integer.valueOf(0));
    RefConfigurationCompiler.varIndexes.put(concept, Integer.valueOf(((classindex).intValue() + 1)));
    boolean _isValue = RuleUtils.isValue(concept);
    if (_isValue) {
      StringConcatenation _builder = new StringConcatenation();
      String _name = concept.getName();
      _builder.append(_name);
      _builder.append(" ");
      String _firstLower = StringExtensions.toFirstLower(concept.getName());
      _builder.append(_firstLower);
      _builder.append(classindex);
      _builder.append(" = ");
      String _name_1 = AdaptSemGenerator.getSemanticDomain().getName();
      _builder.append(_name_1);
      _builder.append("Factory.eINSTANCE.create");
      String _name_2 = concept.getName();
      _builder.append(_name_2);
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      out = _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name_3 = concept.getName();
      _builder_1.append(_name_3);
      _builder_1.append(" ");
      String _firstLower_1 = StringExtensions.toFirstLower(concept.getName());
      _builder_1.append(_firstLower_1);
      _builder_1.append(classindex);
      _builder_1.append(" = ");
      String _firstUpper = StringExtensions.toFirstUpper(AdaptSemGenerator.getModelName());
      _builder_1.append(_firstUpper);
      _builder_1.append("Factory.eINSTANCE.create");
      String _name_4 = concept.getName();
      _builder_1.append(_name_4);
      _builder_1.append("();");
      _builder_1.newLineIfNotEmpty();
      out = _builder_1.toString();
    }
    for (int i = 0; (i < len); i++) {
      {
        final TermRef child = childs.get(i);
        String _firstUpper_1 = StringExtensions.toFirstUpper(features.get(i).getName());
        final String featureSetter = (".set" + _firstUpper_1);
        String featureType = features.get(i).getEType().getInstanceClassName();
        boolean needsCopy = false;
        if ((featureType == null)) {
          featureType = features.get(i).getEType().getName();
          needsCopy = true;
        }
        if ((child instanceof SymbolRef)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(out);
          _builder_2.newLineIfNotEmpty();
          {
            if (needsCopy) {
              String _firstLower_2 = StringExtensions.toFirstLower(concept.getName());
              _builder_2.append(_firstLower_2);
              _builder_2.append(classindex);
              _builder_2.append(featureSetter);
              _builder_2.append("(EcoreUtil.copy((");
              _builder_2.append(featureType);
              _builder_2.append(") ");
              String _compile = this.compile(child);
              _builder_2.append(_compile);
              _builder_2.append("));");
              _builder_2.newLineIfNotEmpty();
            } else {
              String _firstLower_3 = StringExtensions.toFirstLower(concept.getName());
              _builder_2.append(_firstLower_3);
              _builder_2.append(classindex);
              _builder_2.append(featureSetter);
              _builder_2.append("((");
              _builder_2.append(featureType);
              _builder_2.append(") ");
              String _compile_1 = this.compile(child);
              _builder_2.append(_compile_1);
              _builder_2.append(");");
              _builder_2.newLineIfNotEmpty();
            }
          }
          out = _builder_2.toString();
        } else {
          if ((child instanceof RefConfiguration)) {
            StringConcatenation _builder_3 = new StringConcatenation();
            String _compile_2 = this.compile(child);
            _builder_3.append(_compile_2);
            _builder_3.newLineIfNotEmpty();
            _builder_3.newLine();
            _builder_3.append(out);
            _builder_3.newLineIfNotEmpty();
            String _firstLower_4 = StringExtensions.toFirstLower(concept.getName());
            _builder_3.append(_firstLower_4);
            _builder_3.append(classindex);
            _builder_3.append(featureSetter);
            _builder_3.append("((");
            _builder_3.append(featureType);
            _builder_3.append(") ");
            _builder_3.append(this.lastRefConfig);
            _builder_3.append(");");
            _builder_3.newLineIfNotEmpty();
            out = _builder_3.toString();
          } else {
            if ((child instanceof ListRef)) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append(out);
              _builder_4.newLineIfNotEmpty();
              String _firstLower_5 = StringExtensions.toFirstLower(concept.getName());
              _builder_4.append(_firstLower_5);
              _builder_4.append(classindex);
              _builder_4.append(featureSetter);
              _builder_4.append("((");
              _builder_4.append(featureType);
              _builder_4.append(") ");
              String _compile_3 = this.compile(child);
              _builder_4.append(_compile_3);
              _builder_4.append(");");
              _builder_4.newLineIfNotEmpty();
              out = _builder_4.toString();
            }
          }
        }
      }
    }
    String _firstLower_2 = StringExtensions.toFirstLower(concept.getName());
    String _plus = (_firstLower_2 + classindex);
    this.lastRefConfig = _plus;
    return out;
  }
  
  protected String _compile(final VoidList node) {
    return "new ArrayList()";
  }
  
  protected String _compile(final ListRef node) {
    return this.compile(node.getTail());
  }
  
  protected String _compile(final SymbolRef node) {
    final SymbolPath paths = this.ruleTable.get(node.getDef());
    if ((paths != null)) {
      StringConcatenation _builder = new StringConcatenation();
      String _unknownForm = paths.getUnknownForm();
      _builder.append(_unknownForm);
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _name = node.getDef().getName();
      _builder_1.append(_name);
      return _builder_1.toString();
    }
  }
  
  public String getLastRefConfig() {
    return this.lastRefConfig;
  }
  
  public String compile(final TermRef node) {
    if (node instanceof SymbolRef) {
      return _compile((SymbolRef)node);
    } else if (node instanceof RefConfiguration) {
      return _compile((RefConfiguration)node);
    } else if (node instanceof ListRef) {
      return _compile((ListRef)node);
    } else if (node instanceof VoidList) {
      return _compile((VoidList)node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node).toString());
    }
  }
}

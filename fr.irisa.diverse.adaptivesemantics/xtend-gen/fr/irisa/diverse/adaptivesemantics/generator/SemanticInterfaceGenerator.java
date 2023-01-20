package fr.irisa.diverse.adaptivesemantics.generator;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SemanticInterfaceGenerator {
  /**
   * GENERATE ADAPTATION INTERFACES FUNCTIONS
   */
  public static void compileInterfaces(final Map<EClass, List<Rule>> rulesByConcept, final IFileSystemAccess2 fsa) {
    final Set<EClass> conceptsWithRules = rulesByConcept.keySet();
    final HashSet<EClass> concepts = CollectionLiterals.<EClass>newHashSet();
    for (final EClass concept : conceptsWithRules) {
      concepts.addAll(concept.getEAllSuperTypes());
    }
    concepts.addAll(conceptsWithRules);
    for (final EClass concept_1 : concepts) {
      {
        final String path = NamingUtils.interfacePathFor(AdaptSemGenerator.getModelName(), concept_1.getName());
        boolean _isInterface = concept_1.isInterface();
        if (_isInterface) {
          final String interface_ = SemanticInterfaceGenerator.compileAbstractInterfaceFor(concept_1, rulesByConcept);
          fsa.generateFile(path, interface_);
        } else {
          final String interface__1 = SemanticInterfaceGenerator.compileInterfaceFor(concept_1, rulesByConcept);
          fsa.generateFile(path, interface__1);
        }
      }
    }
  }
  
  public static String compileInterfaceFor(final EClass concept, final Map<EClass, List<Rule>> rulesByConcept) {
    final EList<EClass> supertypes = concept.getESuperTypes();
    final Function1<EClass, Boolean> _function = (EClass c) -> {
      boolean _isInterface = c.isInterface();
      return Boolean.valueOf((!_isInterface));
    };
    final EClass superClass = IterableExtensions.<EClass>head(IterableExtensions.<EClass>filter(supertypes, _function));
    final Function1<EClass, Boolean> _function_1 = (EClass c) -> {
      return Boolean.valueOf((c.isInterface() && ((superClass == null) || (!superClass.getEAllSuperTypes().contains(c)))));
    };
    final Iterable<EClass> interfaces = IterableExtensions.<EClass>filter(supertypes, _function_1);
    String _xifexpression = null;
    if ((superClass == null)) {
      _xifexpression = "";
    } else {
      String _interfaceNameFor = NamingUtils.interfaceNameFor(superClass.getName());
      _xifexpression = ("extends " + _interfaceNameFor);
    }
    final String extendsClause = _xifexpression;
    String implementsClause = "";
    boolean _isEmpty = supertypes.isEmpty();
    if (_isEmpty) {
      implementsClause = "implements SemanticsAdaptationInterface";
    } else {
      boolean _isEmpty_1 = IterableExtensions.isEmpty(interfaces);
      boolean _not = (!_isEmpty_1);
      if (_not) {
        final Function1<EClass, CharSequence> _function_2 = (EClass type) -> {
          return NamingUtils.interfaceNameFor(type.getName());
        };
        String _join = IterableExtensions.<EClass>join(interfaces, ", ", _function_2);
        String _plus = ("implements " + _join);
        implementsClause = _plus;
      }
    }
    String out = "";
    final List<Rule> rules = rulesByConcept.getOrDefault(concept, CollectionLiterals.<Rule>newArrayList());
    final Consumer<EClass> _function_3 = (EClass c) -> {
      rules.addAll(rulesByConcept.getOrDefault(c, CollectionLiterals.<Rule>newArrayList()));
    };
    interfaces.forEach(_function_3);
    for (final Rule rule : rules) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private AdaptationRule before_");
      String _name = rule.getName();
      _builder.append(_name);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("private AdaptationRule specialize_");
      String _name_1 = rule.getName();
      _builder.append(_name_1);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append("private AdaptationRule after_");
      String _name_2 = rule.getName();
      _builder.append(_name_2);
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(out);
      _builder.newLineIfNotEmpty();
      _builder.append("public void add_before_");
      String _name_3 = rule.getName();
      _builder.append(_name_3);
      _builder.append("(AdaptationRule adapt){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("adapt.chain(before_");
      String _name_4 = rule.getName();
      _builder.append(_name_4, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("before_");
      String _name_5 = rule.getName();
      _builder.append(_name_5, "\t");
      _builder.append(" = adapt;");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("public void add_specialize_");
      String _name_6 = rule.getName();
      _builder.append(_name_6);
      _builder.append("(AdaptationRule adapt){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("adapt.chain(specialize_");
      String _name_7 = rule.getName();
      _builder.append(_name_7, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("specialize_");
      String _name_8 = rule.getName();
      _builder.append(_name_8, "\t");
      _builder.append(" = adapt;");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("public void add_after_");
      String _name_9 = rule.getName();
      _builder.append(_name_9);
      _builder.append("(AdaptationRule adapt){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("adapt.chain(after_");
      String _name_10 = rule.getName();
      _builder.append(_name_10, "\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("after_");
      String _name_11 = rule.getName();
      _builder.append(_name_11, "\t");
      _builder.append(" = adapt;");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("public AdaptationRule before_");
      String _name_12 = rule.getName();
      _builder.append(_name_12);
      _builder.append("(){return before_");
      String _name_13 = rule.getName();
      _builder.append(_name_13);
      _builder.append(";}");
      _builder.newLineIfNotEmpty();
      _builder.append("public AdaptationRule specialize_");
      String _name_14 = rule.getName();
      _builder.append(_name_14);
      _builder.append("(){return specialize_");
      String _name_15 = rule.getName();
      _builder.append(_name_15);
      _builder.append(";}");
      _builder.newLineIfNotEmpty();
      _builder.append("public AdaptationRule after_");
      String _name_16 = rule.getName();
      _builder.append(_name_16);
      _builder.append("(){return after_");
      String _name_17 = rule.getName();
      _builder.append(_name_17);
      _builder.append(";}");
      _builder.newLineIfNotEmpty();
      out = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _modelName = AdaptSemGenerator.getModelName();
    _builder_1.append(_modelName);
    _builder_1.append(".interfaces;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import fr.gjouneau.savm.framework.lang.semantics.SemanticsAdaptationInterface;");
    _builder_1.newLine();
    _builder_1.append("import ");
    String _modelName_1 = AdaptSemGenerator.getModelName();
    _builder_1.append(_modelName_1);
    _builder_1.append(".ASOS.AdaptationRule;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("public class ");
    String _interfaceNameFor_1 = NamingUtils.interfaceNameFor(concept.getName());
    _builder_1.append(_interfaceNameFor_1);
    _builder_1.append(" ");
    _builder_1.append(extendsClause);
    _builder_1.append(" ");
    _builder_1.append(implementsClause);
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append(out, "\t");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
  }
  
  public static String compileAbstractInterfaceFor(final EClass concept, final Map<EClass, List<Rule>> rulesByConcept) {
    final EList<EClass> supertypes = concept.getESuperTypes();
    final Function1<EClass, Boolean> _function = (EClass c) -> {
      return Boolean.valueOf(c.isInterface());
    };
    final Iterable<EClass> interfaces = IterableExtensions.<EClass>filter(supertypes, _function);
    String _xifexpression = null;
    boolean _isEmpty = supertypes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Function1<EClass, CharSequence> _function_1 = (EClass type) -> {
        return NamingUtils.interfaceNameFor(type.getName());
      };
      _xifexpression = IterableExtensions.<EClass>join(interfaces, ", ", _function_1);
    } else {
      _xifexpression = "SemanticsAdaptationInterface";
    }
    String extendsClause = _xifexpression;
    String out = "";
    final List<Rule> rules = rulesByConcept.getOrDefault(concept, CollectionLiterals.<Rule>newArrayList());
    for (final Rule rule : rules) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(out);
      _builder.newLineIfNotEmpty();
      _builder.append("public void add_before_");
      String _name = rule.getName();
      _builder.append(_name);
      _builder.append("(AdaptationRule adapt);");
      _builder.newLineIfNotEmpty();
      _builder.append("public void add_specialize_");
      String _name_1 = rule.getName();
      _builder.append(_name_1);
      _builder.append("(AdaptationRule adapt);");
      _builder.newLineIfNotEmpty();
      _builder.append("public void add_after_");
      String _name_2 = rule.getName();
      _builder.append(_name_2);
      _builder.append("(AdaptationRule adapt);");
      _builder.newLineIfNotEmpty();
      _builder.append("public AdaptationRule before_");
      String _name_3 = rule.getName();
      _builder.append(_name_3);
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("public AdaptationRule specialize_");
      String _name_4 = rule.getName();
      _builder.append(_name_4);
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("public AdaptationRule after_");
      String _name_5 = rule.getName();
      _builder.append(_name_5);
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      out = _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _modelName = AdaptSemGenerator.getModelName();
    _builder_1.append(_modelName);
    _builder_1.append(".interfaces;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import fr.gjouneau.savm.framework.lang.semantics.SemanticsAdaptationInterface;");
    _builder_1.newLine();
    _builder_1.append("import ");
    String _modelName_1 = AdaptSemGenerator.getModelName();
    _builder_1.append(_modelName_1);
    _builder_1.append(".ASOS.AdaptationRule;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("public interface ");
    String _interfaceNameFor = NamingUtils.interfaceNameFor(concept.getName());
    _builder_1.append(_interfaceNameFor);
    _builder_1.append(" extends ");
    _builder_1.append(extendsClause);
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append(out, "\t");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    _builder_1.newLine();
    return _builder_1.toString();
  }
}

package fr.irisa.diverse.adaptivesemantics.generator;

import com.google.common.base.Objects;
import fr.irisa.diverse.adaptivesemantics.generator.visitors.RefConfigurationCompiler;
import fr.irisa.diverse.adaptivesemantics.generator.visitors.SymbolPath;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class RuleUtils {
  private static String modelName;
  
  private static EPackage semanticdomain;
  
  public static void setModelName(final String name) {
    RuleUtils.modelName = name;
  }
  
  public static void setSemanticdomain(final EPackage domain) {
    RuleUtils.semanticdomain = domain;
  }
  
  public static String getModelName() {
    return RuleUtils.modelName;
  }
  
  public static EPackage getSemanticdomain() {
    return RuleUtils.semanticdomain;
  }
  
  public static boolean isValue(final EClass c) {
    return EcoreUtil.equals(RuleUtils.semanticdomain, c.getEPackage());
  }
  
  public static String generateInstanceOf(final RefConfiguration conf, final String name, final Map<SymbolDef, SymbolPath> ruleTable) {
    final RefConfigurationCompiler refconfCompiler = new RefConfigurationCompiler(ruleTable);
    String out = refconfCompiler.compile(conf);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(out);
    _builder.newLineIfNotEmpty();
    String _name = conf.getConcept().getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.append(name);
    _builder.append(" = ");
    String _lastRefConfig = refconfCompiler.getLastRefConfig();
    _builder.append(_lastRefConfig);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String toSetData(final String access, final String data) {
    String out = "";
    if ((access.contains("") && access.endsWith("()"))) {
      out = access.replace("data.get", "data.set");
      int _length = out.length();
      int _minus = (_length - 2);
      String _substring = out.substring(0, _minus);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(");
      _builder.append(data);
      _builder.append(")");
      String _plus = (_substring + _builder);
      out = _plus;
    }
    return out;
  }
  
  public static int compareRules(final Rule r1, final Rule r2) {
    for (int index = 0; (index < ((Object[])Conversions.unwrapArray(r1.getConclusion().getFrom().getChilds(), Object.class)).length); index++) {
      {
        final TermDef child1 = r1.getConclusion().getFrom().getChilds().get(index);
        final TermDef child2 = r2.getConclusion().getFrom().getChilds().get(index);
        if ((child1 instanceof DefConfiguration)) {
          if ((!(child2 instanceof DefConfiguration))) {
            return 1;
          }
        } else {
          if ((child2 instanceof DefConfiguration)) {
            return (-1);
          }
        }
      }
    }
    return 0;
  }
  
  public static List<Rule> getRulesFor(final EClass clazz, final Map<EClass, List<Rule>> rulesByConcept) {
    ArrayList<Rule> _arrayList = new ArrayList<Rule>();
    List<Rule> out = rulesByConcept.getOrDefault(clazz, _arrayList);
    final EList<EClass> superTypes = clazz.getESuperTypes();
    for (final EClass sup : superTypes) {
      out.addAll(RuleUtils.getRulesFor(sup, rulesByConcept));
    }
    return out;
  }
  
  public static boolean isOverlapping(final Rule r1, final Rule r2) {
    EClass _concept = r1.getConclusion().getFrom().getConcept();
    EClass _concept_1 = r2.getConclusion().getFrom().getConcept();
    boolean _notEquals = (!Objects.equal(_concept, _concept_1));
    if (_notEquals) {
      return false;
    }
    for (int index = 0; (index < ((Object[])Conversions.unwrapArray(r1.getConclusion().getFrom().getChilds(), Object.class)).length); index++) {
      {
        final TermDef child1 = r1.getConclusion().getFrom().getChilds().get(index);
        final TermDef child2 = r2.getConclusion().getFrom().getChilds().get(index);
        if ((child1 instanceof DefConfiguration)) {
          ((DefConfiguration)child1).getConcept().getEPackage().equals(RuleUtils.semanticdomain);
          if ((!(child2 instanceof DefConfiguration))) {
            return true;
          }
        } else {
          if ((child2 instanceof DefConfiguration)) {
            return false;
          }
        }
      }
    }
    return false;
  }
}

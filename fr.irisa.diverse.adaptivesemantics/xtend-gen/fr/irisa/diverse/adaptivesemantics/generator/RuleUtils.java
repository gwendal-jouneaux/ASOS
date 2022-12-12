package fr.irisa.diverse.adaptivesemantics.generator;

import com.google.common.base.Objects;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class RuleUtils {
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
          ((DefConfiguration)child1).getConcept().getEPackage().equals(AdaptSemGenerator.getSemanticDomain());
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

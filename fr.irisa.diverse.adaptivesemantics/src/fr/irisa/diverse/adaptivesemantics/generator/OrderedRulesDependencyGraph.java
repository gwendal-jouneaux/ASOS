package fr.irisa.diverse.adaptivesemantics.generator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClassifier;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;

public class OrderedRulesDependencyGraph {
	
	List<ConceptNode> concepts;
	List<RuleNode> rules;
	
	class ConceptNode{
		EClassifier concept;
		List<RuleNode> rules; // preserve ordering of rules
		
		ConceptNode(EClassifier concept, List<RuleNode> rules){
			this.concept = concept;
			this.rules = rules;
		}
	}
	
	class RuleNode{
		Rule rule;
		List<ConceptNode> dependencies;
		
		RuleNode(Rule rule,	List<ConceptNode> dependencies){
			this.rule = rule;
			this.dependencies = dependencies;
		}
		
		RuleNode(Rule rule){
			this.rule = rule;
			this.dependencies = new ArrayList<ConceptNode>();
		}
	}
	
	public class RuleComparator implements Comparator<Rule> {
	    public int compare(Rule r1, Rule r2) {
	    	List<TermDef> r1Childs = r1.getConclusion().getFrom().getChilds();
	    	List<TermDef> r2Childs = r2.getConclusion().getFrom().getChilds();
	    	
	    	for(var index = 0; index < r1Childs.size(); index++){
				TermDef child1 = r1Childs.get(index);
				TermDef child2 = r2Childs.get(index);
				if(child1 instanceof DefConfiguration){
					if(!(child2 instanceof DefConfiguration)){
						return 1;
					}
				} else {
					if(child2 instanceof DefConfiguration){
						return -1; 
					}
				}
			}
			return 0;
	    }
	}
	
	OrderedRulesDependencyGraph(Map<EClassifier, List<Rule>> rulesByConcept){
		this.concepts = new ArrayList<ConceptNode>();
		this.rules    = new ArrayList<RuleNode>();
		
		RuleComparator cmp = new RuleComparator();
		
		for (EClassifier concept : rulesByConcept.keySet()) {
			List<Rule> rules = rulesByConcept.get(concept);
			rules.sort(cmp);
			
			List<RuleNode> ruleNodes = rules.stream()    // Wrap Rules in the RuleNode
					.map(r -> new RuleNode(r))
					.collect(Collectors.toList());
			
			this.rules.addAll(ruleNodes);
			this.concepts.add(new ConceptNode(concept, ruleNodes));
		}
	} 
}
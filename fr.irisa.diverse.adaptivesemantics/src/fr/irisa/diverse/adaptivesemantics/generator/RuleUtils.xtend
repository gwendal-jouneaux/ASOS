package fr.irisa.diverse.adaptivesemantics.generator

import fr.irisa.diverse.adaptivesemantics.generator.visitors.RefConfigurationCompiler
import fr.irisa.diverse.adaptivesemantics.generator.visitors.SymbolPath
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass

class RuleUtils {
	
	static def boolean isValue(EClass c){
		c.EPackage.equals(AdaptSemGenerator.semanticDomain)
	}
	
	static def String generateInstanceOf(RefConfiguration conf, String name, Map<SymbolDef, SymbolPath> ruleTable){
		val refconfCompiler = new RefConfigurationCompiler(ruleTable)
		var out = refconfCompiler.compile(conf)
		
		return '''
		«out»
		«conf.concept.name» «name» = «refconfCompiler.lastRefConfig»;
		'''
	}
	
	static def int compareRules(Rule r1, Rule r2){
		for(var index = 0; index < r1.conclusion.from.childs.length; index++){
			val child1 = r1.conclusion.from.childs.get(index)
			val child2 = r2.conclusion.from.childs.get(index)
			if(child1 instanceof DefConfiguration){
				if(!(child2 instanceof DefConfiguration)){
					return 1
				}
			} else {
				if(child2 instanceof DefConfiguration){
					return -1
				}
			}
		}
		return 0
	}
	
	static def List<Rule> getRulesFor(EClass clazz, Map<EClass, List<Rule>> rulesByConcept){
			var out = rulesByConcept.getOrDefault(clazz, new ArrayList<Rule>())
			
			val superTypes = clazz.ESuperTypes
			
			for(sup : superTypes){
				out.addAll(getRulesFor(sup, rulesByConcept))
			}
			
			return out
	}
	
	static def boolean isOverlapping(Rule r1, Rule r2){
		// if different concept no overlap
		if(r1.conclusion.from.concept != r2.conclusion.from.concept){
			return false;
		}
		
		// traverse childs
		for(var index = 0; index < r1.conclusion.from.childs.length; index++){
			val child1 = r1.conclusion.from.childs.get(index)
			val child2 = r2.conclusion.from.childs.get(index)
			
			if(child1 instanceof DefConfiguration){
				child1.concept.EPackage.equals(AdaptSemGenerator.semanticDomain)
				if(!(child2 instanceof DefConfiguration)){
					return true
				}
			} else {
				if(child2 instanceof DefConfiguration){
					return false
				}
			}
		}
		return false
	}
	
	/*
	def boolean isLooping(ConclusionOutput to, EClassifier concept){
		if(!(to instanceof RefConfiguration)){
			return false
		}
		val config = to as RefConfiguration
		for (child : config.childs) {
			isLoopingRec(child, concept)
		}
		return true
	}
	
	def boolean isLoopingRec(TermRef to, EClassifier concept){		
		if(to instanceof RefConfiguration){
			if(to.concept == concept){
				return true
			} else {
				for (child : to.childs) {
					if(isLoopingRec(child, concept)) return true
				}
			}
		}
		return false
	}*/
	
}
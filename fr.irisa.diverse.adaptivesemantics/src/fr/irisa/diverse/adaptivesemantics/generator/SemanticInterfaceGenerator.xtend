package fr.irisa.diverse.adaptivesemantics.generator

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.generator.IFileSystemAccess2

class SemanticInterfaceGenerator {
	/**************************************************
	 * 
	 * 
	 *      GENERATE ADAPTATION INTERFACES FUNCTIONS
	 * 
	 * 
	 **************************************************/
	
	static def void compileInterfaces(Map<EClass, List<Rule>>  rulesByConcept, IFileSystemAccess2 fsa){
		val conceptsWithRules = rulesByConcept.keySet()
		val concepts = newHashSet
		for (concept : conceptsWithRules) {
			concepts.addAll(concept.EAllSuperTypes)
		}
		concepts.addAll(conceptsWithRules)
		
		for (concept : concepts) {
			val path = NamingUtils.interfacePathFor(AdaptSemGenerator.modelName, concept.name)
			if (concept.interface) {
				val interface = compileAbstractInterfaceFor(concept, rulesByConcept);
				fsa.generateFile(path, interface)
			} else {
				val interface = compileInterfaceFor(concept, rulesByConcept);
				fsa.generateFile(path, interface)
			}
		}
	}
	
	static def String compileInterfaceFor(EClass concept, Map<EClass, List<Rule>>  rulesByConcept){
		val supertypes = concept.ESuperTypes
		val superClass = supertypes.filter[c | ! c.interface].head
		val interfaces = supertypes.filter[c | c.interface && (superClass === null || ! superClass.EAllSuperTypes.contains(c))]
		
		val extendsClause = if(superClass === null) "" else "extends " + NamingUtils.interfaceNameFor(superClass.name)
		
		var implementsClause = ""
		if(supertypes.empty) {
			implementsClause = "implements SemanticsAdaptationInterface"	
		} else if (! interfaces.empty) {
			implementsClause = "implements " + interfaces.join(", ", [type | NamingUtils.interfaceNameFor(type.name)])
		}
		
		
		
		var out = ""
		
		val rules = rulesByConcept.getOrDefault(concept, newArrayList)
		interfaces.forEach[c | rules.addAll(rulesByConcept.getOrDefault(c, newArrayList))]
		
		for (rule : rules) {
			out = '''
			private AdaptationRule before_«rule.name»;
			private AdaptationRule specialize_«rule.name»;
			private AdaptationRule after_«rule.name»;
			«out»
			public void add_before_«rule.name»(AdaptationRule adapt){
				adapt.chain(before_«rule.name»);
				before_«rule.name» = adapt;
			}
			public void add_specialize_«rule.name»(AdaptationRule adapt){
				adapt.chain(specialize_«rule.name»);
				specialize_«rule.name» = adapt;
			}
			public void add_after_«rule.name»(AdaptationRule adapt){
				adapt.chain(after_«rule.name»);
				after_«rule.name» = adapt;
			}
			public AdaptationRule before_«rule.name»(){return before_«rule.name»;}
			public AdaptationRule specialize_«rule.name»(){return specialize_«rule.name»;}
			public AdaptationRule after_«rule.name»(){return after_«rule.name»;}
			'''
		}
		
		return '''
		package «AdaptSemGenerator.modelName».interfaces;
		
		import fr.gjouneau.savm.framework.lang.semantics.SemanticsAdaptationInterface;
		import «AdaptSemGenerator.modelName».ASOS.AdaptationRule;
		
		public class «NamingUtils.interfaceNameFor(concept.name)» «extendsClause» «implementsClause» {
			«out»
		}
		'''
	}
	
	static def String compileAbstractInterfaceFor(EClass concept, Map<EClass, List<Rule>>  rulesByConcept){
		val supertypes = concept.ESuperTypes
		val interfaces = supertypes.filter[c | c.interface]
		var extendsClause = if(!supertypes.empty) interfaces.join(", ", [type | NamingUtils.interfaceNameFor(type.name)]) else "SemanticsAdaptationInterface"
		
		
		
		var out = ""
		val rules = rulesByConcept.getOrDefault(concept, newArrayList)
		
		for (rule : rules) {
			out = '''
			«out»
			public void add_before_«rule.name»(AdaptationRule adapt);
			public void add_specialize_«rule.name»(AdaptationRule adapt);
			public void add_after_«rule.name»(AdaptationRule adapt);
			public AdaptationRule before_«rule.name»();
			public AdaptationRule specialize_«rule.name»();
			public AdaptationRule after_«rule.name»();
			'''
		}
		
		return '''
		package «AdaptSemGenerator.modelName».interfaces;
		
		import fr.gjouneau.savm.framework.lang.semantics.SemanticsAdaptationInterface;
		import «AdaptSemGenerator.modelName».ASOS.AdaptationRule;
		
		public interface «NamingUtils.interfaceNameFor(concept.name)» extends «extendsClause» {
			«out»
		}
		'''
	}
	
}
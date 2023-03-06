package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
import java.util.Map
import org.eclipse.emf.ecore.EClass
import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils

class ConfigurationComparator {
	val Map<SymbolDef, SymbolPath> ruleTable
	
	new(Map<SymbolDef, SymbolPath> table){
		ruleTable = table
	}
	
	def String updateNode(DefConfiguration deff, RefConfiguration ref){
		var out = ""
		
		val defChilds = deff.childs
		val refChilds = ref.childs
		val len = defChilds.size
		
		val concept = ref.concept
		val features = concept.EAllStructuralFeatures
		
		for (var i = 0; i < len; i++) {
			if(! equals(defChilds.get(i), refChilds.get(i))){
				val feature = features.get(i)
				val child = refChilds.get(i)
				val refconfCompiler = new RefConfigurationCompiler(ruleTable)
				
				switch(child){
					RefConfiguration:{
						val create = refconfCompiler.compile(child)
						out =  '''
						«out»
						«create»
						«NamingUtils.computedNameFor(feature.name)» = «refconfCompiler.lastRefConfig»;
						'''	
					}
					
					default:{
						out =  '''
						«out»
						«NamingUtils.computedNameFor(feature.name)» = «refconfCompiler.compile(child)»;
						'''	
					}
				}
				
				return out
			}
		}
		
		return out
	}
	
	def dispatch boolean equals(DefConfiguration deff, TermRef ref){
		return false
	}
	
	def dispatch boolean equals(DefConfiguration deff, RefConfiguration ref){
		val defChilds = deff.childs
		val refChilds = ref.childs
		val len = defChilds.size
		
		if(deff.concept.equals(ref.concept) && len != refChilds.size) return false
		
		for (var i = 0; i < len; i++) {
			if(! equals(defChilds.get(i), refChilds.get(i))){
				return false
			}
		}
		return true
	}
	
	def dispatch boolean equals(VoidList deff, TermRef ref){
		return false
	}
	
	def dispatch boolean equals(VoidList deff, VoidList ref){
		return true
	}
	
	def dispatch boolean equals(ListDef deff, TermRef ref){
		return false
	}
	
	def dispatch boolean equals(ListDef deff, ListRef ref){
		equals(deff.head, ref.head) && equals(deff.tail, ref.tail)
	}
	
	def dispatch boolean equals(SymbolDef deff, TermRef ref){
		return false
	}
	
	def dispatch boolean equals(SymbolDef deff, SymbolRef ref){
		return deff == ref.def
	}
}
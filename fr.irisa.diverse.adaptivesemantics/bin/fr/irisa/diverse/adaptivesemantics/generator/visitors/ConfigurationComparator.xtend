package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil

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
				val defChild = defChilds.get(i)
				val refChild = refChilds.get(i)
				val refconfCompiler = new RefConfigurationCompiler(ruleTable)
				
				switch(refChild){
					RefConfiguration:{
						val create = refconfCompiler.compile(refChild)
						out =  '''
						«out»
						«create»
						«NamingUtils.computedNameFor(feature.name)» = «refconfCompiler.lastRefConfig»;
						'''	
					}
					
					default:{
						if(defChild instanceof ListDef && 
							refChild instanceof SymbolRef && 
							EcoreUtil.equals((refChild as SymbolRef).def, (defChild as ListDef).tail)
						){
							out =  '''
							«out»
							«NamingUtils.indexNameFor(feature.name)»++;
							'''	
						} else {
							out =  '''
							«out»
							«NamingUtils.computedNameFor(feature.name)» = «refconfCompiler.compile(refChild)»;
							'''	
						}
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
package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class RefConfigurationCompiler {
	
	static val Map<EClass,Integer> varIndexes = newHashMap
	val Map<SymbolDef, SymbolPath> ruleTable
	val String modelName
	val EPackage semanticdomain;
	var lastRefConfig = ""
	
	new(Map<SymbolDef, SymbolPath> table, String modelname, EPackage sd){
		ruleTable = table
		semanticdomain = sd
		modelName = modelname
	}
	
	def dispatch String compile(RefConfiguration node){
		var out = ""
		
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		val classindex = varIndexes.getOrDefault(concept, 0)
		varIndexes.put(concept, classindex+1)
		
		if(RuleUtils.isValue(concept)){
			out = '''
			«concept.name» «concept.name.toFirstLower»«classindex» = «semanticdomain.name»Factory.eINSTANCE.create«concept.name»();
			'''
		} else {
			out = '''
			«concept.name» «concept.name.toFirstLower»«classindex» = «modelName.toFirstUpper»Factory.eINSTANCE.create«concept.name»();
			'''
		}
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val featureSetter = ".set" + features.get(i).name.toFirstUpper
			var featureType = features.get(i).EType.instanceClassName
			var needsCopy = false
			if (featureType === null) {
				featureType = features.get(i).EType.name 
				needsCopy = true
			}
			
			if(child instanceof SymbolRef){
				out = '''
				«out»
				«IF needsCopy»
				«concept.name.toFirstLower»«classindex»«featureSetter»(EcoreUtil.copy((«featureType») «child.compile»));
				«ELSE»
				«concept.name.toFirstLower»«classindex»«featureSetter»((«featureType») «child.compile»);
				«ENDIF»
				'''
			} else if (child instanceof RefConfiguration){
				out = '''
				«child.compile»
				
				«out»
				«concept.name.toFirstLower»«classindex»«featureSetter»((«featureType») «lastRefConfig»);
				'''
			} else if (child instanceof ListRef){
				out = '''
				«out»
				«concept.name.toFirstLower»«classindex»«featureSetter»((«featureType») «child.compile»);
				'''
			}
		}
		
		lastRefConfig = concept.name.toFirstLower + classindex
		
		return out
	}
	
	def dispatch String compile(VoidList node){
		return "new ArrayList()"
	}
	
	def dispatch String compile(ListRef node){
		return node.tail.compile
	}
	
	def dispatch String compile(SymbolRef node){
		val paths = ruleTable.get(node.def)
		if(paths !== null){
			return '''«paths.unknownForm»'''
		} else {
			return '''«node.def.name»'''
		}
	}
	
	def String getLastRefConfig(){
		return lastRefConfig
	}
}
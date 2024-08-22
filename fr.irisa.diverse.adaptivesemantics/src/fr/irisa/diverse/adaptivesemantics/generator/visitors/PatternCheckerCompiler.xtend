package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils
import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
import org.eclipse.emf.ecore.EStructuralFeature

class PatternCheckerCompiler {
	
	val condName = "validPattern"
	static var patternNumber = 0
	
	def String generateInputCheck(DefConfiguration pattern){
		var out = ""
		
		val concept = pattern.concept
		val features = concept.EAllStructuralFeatures
		val childs = pattern.childs
		val len = childs.size
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val featureGetter = ".get" + features.get(i).name.toFirstUpper + "()"
			out = '''«out»«child.compile("node" + featureGetter, '''data.get«NamingUtils.computedNameFor(features.get(i).name)»()''', features.get(i))»'''
		}
		patternNumber++
		return '''
		boolean «condName»Input«patternNumber» = true«out»;
		if(«condName»Input«patternNumber»)
		'''
	}
	
	def String generatePremiseCheck(DefConfiguration pattern, String computedMember){
		patternNumber++
		return '''
		boolean «condName»Premise«patternNumber» = true«pattern.compile(computedMember, computedMember, null)»;
		if(«condName»Premise«patternNumber»)
		'''
	}
	
	def String generateConditionCheck(DefConfiguration pattern, String domainAccess){
		return '''(true«pattern.compile(domainAccess, domainAccess, null)»)'''
	}
	
	def dispatch String compile(DefConfiguration node, String termPath, String valuePath, EStructuralFeature feature){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		
		if(RuleUtils.isValue(concept)){
			var out = ''' && («valuePath» instanceof «concept.name»)'''		
			
			for (var i = 0; i < len; i++) {
				val child = childs.get(i)
				val featureGetter = ".get" + features.get(i).name.toFirstUpper + "()"
				
				out = '''«out»«child.compile("((" + concept.name + ") " + valuePath + ")" + featureGetter, "((" + concept.name + ") " + valuePath + ")" + featureGetter, features.get(i))»'''
			}
			
			return out	
		} else {
			var out = ''' && («termPath» instanceof «concept.name»)'''		
			
			for (var i = 0; i < len; i++) {
				val child = childs.get(i)
				val featureGetter = ".get" + features.get(i).name.toFirstUpper + "()"
				
				out = '''«out»«child.compile("((" + concept.name + ") " + termPath + ")" + featureGetter, "((" + concept.name + ") " + termPath + ")" + featureGetter, features.get(i))»'''
			}
			
			return out
		}
	}
	
	def dispatch String compile(VoidList node, String termPath, String valuePath, EStructuralFeature feature){
		return ''' && («termPath» instanceof List && «termPath».size() <= data.get«NamingUtils.indexNameFor(feature.name)»())'''
	}
	
	def dispatch String compile(ListDef node, String termPath, String valuePath, EStructuralFeature feature){
		return ''' && («termPath» instanceof List && «termPath».size() > data.get«NamingUtils.indexNameFor(feature.name)»())«node.head.compile(
			termPath + ".get(data.get"+NamingUtils.indexNameFor(feature.name)+"())", 
			valuePath, 
			feature)»'''
	}
	
	def dispatch String compile(SymbolDef node, String termPath, String valuePath, EStructuralFeature feature){
		return ""
	}
	
}
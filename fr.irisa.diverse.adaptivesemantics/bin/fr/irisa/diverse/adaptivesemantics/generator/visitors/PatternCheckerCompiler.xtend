package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList

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
			
			if (child instanceof DefConfiguration){
				out = '''«out»«child.compile(NamingUtils.computedNameFor(features.get(i).name))»'''
			} else {
				out = '''«out»«child.compile("node" + featureGetter)»'''
			}
		}
		patternNumber++
		return '''
		boolean «condName»«patternNumber» = true«out»;
		if(«condName»«patternNumber»)
		'''
	}
	
	def String generatePremiseCheck(DefConfiguration pattern, String computedMember){
		patternNumber++
		return '''
		boolean «condName»«patternNumber» = true«pattern.compile(computedMember)»;
		if(«condName»«patternNumber»)
		'''
	}
	
	def String generateConditionCheck(DefConfiguration pattern, String domainAccess){
		return '''(true«pattern.compile(domainAccess)»)'''
	}
	
	def dispatch String compile(DefConfiguration node, String path){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		var out = ''' && («path» instanceof «concept.name»)'''		
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val featureGetter = ".get" + features.get(i).name.toFirstUpper + "()"
			
			out = '''«out»«child.compile("((" + concept.name + ") " + path + ")" + featureGetter)»'''
		}
		
		return out
	}
	
	def dispatch String compile(VoidList node, String path){
		return ''' && («path» instanceof List && «path».isEmpty())'''
	}
	
	def dispatch String compile(ListDef node, String path){
		return ''' && («path» instanceof List)«node.head.compile(path + ".get(0)")»'''
	}
	
	def dispatch String compile(SymbolDef node, String path){
		return ""
	}
	
}
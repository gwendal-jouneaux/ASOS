package fr.irisa.diverse.adaptivesemantics.generator

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import java.util.HashMap
import java.util.Map

class NamingUtils {
	
	static def String operationNameFor(String conceptName) {
		conceptName + 'Op'
	}
	
	static def String interfaceNameFor(String conceptName) {
		conceptName + 'Interface'
	}
	
	static def String operationPathFor(String modelName, String conceptName) {
		modelName + "/operations/" + operationNameFor(conceptName) + '.java'
	}
	
	static def String interfacePathFor(String modelName, String conceptName) {
		modelName + "/interfaces/" + interfaceNameFor(conceptName) + '.java'
	}
	
	static def String nameOf(Model model){
		model.importURI.substring(model.importURI.lastIndexOf('/')+1, model.importURI.lastIndexOf('.'))
	}
	
	static def String computedNameFor(SymbolRef symbol){
		"computed_" + symbol.def.name
	}
	
	static def Map<SymbolDef, String> getPathForSymbols(DefConfiguration conf){
		val concept = conf.concept
		val features = concept.EAllStructuralFeatures
		val childs = conf.childs
		val len = childs.size
		
		val out = new HashMap
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val featureGetter = ".get" + features.get(i).name.toFirstUpper + "()"
			
			if(child instanceof SymbolDef){
				out.put(child, featureGetter)
			} else if (child instanceof DefConfiguration){
				if(! child.concept.EPackage.equals(AdaptSemGenerator.semanticDomain)){
					val map = getPathForSymbols(child)
					for (symbol : map.keySet) {
						val s = map.get(symbol)
						map.put(symbol, featureGetter + s)	
					}
					out.putAll(map)
				} else {
					val map = getPathForSymbols(child)
					for (symbol : map.keySet) {
						val s = map.get(symbol)
						map.put(symbol, "computed_" + features.get(i).name + s)	
					}
					out.putAll(map)
				}
			} else if (child instanceof ListDef){
				val head = child.head
				val tail = child.tail
				
				val headGetter = ".get(" + features.get(i).name + "_index)"
				val tailGetter = ".stream().skip(1).collect(Collectors.toCollection(BasicEList::new))"
				
				out.put(tail, featureGetter + tailGetter)
				
				if(head instanceof SymbolDef){
					out.put(head, featureGetter + headGetter)
				} else if (head instanceof DefConfiguration){
					val map = getPathForSymbols(head)
					for (symbol : map.keySet) {
						val s = map.get(symbol)
						map.put(symbol, featureGetter + headGetter + s)	
					}
					out.putAll(map)
				}
			}
		}
		
		
		return out
	}
}
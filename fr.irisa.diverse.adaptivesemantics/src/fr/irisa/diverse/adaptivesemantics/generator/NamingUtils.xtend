package fr.irisa.diverse.adaptivesemantics.generator

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import java.util.HashMap
import java.util.Map
import fr.irisa.diverse.adaptivesemantics.generator.visitors.SymbolPath

class NamingUtils {
	
	static def String operationNameFor(String conceptName) {
		conceptName + 'Op'
	}
	
	static def String interfaceNameFor(String conceptName) {
		conceptName + 'Interface'
	}
	
	static def String moduleNameFor(String conceptName) {
		conceptName + 'Module'
	}
	
	static def String adaptationNameFor(String conceptName) {
		conceptName + 'AdaptationRule'
	}
	
	static def String operationPathFor(String modelName, String conceptName) {
		modelName + "/operations/" + operationNameFor(conceptName) + '.java'
	}
	
	static def String interfacePathFor(String modelName, String conceptName) {
		modelName + "/interfaces/" + interfaceNameFor(conceptName) + '.java'
	}
	
	static def String modulePathFor(String modelName, String conceptName) {
		modelName + "/adaptations/modules/" + moduleNameFor(conceptName) + '.java'
	}
	
	static def String adaptationPathFor(String modelName, String conceptName) {
		modelName + "/adaptations/rules/" + adaptationNameFor(conceptName) + '.java'
	}
	
	static def String indexNameFor(String feature){
		return "index_" + feature
	}
	
	static def String nameOf(Model model){
		model.importURI.substring(model.importURI.lastIndexOf('/')+1, model.importURI.lastIndexOf('.'))
	}
	
	static def String computedNameFor(SymbolRef symbol){
		computedNameFor(symbol.def.name)
	}
	
	static def String computedNameFor(String name){
		"computed_" + name
	}
	
	static def String localNameFor(String name){
		"local_" + name
	}
	
	static def String pathFor(DomainAccessExpression fqn, Map<SymbolDef, SymbolPath> ruleTable){
		if(fqn instanceof SymbolDef){
			return ruleTable.get(fqn).unknownForm
		}
		if(fqn instanceof SemanticDomainAccess){
			return pathFor(fqn.reciever, ruleTable) + ".get" + fqn.field.toFirstUpper + "()"
		}
		if(fqn instanceof Self){
			return "node"
		}
	}
	
	static def Map<SymbolDef, String> getPathForSymbols(DefConfiguration conf){
		val concept = conf.concept
		val features = concept.EAllStructuralFeatures
		val childs = conf.childs
		val len = childs.size
		
		val out = new HashMap
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val featureGetter = "node.get" + features.get(i).name.toFirstUpper + "()"
			val computedVar = computedNameFor(features.get(i).name)
			
			if(child instanceof SymbolDef){
				val conditionalAccess = "(" + computedVar + " == null ? " + featureGetter + " : " + computedVar + ")"
				out.put(child, conditionalAccess)
			} else if (child instanceof DefConfiguration){
				if(! RuleUtils.isValue(child.concept)){
					val map = getPathForSymbolsRec(child)
					for (symbol : map.keySet) {
						val s = map.get(symbol)
						map.put(symbol, featureGetter + s)	
					}
					out.putAll(map)
				} else {
					val type = child.concept.name
					val castedComputedVar = '''((«type») «computedVar»)'''
					val map = getPathForSymbolsRec(child)
					for (symbol : map.keySet) {
						val s = map.get(symbol)
						map.put(symbol, castedComputedVar + s)	
					}
					out.putAll(map)
				}
			} else if (child instanceof ListDef){
				val head = child.head
				val tail = child.tail
				
				val headGetter = ".get(" + features.get(i).name + "_index)"
				//val tailGetter = ".stream().skip(1).collect(Collectors.toCollection(BasicEList::new))"
				val tailGetter = ""
				
				out.put(tail, featureGetter + tailGetter)
				
				if(head instanceof SymbolDef){
					out.put(head, featureGetter + headGetter)
				} else if (head instanceof DefConfiguration){
					val map = getPathForSymbolsRec(head)
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
	
	static def Map<SymbolDef, String> getPathForSymbolsRec(DefConfiguration conf){
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
				val map = getPathForSymbols(child)
				for (symbol : map.keySet) {
					val s = map.get(symbol)
					map.put(symbol, featureGetter + s)	
				}
				out.putAll(map)
			} else if (child instanceof ListDef){
				val head = child.head
				val tail = child.tail
				
				val headGetter = ".get(" + features.get(i).name + "_index)"
				//val tailGetter = ".stream().skip(1).collect(Collectors.toCollection(BasicEList::new))"
				val tailGetter = ""
				
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
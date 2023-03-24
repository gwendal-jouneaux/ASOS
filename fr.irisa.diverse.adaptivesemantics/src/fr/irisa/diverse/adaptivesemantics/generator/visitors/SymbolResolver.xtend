package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
import java.util.Map
import org.eclipse.emf.ecore.EStructuralFeature

class SymbolResolver {
	
	val Map<EStructuralFeature, SymbolPath> featureAccessors = newHashMap;
	val Map<SymbolDef, EStructuralFeature> symbolFeature = newHashMap;
	val Map<SymbolDef, SymbolPath> symbolTable = newHashMap;
	
	def void resolveFor(Rule node){
		val concept = node.conclusion.from.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.conclusion.from.childs
		val len = childs.size
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			val sp = new SymbolPath("node", "", "")
			child.resolveFirst(features.get(i), sp)
		}
				
		for(premise : node.premises){
			premise.propagate()
		}
		
		for (symbol : symbolFeature.keySet) {
			val feature = symbolFeature.get(symbol)
			val paths = featureAccessors.get(feature)
			symbolTable.put(symbol, paths)
		}
	}
	
	def dispatch void resolve(DefConfiguration node, EStructuralFeature feature, SymbolPath sp){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		val type = node.concept.name
		val newSymbolPath = new SymbolPath('''((«type») «sp.termForm + featureGetter»)''' , '''((«type») «sp.valueForm + featureGetter»)''', '''((«type») «sp.unknownForm + featureGetter»)''')
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			child.resolve(features.get(i), newSymbolPath)
		}
	}
	
	def dispatch void resolve(VoidList node, EStructuralFeature feature, SymbolPath sp){}
	
	def dispatch void resolve(ListDef node, EStructuralFeature feature, SymbolPath sp){
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		val headGetter = featureGetter+".get("+NamingUtils.indexNameFor(feature.name)+")"
		val tailGetter = featureGetter
		var headSymbolPath = new SymbolPath(sp.termForm + headGetter , sp.valueForm + headGetter, sp.unknownForm + headGetter)
		var tailSymbolPath = new SymbolPath(sp.termForm + tailGetter , sp.valueForm + tailGetter, sp.unknownForm + tailGetter)
		
		if(node.head instanceof SymbolDef){
//			featureAccessors.put(feature, headSymbolPath)
//			symbolFeature.put(node.head as SymbolDef, feature)
			symbolTable.put(node.head as SymbolDef, headSymbolPath)
		} else {
			val head = node.head as DefConfiguration
			val concept = head.concept
			val features = concept.EAllStructuralFeatures
			val childs = head.childs
			val len = childs.size
			
			val type = concept.name
			val newSymbolPath = new SymbolPath('''((«type») «headSymbolPath.termForm»)''' , '''((«type») «headSymbolPath.valueForm»)''', '''((«type») «headSymbolPath.unknownForm»)''')
			
			for (var i = 0; i < len; i++) {
				val child = childs.get(i)
				child.resolve(features.get(i), newSymbolPath)
			}
		}
		
//		featureAccessors.put(feature, tailSymbolPath)
//		symbolFeature.put(node.tail, feature)
		symbolTable.put(node.tail as SymbolDef, tailSymbolPath)
	}
	
	def dispatch void resolve(SymbolDef node, EStructuralFeature feature, SymbolPath sp){
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		var newSymbolPath = new SymbolPath(sp.termForm + featureGetter , sp.valueForm + featureGetter, sp.unknownForm + featureGetter)
		
		featureAccessors.put(feature, newSymbolPath)
		symbolFeature.put(node, feature)
	}
	
	def dispatch void resolveFirst(DefConfiguration node, EStructuralFeature feature, SymbolPath sp){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		val type = node.concept.name
		var newSymbolPath = new SymbolPath(
				'''((«type») «NamingUtils.computedNameFor(feature.name)»)''' , 
				'''((«type») «NamingUtils.computedNameFor(feature.name)»)''', 
				'''((«type») «NamingUtils.computedNameFor(feature.name)»)''')
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			child.resolve(features.get(i), newSymbolPath)
		}
	}
	
	def dispatch void resolveFirst(VoidList node, EStructuralFeature feature, SymbolPath sp){}
	
	def dispatch void resolveFirst(ListDef node, EStructuralFeature feature, SymbolPath sp){
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		val headGetter = ".get("+NamingUtils.indexNameFor(feature.name)+")"
		val tailGetter = ""
		
		var firstSp = new SymbolPath(
				'''«sp.termForm + featureGetter»''' , 
				'''«NamingUtils.computedNameFor(feature.name)»''', 
				'''(«NamingUtils.computedNameFor(feature.name)» == null ? «sp.termForm + featureGetter» : «NamingUtils.computedNameFor(feature.name)»)''')
		
		var headSymbolPath = new SymbolPath(firstSp.termForm + headGetter , firstSp.valueForm + headGetter, firstSp.unknownForm + headGetter)
		var tailSymbolPath = new SymbolPath(firstSp.termForm + tailGetter , firstSp.valueForm + tailGetter, firstSp.unknownForm + tailGetter)
		
		if(node.head instanceof SymbolDef){
//			featureAccessors.put(feature, headSymbolPath)
//			symbolFeature.put(node.head as SymbolDef, feature)
			symbolTable.put(node.head as SymbolDef, headSymbolPath)
		} else {
			val head = node.head as DefConfiguration
			val concept = head.concept
			val features = concept.EAllStructuralFeatures
			val childs = head.childs
			val len = childs.size
			
			val type = concept.name
			val newSymbolPath = new SymbolPath('''((«type») «headSymbolPath.termForm»)''' , '''((«type») «headSymbolPath.valueForm»)''', '''((«type») «headSymbolPath.unknownForm»)''')
			
			for (var i = 0; i < len; i++) {
				val child = childs.get(i)
				child.resolve(features.get(i), newSymbolPath)
			}
		}
		
//		featureAccessors.put(feature, tailSymbolPath)
//		symbolFeature.put(node.tail, feature)
		symbolTable.put(node.tail as SymbolDef, tailSymbolPath)
	}
	
	def dispatch void resolveFirst(SymbolDef node, EStructuralFeature feature, SymbolPath sp){
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		var newSymbolPath = new SymbolPath(
				'''«sp.termForm + featureGetter»''' , 
				'''«NamingUtils.computedNameFor(feature.name)»''', 
				'''(«NamingUtils.computedNameFor(feature.name)» == null ? «sp.termForm + featureGetter» : «NamingUtils.computedNameFor(feature.name)»)''')
		
		featureAccessors.put(feature, newSymbolPath)
		symbolFeature.put(node, feature)
	}
	
	def void propagate(Premise node){
		val feature = symbolFeature.get(node.from.def)
		
		// For sure not computed here (premise)
		val sp = featureAccessors.get(feature)
		val newSP = new SymbolPath(sp.termForm, sp.valueForm, sp.termForm)
		featureAccessors.put(feature, newSP)
		
		node.to.propagateFirst(feature, sp)
	}
	
	
	
	
	
	def dispatch void propagate(DefConfiguration node, EStructuralFeature feature, SymbolPath sp){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		val type = node.concept.name
		val newSymbolPath = new SymbolPath('''((«type») «sp.termForm + featureGetter»)''' , '''((«type») «sp.valueForm + featureGetter»)''', '''((«type») «sp.unknownForm + featureGetter»)''')
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			child.propagate(features.get(i), newSymbolPath)
		}
	}
	
	def dispatch void propagate(VoidList node, EStructuralFeature feature, SymbolPath sp){}
	
	def dispatch void propagate(ListDef node, EStructuralFeature feature, SymbolPath sp){}
	
	def dispatch void propagate(SymbolDef node, EStructuralFeature feature, SymbolPath sp){
		val featureGetter = ".get" + feature.name.toFirstUpper + "()"
		var newSymbolPath = new SymbolPath(sp.termForm + featureGetter , sp.valueForm + featureGetter, sp.unknownForm + featureGetter)
		
		symbolTable.put(node, newSymbolPath)
	}
	
	def dispatch void propagateFirst(DefConfiguration node, EStructuralFeature feature, SymbolPath sp){
		val concept = node.concept
		val features = concept.EAllStructuralFeatures
		val childs = node.childs
		val len = childs.size
		
		val type = node.concept.name
		var newSymbolPath = new SymbolPath(
				'''((«type») «NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»)''' , 
				'''((«type») «NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»)''', 
				'''((«type») «NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»)''')
		
		for (var i = 0; i < len; i++) {
			val child = childs.get(i)
			child.propagate(features.get(i), newSymbolPath)
		}
	}
	
	def dispatch void propagateFirst(SymbolDef node, EStructuralFeature feature, SymbolPath sp){
		var newSymbolPath = new SymbolPath(
				'''«NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»''' , 
				'''«NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»''', 
				'''«NamingUtils.localNameFor(NamingUtils.computedNameFor(feature.name))»''')
		
		symbolTable.put(node, newSymbolPath)
	}
	
	
	
	
	
	def Map<SymbolDef, SymbolPath> getSymbolTable(){
		return symbolTable
	}
}
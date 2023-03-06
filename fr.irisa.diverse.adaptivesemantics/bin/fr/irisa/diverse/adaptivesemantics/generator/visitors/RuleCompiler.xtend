package fr.irisa.diverse.adaptivesemantics.generator.visitors

import fr.irisa.diverse.adaptivesemantics.generator.AdaptSemGenerator
import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils
import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.And
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BoolConstant
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Div
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DoubleConstant
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Equal
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Expr
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.IntConstant
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Less
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.LessEq
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Minus
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Mult
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Not
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.NotEqual
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Or
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Plus
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.StringConstant
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration

class RuleCompiler {
	
	val Map<SymbolDef, SymbolPath> ruleTable
	
	new(Map<SymbolDef, SymbolPath> table){
		ruleTable = table
	}
	
	def dispatch String compile(Rule node){
		val effect = node.compileEffect
		val core = '''
		if(config.before_«node.name»() != null){
			config.before_«node.name»().adapt(vis, node, execCtx, config);
		}
		
		if(config.specialize_«node.name»() != null){
			config.specialize_«node.name»().adapt(vis, node, execCtx, config);
		} else {
			«effect»
		}
		
		if(config.after_«node.name»() != null){
			config.after_«node.name»().adapt(vis, node, execCtx, config);
		}
		
		if(result != null) return result;
		'''
		
		val out = node.compileGuards(core)
		return out
	}
	
	def String compileEffect(Rule node){
		var out = ""
		out = out.append(node.inputs)
		out = out.append(node.bindings)
		out = out.append(node.conclusion)
		out = out.append(node.outputs)
		return out
	}
	
	def String compileGuards(Rule node, String effect){
		var out = effect
		for (resolve : node.premises.reverse) {
			out = '''
			«resolve.compile»
				{
					«out»
				}
			}
			'''
		}
		
		for (cond : node.conditions.reverse) {
			out = '''
			«cond.compile»{
				«out»
			}
			'''
		}
		
		val patternCompiler = new PatternCheckerCompiler()
		out = '''
		«patternCompiler.generateInputCheck(node.conclusion.from)»{
			«out»
		}
		'''
		
		return out
	}
	
	def dispatch String compile(Premise node){
		val patternBuilder = new PatternCheckerCompiler()
		var expectedPattern = ""
		if(node.to instanceof DefConfiguration){
			val pattern = node.to as DefConfiguration
			expectedPattern = patternBuilder.generatePremiseCheck(pattern, NamingUtils.localNameFor(ruleTable.get(node.from.def).valueForm))
			return '''
			if(«ruleTable.get(node.from.def).valueForm» == null){
				Object «NamingUtils.localNameFor(ruleTable.get(node.from.def).valueForm)» = ((Node) «ruleTable.get(node.from.def).termForm»).accept(vis, execCtx);
				«expectedPattern»
					if(«IF ! node.termination»!«ENDIF»(«NamingUtils.localNameFor(ruleTable.get(node.from.def).valueForm)» instanceof Termination))
			'''
		} else { // SymbolDef then
			return '''
			if(«ruleTable.get(node.from.def).valueForm» == null){
				Object «NamingUtils.localNameFor(ruleTable.get(node.from.def).valueForm)» = ((Node) «ruleTable.get(node.from.def).termForm»).accept(vis, execCtx);
				if(«IF ! node.termination»!«ENDIF»(«NamingUtils.localNameFor(ruleTable.get(node.from.def).valueForm)» instanceof Termination))
			'''
		}
	}
	
	def dispatch String compile(Conclusion node){
		if(node.to instanceof RefConfiguration){
			val conf = node.to as RefConfiguration
			if(RuleUtils.isValue(conf.concept)){
				return '''
				«RuleUtils.generateInstanceOf(conf, "out", ruleTable)»
				result = out;
				'''
			} else if (conf.concept.equals(node.from.concept)){				
				val cp = new ConfigurationComparator(ruleTable)
				
				return cp.updateNode(node.from, conf)
			} else (
				return '''
				«RuleUtils.generateInstanceOf(conf, "out", ruleTable)»
				result = ((Node)out).accept(vis, execCtx);
				'''
			)
		}
		if(node.to instanceof SymbolRef){
			val symbol = node.to as SymbolRef
			return '''
			Object out = «symbol.compile»;
			if(! ((EObject) out).eClass().getEPackage().equals(«AdaptSemGenerator.semanticDomain.name»Package.eINSTANCE)){
				result = ((Node)out).accept(vis, execCtx);
			} else {
				result = out;
			}
			'''
		}
	}
	
	def dispatch String compile(Condition node){
		return '''
		if(«(node.cond as Expr).compile»)
		'''
	}
	
	def dispatch String compile(Binding node){
		val assignee = node.assignee
		val assignable  = node.expr
		
		if(assignable instanceof RefConfiguration){
			if(assignee instanceof SymbolDef){
				return '''
				«RuleUtils.generateInstanceOf(assignable, "to"+assignee.name.toFirstUpper, ruleTable)»
				Object «assignee.name» = to«assignee.name.toFirstUpper»;
				'''
			}
			if(assignee instanceof SemanticDomainAccess){
				return '''
				«RuleUtils.generateInstanceOf(assignable, "to"+assignee.field.toFirstUpper, ruleTable)»
				«NamingUtils.pathFor(assignee.reciever, ruleTable)».set«assignee.field.toFirstUpper»(to«assignee.field.toFirstUpper»);
				'''
			}
		} else {
			if(assignee instanceof SymbolDef){
				return '''
				Object «assignee.name» = «assignable.compile»;
				'''
			}
			if(assignee instanceof SemanticDomainAccess){
				return '''
				«NamingUtils.pathFor(assignee.reciever, ruleTable)».set«assignee.field.toFirstUpper»(«assignable.compile»);
				'''
			}
		}
	}
	
	def dispatch String compile(Input node){
		return '''
		Object «node.assignee» = «node.operation.name»
		'''
	}
	
	def dispatch String compile(Output node){
		return '''
		«node.operation.name»();
		'''
	}
	
	def dispatch String compile(Plus node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" + "+rhs+")"
	}
	
	def dispatch String compile(Minus node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" - "+rhs+")"
	}
	
	def dispatch String compile(Div node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" / "+rhs+")"
	}
	
	def dispatch String compile(Mult node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" * "+rhs+")"
	}
	
	def dispatch String compile(Or node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" || "+rhs+")"
	}
	
	def dispatch String compile(And node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" && "+rhs+")"
	}
	
	def dispatch String compile(Not node) {
		val expr = node.expr.compile
		return "(!"+expr+")"
	}
	
	def dispatch String compile(Less node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" < "+rhs+")"
	}
	
	def dispatch String compile(LessEq node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+" <= "+rhs+")"
	}
	
	def dispatch String compile(Equal node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "("+lhs+".equals("+rhs+"))"
	}
	
	def dispatch String compile(NotEqual node) {
		val lhs = node.lhs.compile
		val rhs = node.rhs.compile
		return "(!"+lhs+".equals("+rhs+"))"
	}
	
	def dispatch String compile(IntConstant node) {
		return node.value.toString
	}
	
	def dispatch String compile(BoolConstant node) {
		return node.value.toString
	}
	
	def dispatch String compile(StringConstant node) {
		return node.value.toString
	}
	
	def dispatch String compile(DoubleConstant node) {
		return node.value.toString
	}
	
	def dispatch String compile(SemanticDomainAccess node) {
		return node.reciever.compile + ".get" + node.field.toFirstUpper+ "()"
	}
	
	def dispatch String compile(Self node) {
		return "node"
	}
	
	def dispatch String compile(SymbolRef node) {
		val sp = new SymbolPath(node.def.name, node.def.name, node.def.name)
		return ruleTable.getOrDefault(node.def, sp).unknownForm
	}
	
	def String append(String text, EList l){
		var out = text
		for (elem : l) {
			out = out.append(elem as EObject)
		}
		return out
	}
	
	def String append(String text, EObject o){
		return '''
			«text»
			«o.compile»
			'''
	}
}
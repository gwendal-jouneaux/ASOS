package fr.irisa.diverse.adaptivesemantics.generator

class ASOSFileGenerator {
	static def String termination(){
		return '''
		package «RuleUtils.modelName».ASOS;
		
		public class Termination {
			private final Object boxed;
			
			public Termination(Object boxed) {
				this.boxed = boxed;
			}
			
			public Object unbox() {
				return boxed;
			}
		}
		'''
	}
	
	static def String adaptationrule(){
		return '''
		package «RuleUtils.modelName».ASOS;
		
		import fr.diverse.team.SEALS.lang.semantics.AdaptableNode;
		import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
		import fr.diverse.team.SEALS.lang.semantics.SemanticsAdaptationInterface;
		
		public abstract class AdaptationRule {
		
			private AdaptationRule next;
		
			public void chain(AdaptationRule next) {
				this.next = next;
			}
		
			public abstract Object adapt(SelfAdaptiveVisitor vis, AdaptableNode<? extends SemanticsAdaptationInterface> node, Object execCtx, SemanticsAdaptationInterface config);
		
		}

		'''
	}
}
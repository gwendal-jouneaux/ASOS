package fr.irisa.diverse.adaptivesemantics.generator

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.generator.IFileSystemAccess2

class AdaptationProcessGenerator {
	/**************************************************
	 * 
	 * 
	 *      GENERATE ADAPTATION PROCESS CLASSES
	 * 
	 * 
	 **************************************************/
	
	static def String language(){
		return '''
		package «RuleUtils.modelName».interpreter;
		
		import fr.diverse.team.SEALS.lang.SelfAdaptableLanguage;
		import fr.diverse.team.SEALS.lang.adaptation.FeedbackLoop;
		import fr.diverse.team.SEALS.lang.semantics.SelfAdaptiveVisitor;
		
		public class «NamingUtils.LanguageName» extends SelfAdaptableLanguage<«NamingUtils.AdaptationContextName»> {
		
			@Override
			protected «NamingUtils.AdaptationContextName» createAdaptationContext() {
				return new «NamingUtils.AdaptationContextName»();
			}
		
			@Override
			protected FeedbackLoop<?, «NamingUtils.AdaptationContextName»> createFeedbackLoop(«NamingUtils.AdaptationContextName» ctx) {
				return new «NamingUtils.FeedbackLoopName»(ctx);
			}
		
			@Override
			protected SelfAdaptiveVisitor createVisitor() {
				return new «RuleUtils.modelName.toFirstUpper»Visitor();
			}
		
		}
		'''
	}
	
	static def String feedbackloop(){
		return '''
		
		package «RuleUtils.modelName».interpreter;
		
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;
		import java.util.Set;
		
		import fr.diverse.team.SEALS.decision.model.GoalModelingElement;
		import fr.diverse.team.SEALS.decision.model.Resource;
		import fr.diverse.team.SEALS.decision.model.Softgoal;
		import fr.diverse.team.SEALS.decision.model.visitor.ImpactEvaluationVisitor;
		import fr.diverse.team.SEALS.decision.model.visitor.VariableAssessmentVisitor;
		import fr.diverse.team.SEALS.lang.adaptation.FeedbackLoop;
		import fr.diverse.team.SEALS.lang.semantics.Node;
		import fr.diverse.team.SEALS.module.adaptation.SelfAdaptationModule;
		
		public class «NamingUtils.FeedbackLoopName» extends FeedbackLoop<«NamingUtils.LanguageName», «NamingUtils.AdaptationContextName»> {
			private static long time = 0;
			Map<String, Double> userConfig;
			Map<Resource, Double> resourcesValues;
			ImpactEvaluationVisitor vis;
		
			protected «NamingUtils.FeedbackLoopName»(«NamingUtils.AdaptationContextName» adaptationCtx) {
				super(adaptationCtx);
				resourcesValues = new HashMap<>();
			}
		
			@Override
			protected void monitor() {
				userConfig = getAdaptationContext().readExpectedTradeOff();
				List<Resource> resources = getAdaptationContext().getEnvironmentModel();
				for (Resource resource : resources) {
					switch(resource.ID){
						case "RESOURCE":
						// Monitoring
						break;
					}
				}
			}
		
			@Override
			protected boolean analyze() {
				Map<String, Double> oldUserConfig = getAdaptationContext().getExpectedTradeOff();
				if(oldUserConfig == null) return true;
				
				for (String id : userConfig.keySet()) {
					double delta = Math.abs(userConfig.get(id) - oldUserConfig.get(id));
					if(delta > 0.01) {
						return true;
					}
				}
				
				double error = 0.0;
				for (Resource resource : resourcesValues.keySet()) {
					double delta = Math.abs(resource.monitor()*100 - resourcesValues.get(resource)*100);
					double square = delta * delta;
					error += square;
				}
				error = error / resourcesValues.size();
				
				return error > 4; // recompute if env change more than 2%
			}
		
			@Override
			protected void plan() {
				getAdaptationContext().setExpectedTradeOff(userConfig);
				for (Resource resource : resourcesValues.keySet()) {
					resource.setMonitoredValue(resourcesValues.get(resource));
				}
				getAdaptationContext().assessModelVariables();
				vis = getAdaptationContext().evaluateModel();
			}
		
			@Override
			protected void execute() {
				Map<GoalModelingElement, Double> elemValues = vis.getValues();
				List<SelfAdaptationModule<?, ?, ?>> modules = getAdaptationContext().getModuleRegistry().getModules();
				for (SelfAdaptationModule<?, ?, ?> selfAdaptationModule : modules) {
					List<Softgoal> properties = selfAdaptationModule.getModulesPropertiesOfInterest();
					double impact = 0.0;
					for (Softgoal property : properties) {
						double value = elemValues.get(property);
						for (String propertyName : userConfig.keySet()) {
							if(property.ID.endsWith(propertyName)) {
								impact += userConfig.get(propertyName) * value;
							}
						}
					}
					selfAdaptationModule.setActive(impact>0);
				}
			}
		
			@Override
			public boolean isTriggered(Node n) {
				long delta = System.currentTimeMillis()-time;
				if(delta > 3000) { // trigger every 3 seconds
					time = System.currentTimeMillis();
					return true;
				} else {
					return false;
				}
			}
		
		}
		'''
	}
	
	static def String adaptationcontext(){
		return '''
		package «RuleUtils.modelName».interpreter;
		
		import java.util.HashMap;
		import java.util.Map;
		
		import fr.diverse.team.SEALS.decision.model.Resource;
		import fr.diverse.team.SEALS.lang.adaptation.AdaptationContext;
		
		public class «NamingUtils.AdaptationContextName» extends AdaptationContext<«NamingUtils.LanguageName»> {
		
			@Override
			public Map<String, Double> readExpectedTradeOff() {
				Map<String, Double> out = new HashMap<String, Double>();
				out.put("PROPERTY", 1.0);
				return out;
			}
		
			@Override
			public String[] propertiesOfInterest() {
				return new String[] {"PROPERTY"};
			}
		
			@Override
			protected Resource[] environment() {
				return new Resource[] {new Resource("RESOURCE")};
			}
		
		}
		
		'''
	}
	
}
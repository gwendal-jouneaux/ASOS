/*
 * generated by Xtext 2.25.0
 */
package fr.irisa.diverse.semanticadaptation.serializer;

import com.google.inject.Inject;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.And;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BoolConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Div;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DoubleConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Equal;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.IntConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Is;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Less;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.LessEq;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Minus;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Mult;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Not;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.NotEqual;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Or;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Plus;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.StringConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList;
import fr.irisa.diverse.adaptivesemantics.serializer.AdaptSemSemanticSequencer;
import fr.irisa.diverse.semanticadaptation.services.SemAdaptGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import semanticadaptation.After;
import semanticadaptation.Before;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticAdaptation;
import semanticadaptation.SemanticadaptationPackage;
import semanticadaptation.Semantics;
import semanticadaptation.Specialization;

@SuppressWarnings("all")
public class SemAdaptSemanticSequencer extends AdaptSemSemanticSequencer {

	@Inject
	private SemAdaptGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AdaptivesemanticsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS:
				sequence_AdaptiveSemantics(context, (AdaptiveSemantics) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.AND:
				if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondAndRule()) {
					sequence_CondAnd(context, (And) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.BINDING:
				sequence_Binding(context, (Binding) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.BOOL_CONSTANT:
				sequence_Atomic(context, (BoolConstant) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.CONCLUSION:
				sequence_Conclusion(context, (Conclusion) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.DEF_CONFIGURATION:
				sequence_DefConfiguration(context, (DefConfiguration) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.DIV:
				sequence_MulOrDiv(context, (Div) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.DOUBLE_CONSTANT:
				sequence_Atomic(context, (DoubleConstant) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.EQUAL:
				if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondEqualityRule()) {
					sequence_CondEquality(context, (Equal) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Equality(context, (Equal) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.INT_CONSTANT:
				sequence_Atomic(context, (IntConstant) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.IS:
				if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondIsRule()) {
					sequence_CondIs(context, (Is) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Is) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.LESS:
				if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Comparison(context, (Less) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondComparisonRule()) {
					sequence_CondComparison(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.LESS_EQ:
				if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Comparison(context, (LessEq) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondComparisonRule()) {
					sequence_CondComparison(context, (LessEq) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.LIST_DEF:
				sequence_ListDef(context, (ListDef) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.LIST_REF:
				sequence_ListRef(context, (ListRef) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.MULT:
				sequence_MulOrDiv(context, (Mult) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.NOT:
				if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondNotRule()) {
					sequence_CondNot(context, (Not) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.NOT_EQUAL:
				if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondEqualityRule()) {
					sequence_CondEquality(context, (NotEqual) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Equality(context, (NotEqual) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.OPPOSITE:
				sequence_Primary(context, (Opposite) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.OR:
				if (rule == grammarAccess.getCondExprRule()
						|| rule == grammarAccess.getCondOrRule()) {
					sequence_CondOr(context, (Or) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssignableRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getOrLhsAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getAndLhsAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getEqualLhsAction_1_0_0_0()
						|| action == grammarAccess.getEqualityAccess().getNotEqualLhsAction_1_0_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getLessLhsAction_1_0_0_0()
						|| action == grammarAccess.getComparisonAccess().getLessEqLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getPlusLhsAction_1_0_0_0()
						|| action == grammarAccess.getPlusOrMinusAccess().getMinusLhsAction_1_0_1_0()
						|| rule == grammarAccess.getMulOrDivRule()
						|| action == grammarAccess.getMulOrDivAccess().getMultLhsAction_1_0_0_0()
						|| action == grammarAccess.getMulOrDivAccess().getDivLhsAction_1_0_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case AdaptivesemanticsPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.PREMISE:
				sequence_Premise(context, (Premise) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.REF_CONFIGURATION:
				sequence_RefConfiguration(context, (RefConfiguration) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.SELF:
				sequence_Self(context, (Self) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS:
				sequence_SemanticDomainAccess(context, (SemanticDomainAccess) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.STRING_CONSTANT:
				sequence_Atomic(context, (StringConstant) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.SYMBOL_DEF:
				sequence_SymbolDef(context, (SymbolDef) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.SYMBOL_REF:
				sequence_SymbolRef(context, (SymbolRef) semanticObject); 
				return; 
			case AdaptivesemanticsPackage.VOID_LIST:
				sequence_VoidList(context, (VoidList) semanticObject); 
				return; 
			}
		else if (epackage == SemanticadaptationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SemanticadaptationPackage.AFTER:
				sequence_Adaptation(context, (After) semanticObject); 
				return; 
			case SemanticadaptationPackage.BEFORE:
				sequence_Adaptation(context, (Before) semanticObject); 
				return; 
			case SemanticadaptationPackage.MODULE:
				sequence_Module(context, (semanticadaptation.Module) semanticObject); 
				return; 
			case SemanticadaptationPackage.POINTCUT:
				sequence_Pointcut(context, (Pointcut) semanticObject); 
				return; 
			case SemanticadaptationPackage.SEMANTIC_ADAPTATION:
				sequence_SemanticAdaptation(context, (SemanticAdaptation) semanticObject); 
				return; 
			case SemanticadaptationPackage.SEMANTICS:
				sequence_Semantics(context, (Semantics) semanticObject); 
				return; 
			case SemanticadaptationPackage.SPECIALIZATION:
				sequence_Adaptation(context, (Specialization) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Adaptation returns After
	 *
	 * Constraint:
	 *     (target=[Rule|ID] adaptation=Rule)
	 */
	protected void sequence_Adaptation(ISerializationContext context, After semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET));
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdaptationAccess().getTargetRuleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SemanticadaptationPackage.Literals.ADAPTATION__TARGET, false));
		feeder.accept(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0(), semanticObject.getAdaptation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Adaptation returns Before
	 *
	 * Constraint:
	 *     (target=[Rule|ID] adaptation=Rule)
	 */
	protected void sequence_Adaptation(ISerializationContext context, Before semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET));
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdaptationAccess().getTargetRuleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SemanticadaptationPackage.Literals.ADAPTATION__TARGET, false));
		feeder.accept(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0(), semanticObject.getAdaptation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Adaptation returns Specialization
	 *
	 * Constraint:
	 *     (target=[Rule|ID] adaptation=Rule)
	 */
	protected void sequence_Adaptation(ISerializationContext context, Specialization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__TARGET));
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.ADAPTATION__ADAPTATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdaptationAccess().getTargetRuleIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SemanticadaptationPackage.Literals.ADAPTATION__TARGET, false));
		feeder.accept(grammarAccess.getAdaptationAccess().getAdaptationRuleParserRuleCall_2_0(), semanticObject.getAdaptation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Module returns Module
	 *
	 * Constraint:
	 *     (name=ID pointcuts+=Pointcut* adaptations+=Adaptation*)
	 */
	protected void sequence_Module(ISerializationContext context, semanticadaptation.Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pointcut returns Pointcut
	 *
	 * Constraint:
	 *     (recursive?='recursive'? structure=DefConfiguration (conditions+=Condition conditions+=Condition*)?)
	 */
	protected void sequence_Pointcut(ISerializationContext context, Pointcut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SemanticAdaptation returns SemanticAdaptation
	 *
	 * Constraint:
	 *     (model=Model semantics=Semantics imports+=Import* modules+=Module*)
	 */
	protected void sequence_SemanticAdaptation(ISerializationContext context, SemanticAdaptation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Semantics returns Semantics
	 *
	 * Constraint:
	 *     importURI=EString
	 */
	protected void sequence_Semantics(ISerializationContext context, Semantics semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SemanticadaptationPackage.Literals.SEMANTICS__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SemanticadaptationPackage.Literals.SEMANTICS__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSemanticsAccess().getImportURIEStringParserRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
}

/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.util;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage
 * @generated
 */
public class AdaptivesemanticsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptivesemanticsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptivesemanticsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdaptivesemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptivesemanticsSwitch<Adapter> modelSwitch = new AdaptivesemanticsSwitch<Adapter>() {
		@Override
		public Adapter caseBinding(Binding object) {
			return createBindingAdapter();
		}

		@Override
		public Adapter caseAdaptiveSemantics(AdaptiveSemantics object) {
			return createAdaptiveSemanticsAdapter();
		}

		@Override
		public Adapter caseConclusion(Conclusion object) {
			return createConclusionAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter casePremise(Premise object) {
			return createPremiseAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseRule(Rule object) {
			return createRuleAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseRefConfiguration(RefConfiguration object) {
			return createRefConfigurationAdapter();
		}

		@Override
		public Adapter caseDefConfiguration(DefConfiguration object) {
			return createDefConfigurationAdapter();
		}

		@Override
		public Adapter caseSymbolDef(SymbolDef object) {
			return createSymbolDefAdapter();
		}

		@Override
		public Adapter caseSymbolRef(SymbolRef object) {
			return createSymbolRefAdapter();
		}

		@Override
		public Adapter caseListRef(ListRef object) {
			return createListRefAdapter();
		}

		@Override
		public Adapter caseListDef(ListDef object) {
			return createListDefAdapter();
		}

		@Override
		public Adapter caseConfiguration(Configuration object) {
			return createConfigurationAdapter();
		}

		@Override
		public Adapter caseSingleTermDef(SingleTermDef object) {
			return createSingleTermDefAdapter();
		}

		@Override
		public Adapter caseSingleTermRef(SingleTermRef object) {
			return createSingleTermRefAdapter();
		}

		@Override
		public Adapter caseTermRef(TermRef object) {
			return createTermRefAdapter();
		}

		@Override
		public Adapter caseTermDef(TermDef object) {
			return createTermDefAdapter();
		}

		@Override
		public Adapter caseVoidList(VoidList object) {
			return createVoidListAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
		}

		@Override
		public Adapter caseAssignee(Assignee object) {
			return createAssigneeAdapter();
		}

		@Override
		public Adapter caseSemanticDomainAccess(SemanticDomainAccess object) {
			return createSemanticDomainAccessAdapter();
		}

		@Override
		public Adapter caseDomainAccessExpression(DomainAccessExpression object) {
			return createDomainAccessExpressionAdapter();
		}

		@Override
		public Adapter caseSelf(Self object) {
			return createSelfAdapter();
		}

		@Override
		public Adapter caseEqual(Equal object) {
			return createEqualAdapter();
		}

		@Override
		public Adapter caseNotEqual(NotEqual object) {
			return createNotEqualAdapter();
		}

		@Override
		public Adapter caseCondExpr(CondExpr object) {
			return createCondExprAdapter();
		}

		@Override
		public Adapter caseExpr(Expr object) {
			return createExprAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseLess(Less object) {
			return createLessAdapter();
		}

		@Override
		public Adapter caseLessEq(LessEq object) {
			return createLessEqAdapter();
		}

		@Override
		public Adapter caseBinExpr(BinExpr object) {
			return createBinExprAdapter();
		}

		@Override
		public Adapter caseDiv(Div object) {
			return createDivAdapter();
		}

		@Override
		public Adapter caseMult(Mult object) {
			return createMultAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseConst(Const object) {
			return createConstAdapter();
		}

		@Override
		public Adapter caseIntConstant(IntConstant object) {
			return createIntConstantAdapter();
		}

		@Override
		public Adapter caseBoolConstant(BoolConstant object) {
			return createBoolConstantAdapter();
		}

		@Override
		public Adapter caseStringConstant(StringConstant object) {
			return createStringConstantAdapter();
		}

		@Override
		public Adapter caseDoubleConstant(DoubleConstant object) {
			return createDoubleConstantAdapter();
		}

		@Override
		public Adapter caseAssignable(Assignable object) {
			return createAssignableAdapter();
		}

		@Override
		public Adapter caseOpposite(Opposite object) {
			return createOppositeAdapter();
		}

		@Override
		public Adapter caseIs(Is object) {
			return createIsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics <em>Adaptive Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics
	 * @generated
	 */
	public Adapter createAdaptiveSemanticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion
	 * @generated
	 */
	public Adapter createConclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise
	 * @generated
	 */
	public Adapter createPremiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration <em>Ref Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
	 * @generated
	 */
	public Adapter createRefConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration <em>Def Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
	 * @generated
	 */
	public Adapter createDefConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef <em>Symbol Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
	 * @generated
	 */
	public Adapter createSymbolDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
	 * @generated
	 */
	public Adapter createSymbolRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef <em>List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef
	 * @generated
	 */
	public Adapter createListRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef <em>List Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
	 * @generated
	 */
	public Adapter createListDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef <em>Single Term Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef
	 * @generated
	 */
	public Adapter createSingleTermDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef <em>Single Term Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef
	 * @generated
	 */
	public Adapter createSingleTermRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef <em>Term Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
	 * @generated
	 */
	public Adapter createTermRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef <em>Term Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef
	 * @generated
	 */
	public Adapter createTermDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList <em>Void List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
	 * @generated
	 */
	public Adapter createVoidListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee
	 * @generated
	 */
	public Adapter createAssigneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess <em>Semantic Domain Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess
	 * @generated
	 */
	public Adapter createSemanticDomainAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression <em>Domain Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression
	 * @generated
	 */
	public Adapter createDomainAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self
	 * @generated
	 */
	public Adapter createSelfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Equal
	 * @generated
	 */
	public Adapter createEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.NotEqual <em>Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.NotEqual
	 * @generated
	 */
	public Adapter createNotEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.CondExpr <em>Cond Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.CondExpr
	 * @generated
	 */
	public Adapter createCondExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Expr
	 * @generated
	 */
	public Adapter createExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.LessEq <em>Less Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.LessEq
	 * @generated
	 */
	public Adapter createLessEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BinExpr <em>Bin Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BinExpr
	 * @generated
	 */
	public Adapter createBinExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Mult
	 * @generated
	 */
	public Adapter createMultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Const <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Const
	 * @generated
	 */
	public Adapter createConstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DoubleConstant <em>Double Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DoubleConstant
	 * @generated
	 */
	public Adapter createDoubleConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignable <em>Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignable
	 * @generated
	 */
	public Adapter createAssignableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite
	 * @generated
	 */
	public Adapter createOppositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Is <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Is
	 * @generated
	 */
	public Adapter createIsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdaptivesemanticsAdapterFactory

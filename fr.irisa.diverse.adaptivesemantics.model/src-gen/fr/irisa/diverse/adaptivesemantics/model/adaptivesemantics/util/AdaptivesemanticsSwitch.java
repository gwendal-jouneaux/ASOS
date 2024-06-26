/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.util;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage
 * @generated
 */
public class AdaptivesemanticsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptivesemanticsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptivesemanticsSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptivesemanticsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AdaptivesemanticsPackage.BINDING: {
			Binding binding = (Binding) theEObject;
			T result = caseBinding(binding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS: {
			AdaptiveSemantics adaptiveSemantics = (AdaptiveSemantics) theEObject;
			T result = caseAdaptiveSemantics(adaptiveSemantics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.CONCLUSION: {
			Conclusion conclusion = (Conclusion) theEObject;
			T result = caseConclusion(conclusion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.PREMISE: {
			Premise premise = (Premise) theEObject;
			T result = casePremise(premise);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.RULE: {
			Rule rule = (Rule) theEObject;
			T result = caseRule(rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.REF_CONFIGURATION: {
			RefConfiguration refConfiguration = (RefConfiguration) theEObject;
			T result = caseRefConfiguration(refConfiguration);
			if (result == null)
				result = caseConfiguration(refConfiguration);
			if (result == null)
				result = caseSingleTermRef(refConfiguration);
			if (result == null)
				result = caseAssignable(refConfiguration);
			if (result == null)
				result = caseTermRef(refConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.DEF_CONFIGURATION: {
			DefConfiguration defConfiguration = (DefConfiguration) theEObject;
			T result = caseDefConfiguration(defConfiguration);
			if (result == null)
				result = caseConfiguration(defConfiguration);
			if (result == null)
				result = caseSingleTermDef(defConfiguration);
			if (result == null)
				result = caseTermDef(defConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SYMBOL_DEF: {
			SymbolDef symbolDef = (SymbolDef) theEObject;
			T result = caseSymbolDef(symbolDef);
			if (result == null)
				result = caseSingleTermDef(symbolDef);
			if (result == null)
				result = caseAssignee(symbolDef);
			if (result == null)
				result = caseTermDef(symbolDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SYMBOL_REF: {
			SymbolRef symbolRef = (SymbolRef) theEObject;
			T result = caseSymbolRef(symbolRef);
			if (result == null)
				result = caseSingleTermRef(symbolRef);
			if (result == null)
				result = caseDomainAccessExpression(symbolRef);
			if (result == null)
				result = caseTermRef(symbolRef);
			if (result == null)
				result = caseExpr(symbolRef);
			if (result == null)
				result = caseAssignable(symbolRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.LIST_REF: {
			ListRef listRef = (ListRef) theEObject;
			T result = caseListRef(listRef);
			if (result == null)
				result = caseTermRef(listRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.LIST_DEF: {
			ListDef listDef = (ListDef) theEObject;
			T result = caseListDef(listDef);
			if (result == null)
				result = caseTermDef(listDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.CONFIGURATION: {
			Configuration configuration = (Configuration) theEObject;
			T result = caseConfiguration(configuration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SINGLE_TERM_DEF: {
			SingleTermDef singleTermDef = (SingleTermDef) theEObject;
			T result = caseSingleTermDef(singleTermDef);
			if (result == null)
				result = caseTermDef(singleTermDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SINGLE_TERM_REF: {
			SingleTermRef singleTermRef = (SingleTermRef) theEObject;
			T result = caseSingleTermRef(singleTermRef);
			if (result == null)
				result = caseTermRef(singleTermRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.TERM_REF: {
			TermRef termRef = (TermRef) theEObject;
			T result = caseTermRef(termRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.TERM_DEF: {
			TermDef termDef = (TermDef) theEObject;
			T result = caseTermDef(termDef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.VOID_LIST: {
			VoidList voidList = (VoidList) theEObject;
			T result = caseVoidList(voidList);
			if (result == null)
				result = caseTermDef(voidList);
			if (result == null)
				result = caseTermRef(voidList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.ASSIGNEE: {
			Assignee assignee = (Assignee) theEObject;
			T result = caseAssignee(assignee);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS: {
			SemanticDomainAccess semanticDomainAccess = (SemanticDomainAccess) theEObject;
			T result = caseSemanticDomainAccess(semanticDomainAccess);
			if (result == null)
				result = caseDomainAccessExpression(semanticDomainAccess);
			if (result == null)
				result = caseAssignee(semanticDomainAccess);
			if (result == null)
				result = caseExpr(semanticDomainAccess);
			if (result == null)
				result = caseAssignable(semanticDomainAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.DOMAIN_ACCESS_EXPRESSION: {
			DomainAccessExpression domainAccessExpression = (DomainAccessExpression) theEObject;
			T result = caseDomainAccessExpression(domainAccessExpression);
			if (result == null)
				result = caseExpr(domainAccessExpression);
			if (result == null)
				result = caseAssignable(domainAccessExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.SELF: {
			Self self = (Self) theEObject;
			T result = caseSelf(self);
			if (result == null)
				result = caseDomainAccessExpression(self);
			if (result == null)
				result = caseExpr(self);
			if (result == null)
				result = caseAssignable(self);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.EQUAL: {
			Equal equal = (Equal) theEObject;
			T result = caseEqual(equal);
			if (result == null)
				result = caseBinExpr(equal);
			if (result == null)
				result = caseCondExpr(equal);
			if (result == null)
				result = caseExpr(equal);
			if (result == null)
				result = caseAssignable(equal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.NOT_EQUAL: {
			NotEqual notEqual = (NotEqual) theEObject;
			T result = caseNotEqual(notEqual);
			if (result == null)
				result = caseBinExpr(notEqual);
			if (result == null)
				result = caseCondExpr(notEqual);
			if (result == null)
				result = caseExpr(notEqual);
			if (result == null)
				result = caseAssignable(notEqual);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.COND_EXPR: {
			CondExpr condExpr = (CondExpr) theEObject;
			T result = caseCondExpr(condExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.EXPR: {
			Expr expr = (Expr) theEObject;
			T result = caseExpr(expr);
			if (result == null)
				result = caseAssignable(expr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBinExpr(or);
			if (result == null)
				result = caseCondExpr(or);
			if (result == null)
				result = caseExpr(or);
			if (result == null)
				result = caseAssignable(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBinExpr(and);
			if (result == null)
				result = caseCondExpr(and);
			if (result == null)
				result = caseExpr(and);
			if (result == null)
				result = caseAssignable(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseCondExpr(not);
			if (result == null)
				result = caseExpr(not);
			if (result == null)
				result = caseAssignable(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.LESS: {
			Less less = (Less) theEObject;
			T result = caseLess(less);
			if (result == null)
				result = caseBinExpr(less);
			if (result == null)
				result = caseCondExpr(less);
			if (result == null)
				result = caseExpr(less);
			if (result == null)
				result = caseAssignable(less);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.LESS_EQ: {
			LessEq lessEq = (LessEq) theEObject;
			T result = caseLessEq(lessEq);
			if (result == null)
				result = caseBinExpr(lessEq);
			if (result == null)
				result = caseCondExpr(lessEq);
			if (result == null)
				result = caseExpr(lessEq);
			if (result == null)
				result = caseAssignable(lessEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.BIN_EXPR: {
			BinExpr binExpr = (BinExpr) theEObject;
			T result = caseBinExpr(binExpr);
			if (result == null)
				result = caseExpr(binExpr);
			if (result == null)
				result = caseAssignable(binExpr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.DIV: {
			Div div = (Div) theEObject;
			T result = caseDiv(div);
			if (result == null)
				result = caseBinExpr(div);
			if (result == null)
				result = caseExpr(div);
			if (result == null)
				result = caseAssignable(div);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.MULT: {
			Mult mult = (Mult) theEObject;
			T result = caseMult(mult);
			if (result == null)
				result = caseBinExpr(mult);
			if (result == null)
				result = caseExpr(mult);
			if (result == null)
				result = caseAssignable(mult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseBinExpr(minus);
			if (result == null)
				result = caseExpr(minus);
			if (result == null)
				result = caseAssignable(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseBinExpr(plus);
			if (result == null)
				result = caseExpr(plus);
			if (result == null)
				result = caseAssignable(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.CONST: {
			Const const_ = (Const) theEObject;
			T result = caseConst(const_);
			if (result == null)
				result = caseExpr(const_);
			if (result == null)
				result = caseAssignable(const_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.INT_CONSTANT: {
			IntConstant intConstant = (IntConstant) theEObject;
			T result = caseIntConstant(intConstant);
			if (result == null)
				result = caseConst(intConstant);
			if (result == null)
				result = caseExpr(intConstant);
			if (result == null)
				result = caseAssignable(intConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.BOOL_CONSTANT: {
			BoolConstant boolConstant = (BoolConstant) theEObject;
			T result = caseBoolConstant(boolConstant);
			if (result == null)
				result = caseConst(boolConstant);
			if (result == null)
				result = caseExpr(boolConstant);
			if (result == null)
				result = caseAssignable(boolConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.STRING_CONSTANT: {
			StringConstant stringConstant = (StringConstant) theEObject;
			T result = caseStringConstant(stringConstant);
			if (result == null)
				result = caseConst(stringConstant);
			if (result == null)
				result = caseExpr(stringConstant);
			if (result == null)
				result = caseAssignable(stringConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.DOUBLE_CONSTANT: {
			DoubleConstant doubleConstant = (DoubleConstant) theEObject;
			T result = caseDoubleConstant(doubleConstant);
			if (result == null)
				result = caseConst(doubleConstant);
			if (result == null)
				result = caseExpr(doubleConstant);
			if (result == null)
				result = caseAssignable(doubleConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.ASSIGNABLE: {
			Assignable assignable = (Assignable) theEObject;
			T result = caseAssignable(assignable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.OPPOSITE: {
			Opposite opposite = (Opposite) theEObject;
			T result = caseOpposite(opposite);
			if (result == null)
				result = caseExpr(opposite);
			if (result == null)
				result = caseAssignable(opposite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.IS: {
			Is is = (Is) theEObject;
			T result = caseIs(is);
			if (result == null)
				result = caseCondExpr(is);
			if (result == null)
				result = caseExpr(is);
			if (result == null)
				result = caseAssignable(is);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptive Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptive Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptiveSemantics(AdaptiveSemantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConclusion(Conclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Premise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Premise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePremise(Premise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefConfiguration(RefConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Def Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Def Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefConfiguration(DefConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolDef(SymbolDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolRef(SymbolRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRef(ListRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListDef(ListDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Term Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Term Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTermDef(SingleTermDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Term Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Term Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTermRef(SingleTermRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermRef(TermRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermDef(TermDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidList(VoidList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignee(Assignee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Domain Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Domain Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticDomainAccess(SemanticDomainAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAccessExpression(DomainAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelf(Self object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cond Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cond Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondExpr(CondExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpr(Expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEq(LessEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinExpr(BinExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMult(Mult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConst(Const object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstant(IntConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolConstant(BoolConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleConstant(DoubleConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignable(Assignable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpposite(Opposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIs(Is object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AdaptivesemanticsSwitch

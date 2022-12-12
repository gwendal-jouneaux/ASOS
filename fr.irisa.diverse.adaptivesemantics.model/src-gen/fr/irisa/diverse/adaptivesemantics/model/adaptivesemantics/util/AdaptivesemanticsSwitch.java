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
				result = caseSingleTermRef(semanticDomainAccess);
			if (result == null)
				result = caseTermRef(semanticDomainAccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AdaptivesemanticsPackage.DOMAIN_ACCESS_EXPRESSION: {
			DomainAccessExpression domainAccessExpression = (DomainAccessExpression) theEObject;
			T result = caseDomainAccessExpression(domainAccessExpression);
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

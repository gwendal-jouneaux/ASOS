/**
 */
package semanticadaptation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import semanticadaptation.Adaptation;
import semanticadaptation.After;
import semanticadaptation.Before;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticAdaptation;
import semanticadaptation.SemanticadaptationPackage;
import semanticadaptation.Semantics;
import semanticadaptation.Specialization;

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
 * @see semanticadaptation.SemanticadaptationPackage
 * @generated
 */
public class SemanticadaptationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticadaptationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticadaptationSwitch() {
		if (modelPackage == null) {
			modelPackage = SemanticadaptationPackage.eINSTANCE;
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
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION: {
			SemanticAdaptation semanticAdaptation = (SemanticAdaptation) theEObject;
			T result = caseSemanticAdaptation(semanticAdaptation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.ADAPTATION: {
			Adaptation adaptation = (Adaptation) theEObject;
			T result = caseAdaptation(adaptation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.SEMANTICS: {
			Semantics semantics = (Semantics) theEObject;
			T result = caseSemantics(semantics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.SPECIALIZATION: {
			Specialization specialization = (Specialization) theEObject;
			T result = caseSpecialization(specialization);
			if (result == null)
				result = caseAdaptation(specialization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.BEFORE: {
			Before before = (Before) theEObject;
			T result = caseBefore(before);
			if (result == null)
				result = caseAdaptation(before);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.AFTER: {
			After after = (After) theEObject;
			T result = caseAfter(after);
			if (result == null)
				result = caseAdaptation(after);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.POINTCUT: {
			Pointcut pointcut = (Pointcut) theEObject;
			T result = casePointcut(pointcut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SemanticadaptationPackage.MODULE: {
			semanticadaptation.Module module = (semanticadaptation.Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemanticAdaptation(SemanticAdaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptation(Adaptation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemantics(Semantics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialization(Specialization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBefore(Before object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfter(After object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointcut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointcut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointcut(Pointcut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(semanticadaptation.Module object) {
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

} //SemanticadaptationSwitch

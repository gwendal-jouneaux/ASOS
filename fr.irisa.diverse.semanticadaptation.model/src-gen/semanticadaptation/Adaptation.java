/**
 */
package semanticadaptation;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.Adaptation#getTarget <em>Target</em>}</li>
 *   <li>{@link semanticadaptation.Adaptation#getAdaptation <em>Adaptation</em>}</li>
 * </ul>
 *
 * @see semanticadaptation.SemanticadaptationPackage#getAdaptation()
 * @model abstract="true"
 * @generated
 */
public interface Adaptation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Rule)
	 * @see semanticadaptation.SemanticadaptationPackage#getAdaptation_Target()
	 * @model required="true"
	 * @generated
	 */
	Rule getTarget();

	/**
	 * Sets the value of the '{@link semanticadaptation.Adaptation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Rule value);

	/**
	 * Returns the value of the '<em><b>Adaptation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation</em>' containment reference.
	 * @see #setAdaptation(Rule)
	 * @see semanticadaptation.SemanticadaptationPackage#getAdaptation_Adaptation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rule getAdaptation();

	/**
	 * Sets the value of the '{@link semanticadaptation.Adaptation#getAdaptation <em>Adaptation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptation</em>' containment reference.
	 * @see #getAdaptation()
	 * @generated
	 */
	void setAdaptation(Rule value);

} // Adaptation

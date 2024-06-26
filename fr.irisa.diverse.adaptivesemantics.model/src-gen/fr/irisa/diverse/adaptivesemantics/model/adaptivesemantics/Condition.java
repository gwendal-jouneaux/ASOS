/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(CondExpr)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getCondition_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CondExpr getCond();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(CondExpr value);

} // Condition

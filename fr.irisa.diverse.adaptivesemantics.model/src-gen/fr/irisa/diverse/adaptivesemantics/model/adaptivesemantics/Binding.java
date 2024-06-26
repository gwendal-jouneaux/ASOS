/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' containment reference.
	 * @see #setAssignee(Assignee)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getBinding_Assignee()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assignee getAssignee();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getAssignee <em>Assignee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' containment reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(Assignee value);

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Assignable)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getBinding_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Assignable getExpr();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Assignable value);

} // Binding

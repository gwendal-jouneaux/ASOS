/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opposite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getOpposite()
 * @model
 * @generated
 */
public interface Opposite extends Expr {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expr)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getOpposite_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getExpr();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Opposite#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expr value);

} // Opposite

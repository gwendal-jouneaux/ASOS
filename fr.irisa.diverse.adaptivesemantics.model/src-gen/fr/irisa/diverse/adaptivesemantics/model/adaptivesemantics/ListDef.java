/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getHead <em>Head</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getListDef()
 * @model
 * @generated
 */
public interface ListDef extends TermDef {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(SingleTermDef)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getListDef_Head()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleTermDef getHead();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(SingleTermDef value);

	/**
	 * Returns the value of the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' containment reference.
	 * @see #setTail(SymbolDef)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getListDef_Tail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolDef getTail();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getTail <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' containment reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(SymbolDef value);

} // ListDef

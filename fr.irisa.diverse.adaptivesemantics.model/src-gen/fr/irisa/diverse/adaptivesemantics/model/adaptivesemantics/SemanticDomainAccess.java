/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Domain Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getField <em>Field</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getReciever <em>Reciever</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getSemanticDomainAccess()
 * @model
 * @generated
 */
public interface SemanticDomainAccess extends DomainAccessExpression, Assignee, Assignable {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getSemanticDomainAccess_Field()
	 * @model required="true"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

	/**
	 * Returns the value of the '<em><b>Reciever</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciever</em>' containment reference.
	 * @see #setReciever(DomainAccessExpression)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getSemanticDomainAccess_Reciever()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainAccessExpression getReciever();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getReciever <em>Reciever</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reciever</em>' containment reference.
	 * @see #getReciever()
	 * @generated
	 */
	void setReciever(DomainAccessExpression value);

} // SemanticDomainAccess

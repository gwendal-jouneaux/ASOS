/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Premise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getFrom <em>From</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getTo <em>To</em>}</li>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#isTermination <em>Termination</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getPremise()
 * @model
 * @generated
 */
public interface Premise extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(SymbolRef)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getPremise_From()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SymbolRef getFrom();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SymbolRef value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(SingleTermDef)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getPremise_To()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleTermDef getTo();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SingleTermDef value);

	/**
	 * Returns the value of the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination</em>' attribute.
	 * @see #setTermination(boolean)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getPremise_Termination()
	 * @model required="true"
	 * @generated
	 */
	boolean isTermination();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#isTermination <em>Termination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination</em>' attribute.
	 * @see #isTermination()
	 * @generated
	 */
	void setTermination(boolean value);

} // Premise

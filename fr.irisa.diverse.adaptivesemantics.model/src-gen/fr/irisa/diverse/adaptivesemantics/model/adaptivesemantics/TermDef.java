/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getTermDef()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TermDef extends EObject {

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(SymbolDef)
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getTermDef_Symbol()
	 * @model containment="true"
	 * @generated
	 */
	SymbolDef getSymbol();

	/**
	 * Sets the value of the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(SymbolDef value);
} // TermDef

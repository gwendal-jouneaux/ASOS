/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration#getChilds <em>Childs</em>}</li>
 * </ul>
 *
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getDefConfiguration()
 * @model
 * @generated
 */
public interface DefConfiguration extends Configuration, SingleTermDef {
	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage#getDefConfiguration_Childs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TermDef> getChilds();

} // DefConfiguration

/**
 */
package semanticadaptation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.Module#getPointcuts <em>Pointcuts</em>}</li>
 *   <li>{@link semanticadaptation.Module#getAdaptations <em>Adaptations</em>}</li>
 *   <li>{@link semanticadaptation.Module#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see semanticadaptation.SemanticadaptationPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Pointcuts</b></em>' containment reference list.
	 * The list contents are of type {@link semanticadaptation.Pointcut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointcuts</em>' containment reference list.
	 * @see semanticadaptation.SemanticadaptationPackage#getModule_Pointcuts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pointcut> getPointcuts();

	/**
	 * Returns the value of the '<em><b>Adaptations</b></em>' containment reference list.
	 * The list contents are of type {@link semanticadaptation.Adaptation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptations</em>' containment reference list.
	 * @see semanticadaptation.SemanticadaptationPackage#getModule_Adaptations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Adaptation> getAdaptations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see semanticadaptation.SemanticadaptationPackage#getModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link semanticadaptation.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module

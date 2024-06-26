/**
 */
package semanticadaptation;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.Pointcut#getStructure <em>Structure</em>}</li>
 *   <li>{@link semanticadaptation.Pointcut#getConditions <em>Conditions</em>}</li>
 *   <li>{@link semanticadaptation.Pointcut#isRecursive <em>Recursive</em>}</li>
 * </ul>
 *
 * @see semanticadaptation.SemanticadaptationPackage#getPointcut()
 * @model
 * @generated
 */
public interface Pointcut extends EObject {
	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(DefConfiguration)
	 * @see semanticadaptation.SemanticadaptationPackage#getPointcut_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefConfiguration getStructure();

	/**
	 * Sets the value of the '{@link semanticadaptation.Pointcut#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(DefConfiguration value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see semanticadaptation.SemanticadaptationPackage#getPointcut_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' attribute.
	 * @see #setRecursive(boolean)
	 * @see semanticadaptation.SemanticadaptationPackage#getPointcut_Recursive()
	 * @model
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link semanticadaptation.Pointcut#isRecursive <em>Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setRecursive(boolean value);

} // Pointcut

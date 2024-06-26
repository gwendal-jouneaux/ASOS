/**
 */
package semanticadaptation;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Adaptation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semanticadaptation.SemanticAdaptation#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link semanticadaptation.SemanticAdaptation#getModules <em>Modules</em>}</li>
 *   <li>{@link semanticadaptation.SemanticAdaptation#getModel <em>Model</em>}</li>
 *   <li>{@link semanticadaptation.SemanticAdaptation#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see semanticadaptation.SemanticadaptationPackage#getSemanticAdaptation()
 * @model
 * @generated
 */
public interface SemanticAdaptation extends EObject {
	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(Semantics)
	 * @see semanticadaptation.SemanticadaptationPackage#getSemanticAdaptation_Semantics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Semantics getSemantics();

	/**
	 * Sets the value of the '{@link semanticadaptation.SemanticAdaptation#getSemantics <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' containment reference.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(Semantics value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link semanticadaptation.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see semanticadaptation.SemanticadaptationPackage#getSemanticAdaptation_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<semanticadaptation.Module> getModules();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Model)
	 * @see semanticadaptation.SemanticadaptationPackage#getSemanticAdaptation_Model()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link semanticadaptation.SemanticAdaptation#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see semanticadaptation.SemanticadaptationPackage#getSemanticAdaptation_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // SemanticAdaptation

/**
 */
package semanticadaptation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import semanticadaptation.Adaptation;
import semanticadaptation.After;
import semanticadaptation.Before;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticAdaptation;
import semanticadaptation.SemanticadaptationPackage;
import semanticadaptation.Semantics;
import semanticadaptation.Specialization;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see semanticadaptation.SemanticadaptationPackage
 * @generated
 */
public class SemanticadaptationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticadaptationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticadaptationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SemanticadaptationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticadaptationSwitch<Adapter> modelSwitch = new SemanticadaptationSwitch<Adapter>() {
		@Override
		public Adapter caseSemanticAdaptation(SemanticAdaptation object) {
			return createSemanticAdaptationAdapter();
		}

		@Override
		public Adapter caseAdaptation(Adaptation object) {
			return createAdaptationAdapter();
		}

		@Override
		public Adapter caseSemantics(Semantics object) {
			return createSemanticsAdapter();
		}

		@Override
		public Adapter caseSpecialization(Specialization object) {
			return createSpecializationAdapter();
		}

		@Override
		public Adapter caseBefore(Before object) {
			return createBeforeAdapter();
		}

		@Override
		public Adapter caseAfter(After object) {
			return createAfterAdapter();
		}

		@Override
		public Adapter casePointcut(Pointcut object) {
			return createPointcutAdapter();
		}

		@Override
		public Adapter caseModule(semanticadaptation.Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.SemanticAdaptation <em>Semantic Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.SemanticAdaptation
	 * @generated
	 */
	public Adapter createSemanticAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Adaptation
	 * @generated
	 */
	public Adapter createAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Semantics
	 * @generated
	 */
	public Adapter createSemanticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Specialization
	 * @generated
	 */
	public Adapter createSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Before
	 * @generated
	 */
	public Adapter createBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.After
	 * @generated
	 */
	public Adapter createAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Pointcut
	 * @generated
	 */
	public Adapter createPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link semanticadaptation.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see semanticadaptation.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SemanticadaptationAdapterFactory

/**
 */
package semanticadaptation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import semanticadaptation.After;
import semanticadaptation.Before;
import semanticadaptation.Pointcut;
import semanticadaptation.SemanticAdaptation;
import semanticadaptation.SemanticadaptationFactory;
import semanticadaptation.SemanticadaptationPackage;
import semanticadaptation.Semantics;
import semanticadaptation.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticadaptationFactoryImpl extends EFactoryImpl implements SemanticadaptationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticadaptationFactory init() {
		try {
			SemanticadaptationFactory theSemanticadaptationFactory = (SemanticadaptationFactory) EPackage.Registry.INSTANCE
					.getEFactory(SemanticadaptationPackage.eNS_URI);
			if (theSemanticadaptationFactory != null) {
				return theSemanticadaptationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticadaptationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticadaptationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SemanticadaptationPackage.SEMANTIC_ADAPTATION:
			return createSemanticAdaptation();
		case SemanticadaptationPackage.SEMANTICS:
			return createSemantics();
		case SemanticadaptationPackage.SPECIALIZATION:
			return createSpecialization();
		case SemanticadaptationPackage.BEFORE:
			return createBefore();
		case SemanticadaptationPackage.AFTER:
			return createAfter();
		case SemanticadaptationPackage.POINTCUT:
			return createPointcut();
		case SemanticadaptationPackage.MODULE:
			return createModule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticAdaptation createSemanticAdaptation() {
		SemanticAdaptationImpl semanticAdaptation = new SemanticAdaptationImpl();
		return semanticAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semantics createSemantics() {
		SemanticsImpl semantics = new SemanticsImpl();
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Before createBefore() {
		BeforeImpl before = new BeforeImpl();
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public semanticadaptation.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticadaptationPackage getSemanticadaptationPackage() {
		return (SemanticadaptationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticadaptationPackage getPackage() {
		return SemanticadaptationPackage.eINSTANCE;
	}

} //SemanticadaptationFactoryImpl

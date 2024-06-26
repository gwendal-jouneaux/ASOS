/**
 */
package semanticadaptation.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import semanticadaptation.Adaptation;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticadaptationPackageImpl extends EPackageImpl implements SemanticadaptationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see semanticadaptation.SemanticadaptationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticadaptationPackageImpl() {
		super(eNS_URI, SemanticadaptationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SemanticadaptationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticadaptationPackage init() {
		if (isInited)
			return (SemanticadaptationPackage) EPackage.Registry.INSTANCE
					.getEPackage(SemanticadaptationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemanticadaptationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemanticadaptationPackageImpl theSemanticadaptationPackage = registeredSemanticadaptationPackage instanceof SemanticadaptationPackageImpl
				? (SemanticadaptationPackageImpl) registeredSemanticadaptationPackage
				: new SemanticadaptationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AdaptivesemanticsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSemanticadaptationPackage.createPackageContents();

		// Initialize created meta-data
		theSemanticadaptationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticadaptationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticadaptationPackage.eNS_URI, theSemanticadaptationPackage);
		return theSemanticadaptationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemanticAdaptation() {
		return semanticAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticAdaptation_Semantics() {
		return (EReference) semanticAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticAdaptation_Modules() {
		return (EReference) semanticAdaptationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticAdaptation_Model() {
		return (EReference) semanticAdaptationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemanticAdaptation_Imports() {
		return (EReference) semanticAdaptationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptation() {
		return adaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptation_Target() {
		return (EReference) adaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdaptation_Adaptation() {
		return (EReference) adaptationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemantics() {
		return semanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemantics_ImportURI() {
		return (EAttribute) semanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBefore() {
		return beforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAfter() {
		return afterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcut() {
		return pointcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcut_Structure() {
		return (EReference) pointcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcut_Conditions() {
		return (EReference) pointcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointcut_Recursive() {
		return (EAttribute) pointcutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Pointcuts() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Adaptations() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticadaptationFactory getSemanticadaptationFactory() {
		return (SemanticadaptationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		semanticAdaptationEClass = createEClass(SEMANTIC_ADAPTATION);
		createEReference(semanticAdaptationEClass, SEMANTIC_ADAPTATION__SEMANTICS);
		createEReference(semanticAdaptationEClass, SEMANTIC_ADAPTATION__MODULES);
		createEReference(semanticAdaptationEClass, SEMANTIC_ADAPTATION__MODEL);
		createEReference(semanticAdaptationEClass, SEMANTIC_ADAPTATION__IMPORTS);

		adaptationEClass = createEClass(ADAPTATION);
		createEReference(adaptationEClass, ADAPTATION__TARGET);
		createEReference(adaptationEClass, ADAPTATION__ADAPTATION);

		semanticsEClass = createEClass(SEMANTICS);
		createEAttribute(semanticsEClass, SEMANTICS__IMPORT_URI);

		specializationEClass = createEClass(SPECIALIZATION);

		beforeEClass = createEClass(BEFORE);

		afterEClass = createEClass(AFTER);

		pointcutEClass = createEClass(POINTCUT);
		createEReference(pointcutEClass, POINTCUT__STRUCTURE);
		createEReference(pointcutEClass, POINTCUT__CONDITIONS);
		createEAttribute(pointcutEClass, POINTCUT__RECURSIVE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__POINTCUTS);
		createEReference(moduleEClass, MODULE__ADAPTATIONS);
		createEAttribute(moduleEClass, MODULE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdaptivesemanticsPackage theAdaptivesemanticsPackage = (AdaptivesemanticsPackage) EPackage.Registry.INSTANCE
				.getEPackage(AdaptivesemanticsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specializationEClass.getESuperTypes().add(this.getAdaptation());
		beforeEClass.getESuperTypes().add(this.getAdaptation());
		afterEClass.getESuperTypes().add(this.getAdaptation());

		// Initialize classes, features, and operations; add parameters
		initEClass(semanticAdaptationEClass, SemanticAdaptation.class, "SemanticAdaptation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemanticAdaptation_Semantics(), this.getSemantics(), null, "semantics", null, 1, 1,
				SemanticAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticAdaptation_Modules(), this.getModule(), null, "modules", null, 0, -1,
				SemanticAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticAdaptation_Model(), theAdaptivesemanticsPackage.getModel(), null, "model", null, 1, 1,
				SemanticAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemanticAdaptation_Imports(), theAdaptivesemanticsPackage.getImport(), null, "imports", null,
				0, -1, SemanticAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationEClass, Adaptation.class, "Adaptation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdaptation_Target(), theAdaptivesemanticsPackage.getRule(), null, "target", null, 1, 1,
				Adaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdaptation_Adaptation(), theAdaptivesemanticsPackage.getRule(), null, "adaptation", null, 1,
				1, Adaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semanticsEClass, Semantics.class, "Semantics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemantics_ImportURI(), ecorePackage.getEString(), "importURI", null, 1, 1, Semantics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(beforeEClass, Before.class, "Before", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(afterEClass, After.class, "After", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointcut_Structure(), theAdaptivesemanticsPackage.getDefConfiguration(), null, "structure",
				null, 1, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointcut_Conditions(), theAdaptivesemanticsPackage.getCondition(), null, "conditions", null,
				0, -1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointcut_Recursive(), theEcorePackage.getEBoolean(), "recursive", null, 0, 1, Pointcut.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, semanticadaptation.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Pointcuts(), this.getPointcut(), null, "pointcuts", null, 0, -1,
				semanticadaptation.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Adaptations(), this.getAdaptation(), null, "adaptations", null, 0, -1,
				semanticadaptation.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Name(), theEcorePackage.getEString(), "name", null, 0, 1,
				semanticadaptation.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SemanticadaptationPackageImpl

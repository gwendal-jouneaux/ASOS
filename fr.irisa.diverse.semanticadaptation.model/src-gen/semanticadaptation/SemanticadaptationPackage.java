/**
 */
package semanticadaptation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see semanticadaptation.SemanticadaptationFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticadaptationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semanticadaptation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.diverse-team.fr/semanticadaptation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "semanticadaptation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticadaptationPackage eINSTANCE = semanticadaptation.impl.SemanticadaptationPackageImpl.init();

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.SemanticAdaptationImpl <em>Semantic Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.SemanticAdaptationImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSemanticAdaptation()
	 * @generated
	 */
	int SEMANTIC_ADAPTATION = 0;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION__SEMANTICS = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION__IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Semantic Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Semantic Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_ADAPTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.AdaptationImpl <em>Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.AdaptationImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getAdaptation()
	 * @generated
	 */
	int ADAPTATION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Adaptation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION__ADAPTATION = 1;

	/**
	 * The number of structural features of the '<em>Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.SemanticsImpl <em>Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.SemanticsImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSemantics()
	 * @generated
	 */
	int SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.SpecializationImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__TARGET = ADAPTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Adaptation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__ADAPTATION = ADAPTATION__ADAPTATION;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = ADAPTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.BeforeImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__TARGET = ADAPTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Adaptation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__ADAPTATION = ADAPTATION__ADAPTATION;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_OPERATION_COUNT = ADAPTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.AfterImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__TARGET = ADAPTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Adaptation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__ADAPTATION = ADAPTATION__ADAPTATION;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = ADAPTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_OPERATION_COUNT = ADAPTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.PointcutImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 6;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__STRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__RECURSIVE = 2;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link semanticadaptation.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semanticadaptation.impl.ModuleImpl
	 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 7;

	/**
	 * The feature id for the '<em><b>Pointcuts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__POINTCUTS = 0;

	/**
	 * The feature id for the '<em><b>Adaptations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ADAPTATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link semanticadaptation.SemanticAdaptation <em>Semantic Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Adaptation</em>'.
	 * @see semanticadaptation.SemanticAdaptation
	 * @generated
	 */
	EClass getSemanticAdaptation();

	/**
	 * Returns the meta object for the containment reference '{@link semanticadaptation.SemanticAdaptation#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semantics</em>'.
	 * @see semanticadaptation.SemanticAdaptation#getSemantics()
	 * @see #getSemanticAdaptation()
	 * @generated
	 */
	EReference getSemanticAdaptation_Semantics();

	/**
	 * Returns the meta object for the containment reference list '{@link semanticadaptation.SemanticAdaptation#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see semanticadaptation.SemanticAdaptation#getModules()
	 * @see #getSemanticAdaptation()
	 * @generated
	 */
	EReference getSemanticAdaptation_Modules();

	/**
	 * Returns the meta object for the containment reference '{@link semanticadaptation.SemanticAdaptation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see semanticadaptation.SemanticAdaptation#getModel()
	 * @see #getSemanticAdaptation()
	 * @generated
	 */
	EReference getSemanticAdaptation_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link semanticadaptation.SemanticAdaptation#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see semanticadaptation.SemanticAdaptation#getImports()
	 * @see #getSemanticAdaptation()
	 * @generated
	 */
	EReference getSemanticAdaptation_Imports();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Adaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptation</em>'.
	 * @see semanticadaptation.Adaptation
	 * @generated
	 */
	EClass getAdaptation();

	/**
	 * Returns the meta object for the reference '{@link semanticadaptation.Adaptation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see semanticadaptation.Adaptation#getTarget()
	 * @see #getAdaptation()
	 * @generated
	 */
	EReference getAdaptation_Target();

	/**
	 * Returns the meta object for the containment reference '{@link semanticadaptation.Adaptation#getAdaptation <em>Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adaptation</em>'.
	 * @see semanticadaptation.Adaptation#getAdaptation()
	 * @see #getAdaptation()
	 * @generated
	 */
	EReference getAdaptation_Adaptation();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Semantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantics</em>'.
	 * @see semanticadaptation.Semantics
	 * @generated
	 */
	EClass getSemantics();

	/**
	 * Returns the meta object for the attribute '{@link semanticadaptation.Semantics#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see semanticadaptation.Semantics#getImportURI()
	 * @see #getSemantics()
	 * @generated
	 */
	EAttribute getSemantics_ImportURI();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see semanticadaptation.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see semanticadaptation.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see semanticadaptation.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see semanticadaptation.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the containment reference '{@link semanticadaptation.Pointcut#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see semanticadaptation.Pointcut#getStructure()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Structure();

	/**
	 * Returns the meta object for the containment reference list '{@link semanticadaptation.Pointcut#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see semanticadaptation.Pointcut#getConditions()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link semanticadaptation.Pointcut#isRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see semanticadaptation.Pointcut#isRecursive()
	 * @see #getPointcut()
	 * @generated
	 */
	EAttribute getPointcut_Recursive();

	/**
	 * Returns the meta object for class '{@link semanticadaptation.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see semanticadaptation.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link semanticadaptation.Module#getPointcuts <em>Pointcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointcuts</em>'.
	 * @see semanticadaptation.Module#getPointcuts()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Pointcuts();

	/**
	 * Returns the meta object for the containment reference list '{@link semanticadaptation.Module#getAdaptations <em>Adaptations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adaptations</em>'.
	 * @see semanticadaptation.Module#getAdaptations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Adaptations();

	/**
	 * Returns the meta object for the attribute '{@link semanticadaptation.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see semanticadaptation.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticadaptationFactory getSemanticadaptationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.SemanticAdaptationImpl <em>Semantic Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.SemanticAdaptationImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSemanticAdaptation()
		 * @generated
		 */
		EClass SEMANTIC_ADAPTATION = eINSTANCE.getSemanticAdaptation();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ADAPTATION__SEMANTICS = eINSTANCE.getSemanticAdaptation_Semantics();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ADAPTATION__MODULES = eINSTANCE.getSemanticAdaptation_Modules();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ADAPTATION__MODEL = eINSTANCE.getSemanticAdaptation_Model();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_ADAPTATION__IMPORTS = eINSTANCE.getSemanticAdaptation_Imports();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.AdaptationImpl <em>Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.AdaptationImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getAdaptation()
		 * @generated
		 */
		EClass ADAPTATION = eINSTANCE.getAdaptation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION__TARGET = eINSTANCE.getAdaptation_Target();

		/**
		 * The meta object literal for the '<em><b>Adaptation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTATION__ADAPTATION = eINSTANCE.getAdaptation_Adaptation();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.SemanticsImpl <em>Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.SemanticsImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSemantics()
		 * @generated
		 */
		EClass SEMANTICS = eINSTANCE.getSemantics();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTICS__IMPORT_URI = eINSTANCE.getSemantics_ImportURI();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.SpecializationImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.BeforeImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.AfterImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.PointcutImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__STRUCTURE = eINSTANCE.getPointcut_Structure();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__CONDITIONS = eINSTANCE.getPointcut_Conditions();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINTCUT__RECURSIVE = eINSTANCE.getPointcut_Recursive();

		/**
		 * The meta object literal for the '{@link semanticadaptation.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semanticadaptation.impl.ModuleImpl
		 * @see semanticadaptation.impl.SemanticadaptationPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Pointcuts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__POINTCUTS = eINSTANCE.getModule_Pointcuts();

		/**
		 * The meta object literal for the '<em><b>Adaptations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ADAPTATIONS = eINSTANCE.getModule_Adaptations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

	}

} //SemanticadaptationPackage

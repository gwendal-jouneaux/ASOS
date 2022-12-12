/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics;

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
 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptivesemanticsFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptivesemanticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adaptivesemantics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.diverse-team.fr/adaptivesemantics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adaptivesemantics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptivesemanticsPackage eINSTANCE = fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.BindingImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 0;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OCL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ASSIGNEE = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl <em>Adaptive Semantics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getAdaptiveSemantics()
	 * @generated
	 */
	int ADAPTIVE_SEMANTICS = 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_SEMANTICS__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_SEMANTICS__RULES = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_SEMANTICS__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Adaptive Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_SEMANTICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Adaptive Semantics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTIVE_SEMANTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConclusionImpl <em>Conclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConclusionImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getConclusion()
	 * @generated
	 */
	int CONCLUSION = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__TO = 1;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION__TERMINATION = 2;

	/**
	 * The number of structural features of the '<em>Conclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCLUSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ImportImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.PremiseImpl <em>Premise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.PremiseImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getPremise()
	 * @generated
	 */
	int PREMISE = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE__TO = 1;

	/**
	 * The feature id for the '<em><b>Termination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE__TERMINATION = 2;

	/**
	 * The number of structural features of the '<em>Premise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Premise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConditionImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Ocl Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OCL_PREDICATE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONCLUSION = 0;

	/**
	 * The feature id for the '<em><b>Premises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PREMISES = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__BINDINGS = 4;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUTPUTS = 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INPUTS = 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ModelImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 7;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORT_URI = 0;

	/**
	 * The feature id for the '<em><b>Semanticdomain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SEMANTICDOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConfigurationImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 14;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONCEPT = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RefConfigurationImpl <em>Ref Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RefConfigurationImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getRefConfiguration()
	 * @generated
	 */
	int REF_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_CONFIGURATION__CONCEPT = CONFIGURATION__CONCEPT;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_CONFIGURATION__CHILDS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.DefConfigurationImpl <em>Def Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.DefConfigurationImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getDefConfiguration()
	 * @generated
	 */
	int DEF_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CONFIGURATION__CONCEPT = CONFIGURATION__CONCEPT;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CONFIGURATION__CHILDS = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Def Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Def Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_CONFIGURATION_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef <em>Term Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getTermDef()
	 * @generated
	 */
	int TERM_DEF = 18;

	/**
	 * The number of structural features of the '<em>Term Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Term Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef <em>Single Term Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSingleTermDef()
	 * @generated
	 */
	int SINGLE_TERM_DEF = 15;

	/**
	 * The number of structural features of the '<em>Single Term Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TERM_DEF_FEATURE_COUNT = TERM_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Term Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TERM_DEF_OPERATION_COUNT = TERM_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolDefImpl <em>Symbol Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolDefImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSymbolDef()
	 * @generated
	 */
	int SYMBOL_DEF = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF__NAME = SINGLE_TERM_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF_FEATURE_COUNT = SINGLE_TERM_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbol Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_DEF_OPERATION_COUNT = SINGLE_TERM_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef <em>Term Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getTermRef()
	 * @generated
	 */
	int TERM_REF = 17;

	/**
	 * The number of structural features of the '<em>Term Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REF_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Term Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef <em>Single Term Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSingleTermRef()
	 * @generated
	 */
	int SINGLE_TERM_REF = 16;

	/**
	 * The number of structural features of the '<em>Single Term Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TERM_REF_FEATURE_COUNT = TERM_REF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Term Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TERM_REF_OPERATION_COUNT = TERM_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolRefImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSymbolRef()
	 * @generated
	 */
	int SYMBOL_REF = 11;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF__DEF = SINGLE_TERM_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_FEATURE_COUNT = SINGLE_TERM_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbol Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_REF_OPERATION_COUNT = SINGLE_TERM_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl <em>List Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getListRef()
	 * @generated
	 */
	int LIST_REF = 12;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REF__HEAD = TERM_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REF__TAIL = TERM_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REF_FEATURE_COUNT = TERM_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REF_OPERATION_COUNT = TERM_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListDefImpl <em>List Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListDefImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getListDef()
	 * @generated
	 */
	int LIST_DEF = 13;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__HEAD = TERM_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF__TAIL = TERM_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF_FEATURE_COUNT = TERM_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_DEF_OPERATION_COUNT = TERM_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.VoidListImpl <em>Void List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.VoidListImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getVoidList()
	 * @generated
	 */
	int VOID_LIST = 19;

	/**
	 * The number of structural features of the '<em>Void List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LIST_FEATURE_COUNT = TERM_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_LIST_OPERATION_COUNT = TERM_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 20;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ASSIGNEE = 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.OutputImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 21;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ARGS = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee <em>Assignee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getAssignee()
	 * @generated
	 */
	int ASSIGNEE = 22;

	/**
	 * The number of structural features of the '<em>Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Assignee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression <em>Domain Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getDomainAccessExpression()
	 * @generated
	 */
	int DOMAIN_ACCESS_EXPRESSION = 24;

	/**
	 * The number of structural features of the '<em>Domain Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ACCESS_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Domain Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ACCESS_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl <em>Semantic Domain Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSemanticDomainAccess()
	 * @generated
	 */
	int SEMANTIC_DOMAIN_ACCESS = 23;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_ACCESS__FIELD = DOMAIN_ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reciever</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_ACCESS__RECIEVER = DOMAIN_ACCESS_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Semantic Domain Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_ACCESS_FEATURE_COUNT = DOMAIN_ACCESS_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Semantic Domain Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_DOMAIN_ACCESS_OPERATION_COUNT = DOMAIN_ACCESS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SelfImpl <em>Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SelfImpl
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSelf()
	 * @generated
	 */
	int SELF = 25;

	/**
	 * The number of structural features of the '<em>Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_FEATURE_COUNT = DOMAIN_ACCESS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_OPERATION_COUNT = DOMAIN_ACCESS_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getOclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Expression</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getOclExpression()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_OclExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignee</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding#getAssignee()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Assignee();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics <em>Adaptive Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptive Semantics</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics
	 * @generated
	 */
	EClass getAdaptiveSemantics();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getImports()
	 * @see #getAdaptiveSemantics()
	 * @generated
	 */
	EReference getAdaptiveSemantics_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getRules()
	 * @see #getAdaptiveSemantics()
	 * @generated
	 */
	EReference getAdaptiveSemantics_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.AdaptiveSemantics#getModel()
	 * @see #getAdaptiveSemantics()
	 * @generated
	 */
	EReference getAdaptiveSemantics_Model();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conclusion</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion
	 * @generated
	 */
	EClass getConclusion();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#getFrom()
	 * @see #getConclusion()
	 * @generated
	 */
	EReference getConclusion_From();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#getTo()
	 * @see #getConclusion()
	 * @generated
	 */
	EReference getConclusion_To();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#isTermination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion#isTermination()
	 * @see #getConclusion()
	 * @generated
	 */
	EAttribute getConclusion_Termination();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Import#getName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise <em>Premise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premise</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise
	 * @generated
	 */
	EClass getPremise();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getFrom()
	 * @see #getPremise()
	 * @generated
	 */
	EReference getPremise_From();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#getTo()
	 * @see #getPremise()
	 * @generated
	 */
	EReference getPremise_To();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#isTermination <em>Termination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise#isTermination()
	 * @see #getPremise()
	 * @generated
	 */
	EAttribute getPremise_Termination();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition#getOclPredicate <em>Ocl Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Predicate</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition#getOclPredicate()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_OclPredicate();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conclusion</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getConclusion()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Conclusion();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getPremises <em>Premises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Premises</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getPremises()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Premises();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getBindings()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getOutputs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule#getInputs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Inputs();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model#getImportURI()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ImportURI();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model#getSemanticdomain <em>Semanticdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semanticdomain</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model#getSemanticdomain()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Semanticdomain();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration <em>Ref Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Configuration</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration
	 * @generated
	 */
	EClass getRefConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration#getChilds()
	 * @see #getRefConfiguration()
	 * @generated
	 */
	EReference getRefConfiguration_Childs();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration <em>Def Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def Configuration</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration
	 * @generated
	 */
	EClass getDefConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration#getChilds()
	 * @see #getDefConfiguration()
	 * @generated
	 */
	EReference getDefConfiguration_Childs();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef <em>Symbol Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Def</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef
	 * @generated
	 */
	EClass getSymbolDef();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef#getName()
	 * @see #getSymbolDef()
	 * @generated
	 */
	EAttribute getSymbolDef_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef <em>Symbol Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Ref</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef
	 * @generated
	 */
	EClass getSymbolRef();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef#getDef()
	 * @see #getSymbolRef()
	 * @generated
	 */
	EReference getSymbolRef_Def();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef <em>List Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Ref</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef
	 * @generated
	 */
	EClass getListRef();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef#getHead()
	 * @see #getListRef()
	 * @generated
	 */
	EReference getListRef_Head();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef#getTail()
	 * @see #getListRef()
	 * @generated
	 */
	EReference getListRef_Tail();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef <em>List Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Def</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef
	 * @generated
	 */
	EClass getListDef();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getHead()
	 * @see #getListDef()
	 * @generated
	 */
	EReference getListDef_Head();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef#getTail()
	 * @see #getListDef()
	 * @generated
	 */
	EReference getListDef_Tail();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Configuration#getConcept()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Concept();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef <em>Single Term Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Term Def</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef
	 * @generated
	 */
	EClass getSingleTermDef();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef <em>Single Term Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Term Ref</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef
	 * @generated
	 */
	EClass getSingleTermRef();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef <em>Term Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Ref</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
	 * @generated
	 */
	EClass getTermRef();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef <em>Term Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Def</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef
	 * @generated
	 */
	EClass getTermDef();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList <em>Void List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void List</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList
	 * @generated
	 */
	EClass getVoidList();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input#getOperation()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignee</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input#getAssignee()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Assignee();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output#getOperation()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output#getArgs()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Args();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignee</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee
	 * @generated
	 */
	EClass getAssignee();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess <em>Semantic Domain Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Domain Access</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess
	 * @generated
	 */
	EClass getSemanticDomainAccess();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getField()
	 * @see #getSemanticDomainAccess()
	 * @generated
	 */
	EAttribute getSemanticDomainAccess_Field();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getReciever <em>Reciever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reciever</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess#getReciever()
	 * @see #getSemanticDomainAccess()
	 * @generated
	 */
	EReference getSemanticDomainAccess_Reciever();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression <em>Domain Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Access Expression</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression
	 * @generated
	 */
	EClass getDomainAccessExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self</em>'.
	 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self
	 * @generated
	 */
	EClass getSelf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdaptivesemanticsFactory getAdaptivesemanticsFactory();

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
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.BindingImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Ocl Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__OCL_EXPRESSION = eINSTANCE.getBinding_OclExpression();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__ASSIGNEE = eINSTANCE.getBinding_Assignee();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl <em>Adaptive Semantics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptiveSemanticsImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getAdaptiveSemantics()
		 * @generated
		 */
		EClass ADAPTIVE_SEMANTICS = eINSTANCE.getAdaptiveSemantics();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTIVE_SEMANTICS__IMPORTS = eINSTANCE.getAdaptiveSemantics_Imports();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTIVE_SEMANTICS__RULES = eINSTANCE.getAdaptiveSemantics_Rules();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADAPTIVE_SEMANTICS__MODEL = eINSTANCE.getAdaptiveSemantics_Model();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConclusionImpl <em>Conclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConclusionImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getConclusion()
		 * @generated
		 */
		EClass CONCLUSION = eINSTANCE.getConclusion();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCLUSION__FROM = eINSTANCE.getConclusion_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCLUSION__TO = eINSTANCE.getConclusion_To();

		/**
		 * The meta object literal for the '<em><b>Termination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCLUSION__TERMINATION = eINSTANCE.getConclusion_Termination();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ImportImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.PremiseImpl <em>Premise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.PremiseImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getPremise()
		 * @generated
		 */
		EClass PREMISE = eINSTANCE.getPremise();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREMISE__FROM = eINSTANCE.getPremise_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREMISE__TO = eINSTANCE.getPremise_To();

		/**
		 * The meta object literal for the '<em><b>Termination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREMISE__TERMINATION = eINSTANCE.getPremise_Termination();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConditionImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Ocl Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OCL_PREDICATE = eINSTANCE.getCondition_OclPredicate();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RuleImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONCLUSION = eINSTANCE.getRule_Conclusion();

		/**
		 * The meta object literal for the '<em><b>Premises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PREMISES = eINSTANCE.getRule_Premises();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITIONS = eINSTANCE.getRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__BINDINGS = eINSTANCE.getRule_Bindings();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUTPUTS = eINSTANCE.getRule_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INPUTS = eINSTANCE.getRule_Inputs();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ModelImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__IMPORT_URI = eINSTANCE.getModel_ImportURI();

		/**
		 * The meta object literal for the '<em><b>Semanticdomain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SEMANTICDOMAIN = eINSTANCE.getModel_Semanticdomain();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RefConfigurationImpl <em>Ref Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.RefConfigurationImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getRefConfiguration()
		 * @generated
		 */
		EClass REF_CONFIGURATION = eINSTANCE.getRefConfiguration();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_CONFIGURATION__CHILDS = eINSTANCE.getRefConfiguration_Childs();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.DefConfigurationImpl <em>Def Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.DefConfigurationImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getDefConfiguration()
		 * @generated
		 */
		EClass DEF_CONFIGURATION = eINSTANCE.getDefConfiguration();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF_CONFIGURATION__CHILDS = eINSTANCE.getDefConfiguration_Childs();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolDefImpl <em>Symbol Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolDefImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSymbolDef()
		 * @generated
		 */
		EClass SYMBOL_DEF = eINSTANCE.getSymbolDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_DEF__NAME = eINSTANCE.getSymbolDef_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SymbolRefImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSymbolRef()
		 * @generated
		 */
		EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_REF__DEF = eINSTANCE.getSymbolRef_Def();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl <em>List Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListRefImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getListRef()
		 * @generated
		 */
		EClass LIST_REF = eINSTANCE.getListRef();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_REF__HEAD = eINSTANCE.getListRef_Head();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_REF__TAIL = eINSTANCE.getListRef_Tail();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListDefImpl <em>List Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ListDefImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getListDef()
		 * @generated
		 */
		EClass LIST_DEF = eINSTANCE.getListDef();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DEF__HEAD = eINSTANCE.getListDef_Head();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_DEF__TAIL = eINSTANCE.getListDef_Tail();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.ConfigurationImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONCEPT = eINSTANCE.getConfiguration_Concept();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef <em>Single Term Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSingleTermDef()
		 * @generated
		 */
		EClass SINGLE_TERM_DEF = eINSTANCE.getSingleTermDef();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef <em>Single Term Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSingleTermRef()
		 * @generated
		 */
		EClass SINGLE_TERM_REF = eINSTANCE.getSingleTermRef();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef <em>Term Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getTermRef()
		 * @generated
		 */
		EClass TERM_REF = eINSTANCE.getTermRef();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef <em>Term Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getTermDef()
		 * @generated
		 */
		EClass TERM_DEF = eINSTANCE.getTermDef();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.VoidListImpl <em>Void List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.VoidListImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getVoidList()
		 * @generated
		 */
		EClass VOID_LIST = eINSTANCE.getVoidList();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.InputImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__OPERATION = eINSTANCE.getInput_Operation();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__ASSIGNEE = eINSTANCE.getInput_Assignee();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.OutputImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OPERATION = eINSTANCE.getOutput_Operation();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ARGS = eINSTANCE.getOutput_Args();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee <em>Assignee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getAssignee()
		 * @generated
		 */
		EClass ASSIGNEE = eINSTANCE.getAssignee();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl <em>Semantic Domain Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SemanticDomainAccessImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSemanticDomainAccess()
		 * @generated
		 */
		EClass SEMANTIC_DOMAIN_ACCESS = eINSTANCE.getSemanticDomainAccess();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_DOMAIN_ACCESS__FIELD = eINSTANCE.getSemanticDomainAccess_Field();

		/**
		 * The meta object literal for the '<em><b>Reciever</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_DOMAIN_ACCESS__RECIEVER = eINSTANCE.getSemanticDomainAccess_Reciever();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression <em>Domain Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getDomainAccessExpression()
		 * @generated
		 */
		EClass DOMAIN_ACCESS_EXPRESSION = eINSTANCE.getDomainAccessExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SelfImpl <em>Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.SelfImpl
		 * @see fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl.AdaptivesemanticsPackageImpl#getSelf()
		 * @generated
		 */
		EClass SELF = eINSTANCE.getSelf();

	}

} //AdaptivesemanticsPackage
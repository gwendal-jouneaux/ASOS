/**
 */
package fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.impl;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptivesemanticsFactoryImpl extends EFactoryImpl implements AdaptivesemanticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptivesemanticsFactory init() {
		try {
			AdaptivesemanticsFactory theAdaptivesemanticsFactory = (AdaptivesemanticsFactory) EPackage.Registry.INSTANCE
					.getEFactory(AdaptivesemanticsPackage.eNS_URI);
			if (theAdaptivesemanticsFactory != null) {
				return theAdaptivesemanticsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptivesemanticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptivesemanticsFactoryImpl() {
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
		case AdaptivesemanticsPackage.BINDING:
			return createBinding();
		case AdaptivesemanticsPackage.ADAPTIVE_SEMANTICS:
			return createAdaptiveSemantics();
		case AdaptivesemanticsPackage.CONCLUSION:
			return createConclusion();
		case AdaptivesemanticsPackage.IMPORT:
			return createImport();
		case AdaptivesemanticsPackage.PREMISE:
			return createPremise();
		case AdaptivesemanticsPackage.CONDITION:
			return createCondition();
		case AdaptivesemanticsPackage.RULE:
			return createRule();
		case AdaptivesemanticsPackage.MODEL:
			return createModel();
		case AdaptivesemanticsPackage.REF_CONFIGURATION:
			return createRefConfiguration();
		case AdaptivesemanticsPackage.DEF_CONFIGURATION:
			return createDefConfiguration();
		case AdaptivesemanticsPackage.SYMBOL_DEF:
			return createSymbolDef();
		case AdaptivesemanticsPackage.SYMBOL_REF:
			return createSymbolRef();
		case AdaptivesemanticsPackage.LIST_REF:
			return createListRef();
		case AdaptivesemanticsPackage.LIST_DEF:
			return createListDef();
		case AdaptivesemanticsPackage.VOID_LIST:
			return createVoidList();
		case AdaptivesemanticsPackage.INPUT:
			return createInput();
		case AdaptivesemanticsPackage.OUTPUT:
			return createOutput();
		case AdaptivesemanticsPackage.SEMANTIC_DOMAIN_ACCESS:
			return createSemanticDomainAccess();
		case AdaptivesemanticsPackage.SELF:
			return createSelf();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptiveSemantics createAdaptiveSemantics() {
		AdaptiveSemanticsImpl adaptiveSemantics = new AdaptiveSemanticsImpl();
		return adaptiveSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion createConclusion() {
		ConclusionImpl conclusion = new ConclusionImpl();
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Premise createPremise() {
		PremiseImpl premise = new PremiseImpl();
		return premise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefConfiguration createRefConfiguration() {
		RefConfigurationImpl refConfiguration = new RefConfigurationImpl();
		return refConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefConfiguration createDefConfiguration() {
		DefConfigurationImpl defConfiguration = new DefConfigurationImpl();
		return defConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolDef createSymbolDef() {
		SymbolDefImpl symbolDef = new SymbolDefImpl();
		return symbolDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolRef createSymbolRef() {
		SymbolRefImpl symbolRef = new SymbolRefImpl();
		return symbolRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRef createListRef() {
		ListRefImpl listRef = new ListRefImpl();
		return listRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListDef createListDef() {
		ListDefImpl listDef = new ListDefImpl();
		return listDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidList createVoidList() {
		VoidListImpl voidList = new VoidListImpl();
		return voidList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticDomainAccess createSemanticDomainAccess() {
		SemanticDomainAccessImpl semanticDomainAccess = new SemanticDomainAccessImpl();
		return semanticDomainAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Self createSelf() {
		SelfImpl self = new SelfImpl();
		return self;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptivesemanticsPackage getAdaptivesemanticsPackage() {
		return (AdaptivesemanticsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptivesemanticsPackage getPackage() {
		return AdaptivesemanticsPackage.eINSTANCE;
	}

} //AdaptivesemanticsFactoryImpl
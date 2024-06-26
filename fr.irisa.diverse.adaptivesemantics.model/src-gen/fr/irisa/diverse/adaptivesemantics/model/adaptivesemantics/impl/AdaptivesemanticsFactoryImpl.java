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
		case AdaptivesemanticsPackage.EQUAL:
			return createEqual();
		case AdaptivesemanticsPackage.NOT_EQUAL:
			return createNotEqual();
		case AdaptivesemanticsPackage.OR:
			return createOr();
		case AdaptivesemanticsPackage.AND:
			return createAnd();
		case AdaptivesemanticsPackage.NOT:
			return createNot();
		case AdaptivesemanticsPackage.LESS:
			return createLess();
		case AdaptivesemanticsPackage.LESS_EQ:
			return createLessEq();
		case AdaptivesemanticsPackage.DIV:
			return createDiv();
		case AdaptivesemanticsPackage.MULT:
			return createMult();
		case AdaptivesemanticsPackage.MINUS:
			return createMinus();
		case AdaptivesemanticsPackage.PLUS:
			return createPlus();
		case AdaptivesemanticsPackage.INT_CONSTANT:
			return createIntConstant();
		case AdaptivesemanticsPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case AdaptivesemanticsPackage.STRING_CONSTANT:
			return createStringConstant();
		case AdaptivesemanticsPackage.DOUBLE_CONSTANT:
			return createDoubleConstant();
		case AdaptivesemanticsPackage.OPPOSITE:
			return createOpposite();
		case AdaptivesemanticsPackage.IS:
			return createIs();
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
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessEq createLessEq() {
		LessEqImpl lessEq = new LessEqImpl();
		return lessEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleConstant createDoubleConstant() {
		DoubleConstantImpl doubleConstant = new DoubleConstantImpl();
		return doubleConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opposite createOpposite() {
		OppositeImpl opposite = new OppositeImpl();
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Is createIs() {
		IsImpl is = new IsImpl();
		return is;
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

/**
 */
package impModLangConfiguration.impl;

import impModLang.ImpModLangPackage;

import impModLang.impl.ImpModLangPackageImpl;

import impModLangConfiguration.AssignmentConfiguration;
import impModLangConfiguration.ConditionConfiguration;
import impModLangConfiguration.ExpressionConfiguration;
import impModLangConfiguration.GotoConfiguration;
import impModLangConfiguration.MarkConfiguration;
import impModLangConfiguration.ModelConfiguration;
import impModLangConfiguration.VariableConfiguration;
import impModLangConfiguration.impModLangConfigurationFactory;
import impModLangConfiguration.impModLangConfigurationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class impModLangConfigurationPackageImpl extends EPackageImpl implements impModLangConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gotoConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionConfigurationEClass = null;

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
	 * @see impModLangConfiguration.impModLangConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private impModLangConfigurationPackageImpl() {
		super(eNS_URI, impModLangConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link impModLangConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static impModLangConfigurationPackage init() {
		if (isInited) return (impModLangConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(impModLangConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		impModLangConfigurationPackageImpl theimpModLangConfigurationPackage = (impModLangConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof impModLangConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new impModLangConfigurationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ImpModLangPackageImpl theImpModLangPackage = (ImpModLangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImpModLangPackage.eNS_URI) instanceof ImpModLangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImpModLangPackage.eNS_URI) : ImpModLangPackage.eINSTANCE);

		// Create package meta-data objects
		theimpModLangConfigurationPackage.createPackageContents();
		theImpModLangPackage.createPackageContents();

		// Initialize created meta-data
		theimpModLangConfigurationPackage.initializePackageContents();
		theImpModLangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theimpModLangConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(impModLangConfigurationPackage.eNS_URI, theimpModLangConfigurationPackage);
		return theimpModLangConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelConfiguration() {
		return modelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelConfiguration_StatementPointer() {
		return (EAttribute)modelConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentConfiguration() {
		return assignmentConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkConfiguration() {
		return markConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGotoConfiguration() {
		return gotoConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionConfiguration() {
		return conditionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableConfiguration() {
		return variableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableConfiguration_CurrentValue() {
		return (EAttribute)variableConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionConfiguration() {
		return expressionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impModLangConfigurationFactory getimpModLangConfigurationFactory() {
		return (impModLangConfigurationFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelConfigurationEClass = createEClass(MODEL_CONFIGURATION);
		createEAttribute(modelConfigurationEClass, MODEL_CONFIGURATION__STATEMENT_POINTER);

		assignmentConfigurationEClass = createEClass(ASSIGNMENT_CONFIGURATION);

		markConfigurationEClass = createEClass(MARK_CONFIGURATION);

		gotoConfigurationEClass = createEClass(GOTO_CONFIGURATION);

		conditionConfigurationEClass = createEClass(CONDITION_CONFIGURATION);

		variableConfigurationEClass = createEClass(VARIABLE_CONFIGURATION);
		createEAttribute(variableConfigurationEClass, VARIABLE_CONFIGURATION__CURRENT_VALUE);

		expressionConfigurationEClass = createEClass(EXPRESSION_CONFIGURATION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ImpModLangPackage theImpModLangPackage = (ImpModLangPackage)EPackage.Registry.INSTANCE.getEPackage(ImpModLangPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getModel());
		assignmentConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getAssignment());
		markConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getMark());
		gotoConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getGoto());
		conditionConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getCondition());
		variableConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getVariable());
		expressionConfigurationEClass.getESuperTypes().add(theImpModLangPackage.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(modelConfigurationEClass, ModelConfiguration.class, "ModelConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelConfiguration_StatementPointer(), ecorePackage.getEInt(), "statementPointer", null, 0, 1, ModelConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentConfigurationEClass, AssignmentConfiguration.class, "AssignmentConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(assignmentConfigurationEClass, null, "assignmentExecution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(markConfigurationEClass, MarkConfiguration.class, "MarkConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gotoConfigurationEClass, GotoConfiguration.class, "GotoConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(gotoConfigurationEClass, ecorePackage.getEInt(), "getStatementIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionConfigurationEClass, ConditionConfiguration.class, "ConditionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(conditionConfigurationEClass, ecorePackage.getEBoolean(), "evaluateCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableConfigurationEClass, VariableConfiguration.class, "VariableConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableConfiguration_CurrentValue(), ecorePackage.getEInt(), "currentValue", null, 0, 1, VariableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionConfigurationEClass, ExpressionConfiguration.class, "ExpressionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //impModLangConfigurationPackageImpl

/**
 */
package impModLangConfiguration;

import impModLang.ImpModLangPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see impModLangConfiguration.impModLangConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface impModLangConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "impModLangConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ImpModLang/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "impModLangConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	impModLangConfigurationPackage eINSTANCE = impModLangConfiguration.impl.impModLangConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.ModelConfigurationImpl <em>Model Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.ModelConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getModelConfiguration()
	 * @generated
	 */
	int MODEL_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIGURATION__VARIABLES = ImpModLangPackage.MODEL__VARIABLES;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIGURATION__STATEMENTS = ImpModLangPackage.MODEL__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Statement Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIGURATION__STATEMENT_POINTER = ImpModLangPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.AssignmentConfigurationImpl <em>Assignment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.AssignmentConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getAssignmentConfiguration()
	 * @generated
	 */
	int ASSIGNMENT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONFIGURATION__MODEL = ImpModLangPackage.ASSIGNMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONFIGURATION__MARK = ImpModLangPackage.ASSIGNMENT__MARK;

	/**
	 * The feature id for the '<em><b>Write To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONFIGURATION__WRITE_TO = ImpModLangPackage.ASSIGNMENT__WRITE_TO;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONFIGURATION__EXP = ImpModLangPackage.ASSIGNMENT__EXP;

	/**
	 * The number of structural features of the '<em>Assignment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.MarkConfigurationImpl <em>Mark Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.MarkConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getMarkConfiguration()
	 * @generated
	 */
	int MARK_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CONFIGURATION__NAME = ImpModLangPackage.MARK__NAME;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CONFIGURATION__ASSIGNMENT = ImpModLangPackage.MARK__ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>Mark Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.MARK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.GotoConfigurationImpl <em>Goto Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.GotoConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getGotoConfiguration()
	 * @generated
	 */
	int GOTO_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_CONFIGURATION__MODEL = ImpModLangPackage.GOTO__MODEL;

	/**
	 * The feature id for the '<em><b>Goto Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_CONFIGURATION__GOTO_MARK = ImpModLangPackage.GOTO__GOTO_MARK;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_CONFIGURATION__COND = ImpModLangPackage.GOTO__COND;

	/**
	 * The number of structural features of the '<em>Goto Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.GOTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.ConditionConfigurationImpl <em>Condition Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.ConditionConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getConditionConfiguration()
	 * @generated
	 */
	int CONDITION_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Par1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONFIGURATION__PAR1 = ImpModLangPackage.CONDITION__PAR1;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONFIGURATION__COMP = ImpModLangPackage.CONDITION__COMP;

	/**
	 * The feature id for the '<em><b>Par2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONFIGURATION__PAR2 = ImpModLangPackage.CONDITION__PAR2;

	/**
	 * The number of structural features of the '<em>Condition Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.VariableConfigurationImpl <em>Variable Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.VariableConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getVariableConfiguration()
	 * @generated
	 */
	int VARIABLE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONFIGURATION__NAME = ImpModLangPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONFIGURATION__VALUE = ImpModLangPackage.VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONFIGURATION__CURRENT_VALUE = ImpModLangPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link impModLangConfiguration.impl.ExpressionConfigurationImpl <em>Expression Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLangConfiguration.impl.ExpressionConfigurationImpl
	 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getExpressionConfiguration()
	 * @generated
	 */
	int EXPRESSION_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONFIGURATION__X = ImpModLangPackage.EXPRESSION__X;

	/**
	 * The feature id for the '<em><b>Calc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONFIGURATION__CALC = ImpModLangPackage.EXPRESSION__CALC;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONFIGURATION__Y = ImpModLangPackage.EXPRESSION__Y;

	/**
	 * The number of structural features of the '<em>Expression Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONFIGURATION_FEATURE_COUNT = ImpModLangPackage.EXPRESSION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.ModelConfiguration <em>Model Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Configuration</em>'.
	 * @see impModLangConfiguration.ModelConfiguration
	 * @generated
	 */
	EClass getModelConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link impModLangConfiguration.ModelConfiguration#getStatementPointer <em>Statement Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Pointer</em>'.
	 * @see impModLangConfiguration.ModelConfiguration#getStatementPointer()
	 * @see #getModelConfiguration()
	 * @generated
	 */
	EAttribute getModelConfiguration_StatementPointer();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.AssignmentConfiguration <em>Assignment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Configuration</em>'.
	 * @see impModLangConfiguration.AssignmentConfiguration
	 * @generated
	 */
	EClass getAssignmentConfiguration();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.MarkConfiguration <em>Mark Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Configuration</em>'.
	 * @see impModLangConfiguration.MarkConfiguration
	 * @generated
	 */
	EClass getMarkConfiguration();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.GotoConfiguration <em>Goto Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto Configuration</em>'.
	 * @see impModLangConfiguration.GotoConfiguration
	 * @generated
	 */
	EClass getGotoConfiguration();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.ConditionConfiguration <em>Condition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Configuration</em>'.
	 * @see impModLangConfiguration.ConditionConfiguration
	 * @generated
	 */
	EClass getConditionConfiguration();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.VariableConfiguration <em>Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Configuration</em>'.
	 * @see impModLangConfiguration.VariableConfiguration
	 * @generated
	 */
	EClass getVariableConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link impModLangConfiguration.VariableConfiguration#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see impModLangConfiguration.VariableConfiguration#getCurrentValue()
	 * @see #getVariableConfiguration()
	 * @generated
	 */
	EAttribute getVariableConfiguration_CurrentValue();

	/**
	 * Returns the meta object for class '{@link impModLangConfiguration.ExpressionConfiguration <em>Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Configuration</em>'.
	 * @see impModLangConfiguration.ExpressionConfiguration
	 * @generated
	 */
	EClass getExpressionConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	impModLangConfigurationFactory getimpModLangConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.ModelConfigurationImpl <em>Model Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.ModelConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getModelConfiguration()
		 * @generated
		 */
		EClass MODEL_CONFIGURATION = eINSTANCE.getModelConfiguration();

		/**
		 * The meta object literal for the '<em><b>Statement Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_CONFIGURATION__STATEMENT_POINTER = eINSTANCE.getModelConfiguration_StatementPointer();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.AssignmentConfigurationImpl <em>Assignment Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.AssignmentConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getAssignmentConfiguration()
		 * @generated
		 */
		EClass ASSIGNMENT_CONFIGURATION = eINSTANCE.getAssignmentConfiguration();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.MarkConfigurationImpl <em>Mark Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.MarkConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getMarkConfiguration()
		 * @generated
		 */
		EClass MARK_CONFIGURATION = eINSTANCE.getMarkConfiguration();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.GotoConfigurationImpl <em>Goto Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.GotoConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getGotoConfiguration()
		 * @generated
		 */
		EClass GOTO_CONFIGURATION = eINSTANCE.getGotoConfiguration();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.ConditionConfigurationImpl <em>Condition Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.ConditionConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getConditionConfiguration()
		 * @generated
		 */
		EClass CONDITION_CONFIGURATION = eINSTANCE.getConditionConfiguration();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.VariableConfigurationImpl <em>Variable Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.VariableConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getVariableConfiguration()
		 * @generated
		 */
		EClass VARIABLE_CONFIGURATION = eINSTANCE.getVariableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_CONFIGURATION__CURRENT_VALUE = eINSTANCE.getVariableConfiguration_CurrentValue();

		/**
		 * The meta object literal for the '{@link impModLangConfiguration.impl.ExpressionConfigurationImpl <em>Expression Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLangConfiguration.impl.ExpressionConfigurationImpl
		 * @see impModLangConfiguration.impl.impModLangConfigurationPackageImpl#getExpressionConfiguration()
		 * @generated
		 */
		EClass EXPRESSION_CONFIGURATION = eINSTANCE.getExpressionConfiguration();

	}

} //impModLangConfigurationPackage

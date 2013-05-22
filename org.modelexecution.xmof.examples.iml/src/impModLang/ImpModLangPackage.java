/**
 */
package impModLang;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see impModLang.ImpModLangFactory
 * @model kind="package"
 * @generated
 */
public interface ImpModLangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "impModLang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ImpModLang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "impModLang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpModLangPackage eINSTANCE = impModLang.impl.ImpModLangPackageImpl.init();

	/**
	 * The meta object id for the '{@link impModLang.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.ModelImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__STATEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link impModLang.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.StatementImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link impModLang.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.AssignmentImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MODEL = STATEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__MARK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Write To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__WRITE_TO = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXP = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link impModLang.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.MarkImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK__ASSIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link impModLang.impl.GotoImpl <em>Goto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.GotoImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getGoto()
	 * @generated
	 */
	int GOTO = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__MODEL = STATEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Goto Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__GOTO_MARK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__COND = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link impModLang.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.ConditionImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Par1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PAR1 = 0;

	/**
	 * The feature id for the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMP = 1;

	/**
	 * The feature id for the '<em><b>Par2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PAR2 = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link impModLang.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.VariableImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link impModLang.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see impModLang.impl.ExpressionImpl
	 * @see impModLang.impl.ImpModLangPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__X = 0;

	/**
	 * The feature id for the '<em><b>Calc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CALC = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__Y = 2;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link impModLang.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see impModLang.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link impModLang.Model#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see impModLang.Model#getVariables()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link impModLang.Model#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see impModLang.Model#getStatements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Statements();

	/**
	 * Returns the meta object for class '{@link impModLang.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see impModLang.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link impModLang.Assignment#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mark</em>'.
	 * @see impModLang.Assignment#getMark()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Mark();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Assignment#getWriteTo <em>Write To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Write To</em>'.
	 * @see impModLang.Assignment#getWriteTo()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_WriteTo();

	/**
	 * Returns the meta object for the containment reference '{@link impModLang.Assignment#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see impModLang.Assignment#getExp()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Exp();

	/**
	 * Returns the meta object for class '{@link impModLang.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see impModLang.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for the attribute '{@link impModLang.Mark#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see impModLang.Mark#getName()
	 * @see #getMark()
	 * @generated
	 */
	EAttribute getMark_Name();

	/**
	 * Returns the meta object for the container reference '{@link impModLang.Mark#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assignment</em>'.
	 * @see impModLang.Mark#getAssignment()
	 * @see #getMark()
	 * @generated
	 */
	EReference getMark_Assignment();

	/**
	 * Returns the meta object for class '{@link impModLang.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto</em>'.
	 * @see impModLang.Goto
	 * @generated
	 */
	EClass getGoto();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Goto#getGotoMark <em>Goto Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goto Mark</em>'.
	 * @see impModLang.Goto#getGotoMark()
	 * @see #getGoto()
	 * @generated
	 */
	EReference getGoto_GotoMark();

	/**
	 * Returns the meta object for the containment reference '{@link impModLang.Goto#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see impModLang.Goto#getCond()
	 * @see #getGoto()
	 * @generated
	 */
	EReference getGoto_Cond();

	/**
	 * Returns the meta object for class '{@link impModLang.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see impModLang.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Condition#getPar1 <em>Par1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Par1</em>'.
	 * @see impModLang.Condition#getPar1()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Par1();

	/**
	 * Returns the meta object for the attribute '{@link impModLang.Condition#getComp <em>Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp</em>'.
	 * @see impModLang.Condition#getComp()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Comp();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Condition#getPar2 <em>Par2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Par2</em>'.
	 * @see impModLang.Condition#getPar2()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Par2();

	/**
	 * Returns the meta object for class '{@link impModLang.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see impModLang.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link impModLang.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see impModLang.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link impModLang.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see impModLang.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link impModLang.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see impModLang.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Expression#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see impModLang.Expression#getX()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_X();

	/**
	 * Returns the meta object for the attribute '{@link impModLang.Expression#getCalc <em>Calc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calc</em>'.
	 * @see impModLang.Expression#getCalc()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Calc();

	/**
	 * Returns the meta object for the reference '{@link impModLang.Expression#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Y</em>'.
	 * @see impModLang.Expression#getY()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Y();

	/**
	 * Returns the meta object for class '{@link impModLang.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see impModLang.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the container reference '{@link impModLang.Statement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see impModLang.Statement#getModel()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImpModLangFactory getImpModLangFactory();

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
		 * The meta object literal for the '{@link impModLang.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.ModelImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__VARIABLES = eINSTANCE.getModel_Variables();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

		/**
		 * The meta object literal for the '{@link impModLang.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.AssignmentImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__MARK = eINSTANCE.getAssignment_Mark();

		/**
		 * The meta object literal for the '<em><b>Write To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__WRITE_TO = eINSTANCE.getAssignment_WriteTo();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__EXP = eINSTANCE.getAssignment_Exp();

		/**
		 * The meta object literal for the '{@link impModLang.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.MarkImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK__NAME = eINSTANCE.getMark_Name();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK__ASSIGNMENT = eINSTANCE.getMark_Assignment();

		/**
		 * The meta object literal for the '{@link impModLang.impl.GotoImpl <em>Goto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.GotoImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getGoto()
		 * @generated
		 */
		EClass GOTO = eINSTANCE.getGoto();

		/**
		 * The meta object literal for the '<em><b>Goto Mark</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOTO__GOTO_MARK = eINSTANCE.getGoto_GotoMark();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOTO__COND = eINSTANCE.getGoto_Cond();

		/**
		 * The meta object literal for the '{@link impModLang.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.ConditionImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Par1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PAR1 = eINSTANCE.getCondition_Par1();

		/**
		 * The meta object literal for the '<em><b>Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMP = eINSTANCE.getCondition_Comp();

		/**
		 * The meta object literal for the '<em><b>Par2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__PAR2 = eINSTANCE.getCondition_Par2();

		/**
		 * The meta object literal for the '{@link impModLang.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.VariableImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link impModLang.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.ExpressionImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__X = eINSTANCE.getExpression_X();

		/**
		 * The meta object literal for the '<em><b>Calc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__CALC = eINSTANCE.getExpression_Calc();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__Y = eINSTANCE.getExpression_Y();

		/**
		 * The meta object literal for the '{@link impModLang.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see impModLang.impl.StatementImpl
		 * @see impModLang.impl.ImpModLangPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__MODEL = eINSTANCE.getStatement_Model();

	}

} //ImpModLangPackage

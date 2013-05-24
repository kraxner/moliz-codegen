/**
 */
package impModLangConfiguration.util;

import impModLang.Assignment;
import impModLang.Condition;
import impModLang.Expression;
import impModLang.Goto;
import impModLang.Mark;
import impModLang.Model;
import impModLang.Statement;
import impModLang.Variable;

import impModLangConfiguration.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see impModLangConfiguration.impModLangConfigurationPackage
 * @generated
 */
public class impModLangConfigurationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static impModLangConfigurationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impModLangConfigurationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = impModLangConfigurationPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected impModLangConfigurationSwitch<Adapter> modelSwitch =
		new impModLangConfigurationSwitch<Adapter>() {
			@Override
			public Adapter caseModelConfiguration(ModelConfiguration object) {
				return createModelConfigurationAdapter();
			}
			@Override
			public Adapter caseAssignmentConfiguration(AssignmentConfiguration object) {
				return createAssignmentConfigurationAdapter();
			}
			@Override
			public Adapter caseMarkConfiguration(MarkConfiguration object) {
				return createMarkConfigurationAdapter();
			}
			@Override
			public Adapter caseGotoConfiguration(GotoConfiguration object) {
				return createGotoConfigurationAdapter();
			}
			@Override
			public Adapter caseConditionConfiguration(ConditionConfiguration object) {
				return createConditionConfigurationAdapter();
			}
			@Override
			public Adapter caseVariableConfiguration(VariableConfiguration object) {
				return createVariableConfigurationAdapter();
			}
			@Override
			public Adapter caseExpressionConfiguration(ExpressionConfiguration object) {
				return createExpressionConfigurationAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseMark(Mark object) {
				return createMarkAdapter();
			}
			@Override
			public Adapter caseGoto(Goto object) {
				return createGotoAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.ModelConfiguration <em>Model Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.ModelConfiguration
	 * @generated
	 */
	public Adapter createModelConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.AssignmentConfiguration <em>Assignment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.AssignmentConfiguration
	 * @generated
	 */
	public Adapter createAssignmentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.MarkConfiguration <em>Mark Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.MarkConfiguration
	 * @generated
	 */
	public Adapter createMarkConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.GotoConfiguration <em>Goto Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.GotoConfiguration
	 * @generated
	 */
	public Adapter createGotoConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.ConditionConfiguration <em>Condition Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.ConditionConfiguration
	 * @generated
	 */
	public Adapter createConditionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.VariableConfiguration <em>Variable Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.VariableConfiguration
	 * @generated
	 */
	public Adapter createVariableConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLangConfiguration.ExpressionConfiguration <em>Expression Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLangConfiguration.ExpressionConfiguration
	 * @generated
	 */
	public Adapter createExpressionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Goto
	 * @generated
	 */
	public Adapter createGotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link impModLang.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see impModLang.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
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

} //impModLangConfigurationAdapterFactory

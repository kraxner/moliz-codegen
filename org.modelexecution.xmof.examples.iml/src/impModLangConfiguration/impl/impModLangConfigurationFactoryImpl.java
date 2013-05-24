/**
 */
package impModLangConfiguration.impl;

import impModLangConfiguration.*;

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
public class impModLangConfigurationFactoryImpl extends EFactoryImpl implements impModLangConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static impModLangConfigurationFactory init() {
		try {
			impModLangConfigurationFactory theimpModLangConfigurationFactory = (impModLangConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ImpModLang/configuration"); 
			if (theimpModLangConfigurationFactory != null) {
				return theimpModLangConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new impModLangConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impModLangConfigurationFactoryImpl() {
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
			case impModLangConfigurationPackage.MODEL_CONFIGURATION: return createModelConfiguration();
			case impModLangConfigurationPackage.ASSIGNMENT_CONFIGURATION: return createAssignmentConfiguration();
			case impModLangConfigurationPackage.MARK_CONFIGURATION: return createMarkConfiguration();
			case impModLangConfigurationPackage.GOTO_CONFIGURATION: return createGotoConfiguration();
			case impModLangConfigurationPackage.CONDITION_CONFIGURATION: return createConditionConfiguration();
			case impModLangConfigurationPackage.VARIABLE_CONFIGURATION: return createVariableConfiguration();
			case impModLangConfigurationPackage.EXPRESSION_CONFIGURATION: return createExpressionConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConfiguration createModelConfiguration() {
		ModelConfigurationImpl modelConfiguration = new ModelConfigurationImpl();
		return modelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentConfiguration createAssignmentConfiguration() {
		AssignmentConfigurationImpl assignmentConfiguration = new AssignmentConfigurationImpl();
		return assignmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkConfiguration createMarkConfiguration() {
		MarkConfigurationImpl markConfiguration = new MarkConfigurationImpl();
		return markConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GotoConfiguration createGotoConfiguration() {
		GotoConfigurationImpl gotoConfiguration = new GotoConfigurationImpl();
		return gotoConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionConfiguration createConditionConfiguration() {
		ConditionConfigurationImpl conditionConfiguration = new ConditionConfigurationImpl();
		return conditionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableConfiguration createVariableConfiguration() {
		VariableConfigurationImpl variableConfiguration = new VariableConfigurationImpl();
		return variableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionConfiguration createExpressionConfiguration() {
		ExpressionConfigurationImpl expressionConfiguration = new ExpressionConfigurationImpl();
		return expressionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impModLangConfigurationPackage getimpModLangConfigurationPackage() {
		return (impModLangConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static impModLangConfigurationPackage getPackage() {
		return impModLangConfigurationPackage.eINSTANCE;
	}

} //impModLangConfigurationFactoryImpl

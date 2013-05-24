/**
 */
package impModLangConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see impModLangConfiguration.impModLangConfigurationPackage
 * @generated
 */
public interface impModLangConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	impModLangConfigurationFactory eINSTANCE = impModLangConfiguration.impl.impModLangConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Configuration</em>'.
	 * @generated
	 */
	ModelConfiguration createModelConfiguration();

	/**
	 * Returns a new object of class '<em>Assignment Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Configuration</em>'.
	 * @generated
	 */
	AssignmentConfiguration createAssignmentConfiguration();

	/**
	 * Returns a new object of class '<em>Mark Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Configuration</em>'.
	 * @generated
	 */
	MarkConfiguration createMarkConfiguration();

	/**
	 * Returns a new object of class '<em>Goto Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goto Configuration</em>'.
	 * @generated
	 */
	GotoConfiguration createGotoConfiguration();

	/**
	 * Returns a new object of class '<em>Condition Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Configuration</em>'.
	 * @generated
	 */
	ConditionConfiguration createConditionConfiguration();

	/**
	 * Returns a new object of class '<em>Variable Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Configuration</em>'.
	 * @generated
	 */
	VariableConfiguration createVariableConfiguration();

	/**
	 * Returns a new object of class '<em>Expression Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Configuration</em>'.
	 * @generated
	 */
	ExpressionConfiguration createExpressionConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	impModLangConfigurationPackage getimpModLangConfigurationPackage();

} //impModLangConfigurationFactory

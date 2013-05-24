/**
 */
package impModLangConfiguration;

import impModLang.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLangConfiguration.VariableConfiguration#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLangConfiguration.impModLangConfigurationPackage#getVariableConfiguration()
 * @model
 * @generated
 */
public interface VariableConfiguration extends Variable {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(int)
	 * @see impModLangConfiguration.impModLangConfigurationPackage#getVariableConfiguration_CurrentValue()
	 * @model
	 * @generated
	 */
	int getCurrentValue();

	/**
	 * Sets the value of the '{@link impModLangConfiguration.VariableConfiguration#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(int value);

} // VariableConfiguration

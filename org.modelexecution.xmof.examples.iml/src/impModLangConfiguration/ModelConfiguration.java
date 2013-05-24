/**
 */
package impModLangConfiguration;

import impModLang.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLangConfiguration.ModelConfiguration#getStatementPointer <em>Statement Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLangConfiguration.impModLangConfigurationPackage#getModelConfiguration()
 * @model
 * @generated
 */
public interface ModelConfiguration extends Model {
	/**
	 * Returns the value of the '<em><b>Statement Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Pointer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Pointer</em>' attribute.
	 * @see #setStatementPointer(int)
	 * @see impModLangConfiguration.impModLangConfigurationPackage#getModelConfiguration_StatementPointer()
	 * @model
	 * @generated
	 */
	int getStatementPointer();

	/**
	 * Sets the value of the '{@link impModLangConfiguration.ModelConfiguration#getStatementPointer <em>Statement Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Pointer</em>' attribute.
	 * @see #getStatementPointer()
	 * @generated
	 */
	void setStatementPointer(int value);

} // ModelConfiguration

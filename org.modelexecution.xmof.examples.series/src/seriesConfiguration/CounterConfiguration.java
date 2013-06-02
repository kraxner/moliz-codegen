/**
 */
package seriesConfiguration;

import series.Counter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link seriesConfiguration.CounterConfiguration#getInit <em>Init</em>}</li>
 *   <li>{@link seriesConfiguration.CounterConfiguration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see seriesConfiguration.SeriesConfigurationPackage#getCounterConfiguration()
 * @model
 * @generated
 */
public interface CounterConfiguration extends Counter {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Initialization)
	 * @see seriesConfiguration.SeriesConfigurationPackage#getCounterConfiguration_Init()
	 * @model containment="true"
	 * @generated
	 */
	Initialization getInit();

	/**
	 * Sets the value of the '{@link seriesConfiguration.CounterConfiguration#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Initialization value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see seriesConfiguration.SeriesConfigurationPackage#getCounterConfiguration_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link seriesConfiguration.CounterConfiguration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // CounterConfiguration

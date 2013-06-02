/**
 */
package seriesConfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see seriesConfiguration.SeriesConfigurationPackage
 * @generated
 */
public interface SeriesConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeriesConfigurationFactory eINSTANCE = seriesConfiguration.impl.SeriesConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Counter Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Configuration</em>'.
	 * @generated
	 */
	CounterConfiguration createCounterConfiguration();

	/**
	 * Returns a new object of class '<em>Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialization</em>'.
	 * @generated
	 */
	Initialization createInitialization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeriesConfigurationPackage getSeriesConfigurationPackage();

} //SeriesConfigurationFactory

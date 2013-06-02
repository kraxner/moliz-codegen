/**
 */
package seriesConfiguration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import series.SeriesPackage;

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
 * @see seriesConfiguration.SeriesConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface SeriesConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seriesConfiguration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://series.examples.org/configuration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "seriesConf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeriesConfigurationPackage eINSTANCE = seriesConfiguration.impl.SeriesConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link seriesConfiguration.impl.CounterConfigurationImpl <em>Counter Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seriesConfiguration.impl.CounterConfigurationImpl
	 * @see seriesConfiguration.impl.SeriesConfigurationPackageImpl#getCounterConfiguration()
	 * @generated
	 */
	int COUNTER_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CONFIGURATION__LIMIT = SeriesPackage.COUNTER__LIMIT;

	/**
	 * The feature id for the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CONFIGURATION__START_VALUE = SeriesPackage.COUNTER__START_VALUE;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CONFIGURATION__INIT = SeriesPackage.COUNTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CONFIGURATION__VALUE = SeriesPackage.COUNTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Counter Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_CONFIGURATION_FEATURE_COUNT = SeriesPackage.COUNTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link seriesConfiguration.impl.InitializationImpl <em>Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see seriesConfiguration.impl.InitializationImpl
	 * @see seriesConfiguration.impl.SeriesConfigurationPackageImpl#getInitialization()
	 * @generated
	 */
	int INITIALIZATION = 1;

	/**
	 * The number of structural features of the '<em>Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link seriesConfiguration.CounterConfiguration <em>Counter Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Configuration</em>'.
	 * @see seriesConfiguration.CounterConfiguration
	 * @generated
	 */
	EClass getCounterConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link seriesConfiguration.CounterConfiguration#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see seriesConfiguration.CounterConfiguration#getInit()
	 * @see #getCounterConfiguration()
	 * @generated
	 */
	EReference getCounterConfiguration_Init();

	/**
	 * Returns the meta object for the attribute '{@link seriesConfiguration.CounterConfiguration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see seriesConfiguration.CounterConfiguration#getValue()
	 * @see #getCounterConfiguration()
	 * @generated
	 */
	EAttribute getCounterConfiguration_Value();

	/**
	 * Returns the meta object for class '{@link seriesConfiguration.Initialization <em>Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization</em>'.
	 * @see seriesConfiguration.Initialization
	 * @generated
	 */
	EClass getInitialization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeriesConfigurationFactory getSeriesConfigurationFactory();

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
		 * The meta object literal for the '{@link seriesConfiguration.impl.CounterConfigurationImpl <em>Counter Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seriesConfiguration.impl.CounterConfigurationImpl
		 * @see seriesConfiguration.impl.SeriesConfigurationPackageImpl#getCounterConfiguration()
		 * @generated
		 */
		EClass COUNTER_CONFIGURATION = eINSTANCE.getCounterConfiguration();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER_CONFIGURATION__INIT = eINSTANCE.getCounterConfiguration_Init();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER_CONFIGURATION__VALUE = eINSTANCE.getCounterConfiguration_Value();

		/**
		 * The meta object literal for the '{@link seriesConfiguration.impl.InitializationImpl <em>Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see seriesConfiguration.impl.InitializationImpl
		 * @see seriesConfiguration.impl.SeriesConfigurationPackageImpl#getInitialization()
		 * @generated
		 */
		EClass INITIALIZATION = eINSTANCE.getInitialization();

	}

} //SeriesConfigurationPackage

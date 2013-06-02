/**
 */
package seriesConfiguration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import seriesConfiguration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeriesConfigurationFactoryImpl extends EFactoryImpl implements SeriesConfigurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeriesConfigurationFactory init() {
		try {
			SeriesConfigurationFactory theSeriesConfigurationFactory = (SeriesConfigurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://series.examples.org/configuration"); 
			if (theSeriesConfigurationFactory != null) {
				return theSeriesConfigurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeriesConfigurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesConfigurationFactoryImpl() {
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
			case SeriesConfigurationPackage.COUNTER_CONFIGURATION: return createCounterConfiguration();
			case SeriesConfigurationPackage.INITIALIZATION: return createInitialization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterConfiguration createCounterConfiguration() {
		CounterConfigurationImpl counterConfiguration = new CounterConfigurationImpl();
		return counterConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialization createInitialization() {
		InitializationImpl initialization = new InitializationImpl();
		return initialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesConfigurationPackage getSeriesConfigurationPackage() {
		return (SeriesConfigurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SeriesConfigurationPackage getPackage() {
		return SeriesConfigurationPackage.eINSTANCE;
	}

} //SeriesConfigurationFactoryImpl

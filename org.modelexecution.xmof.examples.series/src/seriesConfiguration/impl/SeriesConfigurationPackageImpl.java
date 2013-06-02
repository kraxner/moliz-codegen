/**
 */
package seriesConfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import series.SeriesPackage;

import series.impl.SeriesPackageImpl;

import seriesConfiguration.CounterConfiguration;
import seriesConfiguration.Initialization;
import seriesConfiguration.SeriesConfigurationFactory;
import seriesConfiguration.SeriesConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeriesConfigurationPackageImpl extends EPackageImpl implements SeriesConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see seriesConfiguration.SeriesConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SeriesConfigurationPackageImpl() {
		super(eNS_URI, SeriesConfigurationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SeriesConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SeriesConfigurationPackage init() {
		if (isInited) return (SeriesConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(SeriesConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		SeriesConfigurationPackageImpl theSeriesConfigurationPackage = (SeriesConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeriesConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeriesConfigurationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SeriesPackageImpl theSeriesPackage = (SeriesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeriesPackage.eNS_URI) instanceof SeriesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeriesPackage.eNS_URI) : SeriesPackage.eINSTANCE);

		// Create package meta-data objects
		theSeriesConfigurationPackage.createPackageContents();
		theSeriesPackage.createPackageContents();

		// Initialize created meta-data
		theSeriesConfigurationPackage.initializePackageContents();
		theSeriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeriesConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeriesConfigurationPackage.eNS_URI, theSeriesConfigurationPackage);
		return theSeriesConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounterConfiguration() {
		return counterConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCounterConfiguration_Init() {
		return (EReference)counterConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounterConfiguration_Value() {
		return (EAttribute)counterConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialization() {
		return initializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesConfigurationFactory getSeriesConfigurationFactory() {
		return (SeriesConfigurationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		counterConfigurationEClass = createEClass(COUNTER_CONFIGURATION);
		createEReference(counterConfigurationEClass, COUNTER_CONFIGURATION__INIT);
		createEAttribute(counterConfigurationEClass, COUNTER_CONFIGURATION__VALUE);

		initializationEClass = createEClass(INITIALIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SeriesPackage theSeriesPackage = (SeriesPackage)EPackage.Registry.INSTANCE.getEPackage(SeriesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		counterConfigurationEClass.getESuperTypes().add(theSeriesPackage.getCounter());

		// Initialize classes and features; add operations and parameters
		initEClass(counterConfigurationEClass, CounterConfiguration.class, "CounterConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCounterConfiguration_Init(), this.getInitialization(), null, "init", null, 0, 1, CounterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounterConfiguration_Value(), ecorePackage.getEInt(), "value", null, 0, 1, CounterConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializationEClass, Initialization.class, "Initialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SeriesConfigurationPackageImpl

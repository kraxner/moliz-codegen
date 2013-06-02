/**
 */
package series.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import series.Counter;
import series.SeriesFactory;
import series.SeriesPackage;

import seriesConfiguration.SeriesConfigurationPackage;

import seriesConfiguration.impl.SeriesConfigurationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeriesPackageImpl extends EPackageImpl implements SeriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

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
	 * @see series.SeriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SeriesPackageImpl() {
		super(eNS_URI, SeriesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SeriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SeriesPackage init() {
		if (isInited) return (SeriesPackage)EPackage.Registry.INSTANCE.getEPackage(SeriesPackage.eNS_URI);

		// Obtain or create and register package
		SeriesPackageImpl theSeriesPackage = (SeriesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SeriesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SeriesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SeriesConfigurationPackageImpl theSeriesConfigurationPackage = (SeriesConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SeriesConfigurationPackage.eNS_URI) instanceof SeriesConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SeriesConfigurationPackage.eNS_URI) : SeriesConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theSeriesPackage.createPackageContents();
		theSeriesConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theSeriesPackage.initializePackageContents();
		theSeriesConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeriesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeriesPackage.eNS_URI, theSeriesPackage);
		return theSeriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_Limit() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCounter_StartValue() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeriesFactory getSeriesFactory() {
		return (SeriesFactory)getEFactoryInstance();
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
		counterEClass = createEClass(COUNTER);
		createEAttribute(counterEClass, COUNTER__LIMIT);
		createEAttribute(counterEClass, COUNTER__START_VALUE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCounter_Limit(), ecorePackage.getEInt(), "limit", "42", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_StartValue(), ecorePackage.getEInt(), "startValue", "7", 0, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SeriesPackageImpl

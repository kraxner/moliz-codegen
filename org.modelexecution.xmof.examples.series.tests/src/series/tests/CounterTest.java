/**
 */
package series.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import series.Counter;
import series.SeriesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CounterTest extends TestCase {

	/**
	 * The fixture for this Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Counter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CounterTest.class);
	}

	/**
	 * Constructs a new Counter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Counter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Counter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Counter getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SeriesFactory.eINSTANCE.createCounter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CounterTest

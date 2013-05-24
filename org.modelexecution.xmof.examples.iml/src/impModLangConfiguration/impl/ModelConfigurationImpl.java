/**
 */
package impModLangConfiguration.impl;

import impModLang.impl.ModelImpl;

import impModLangConfiguration.ModelConfiguration;
import impModLangConfiguration.impModLangConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link impModLangConfiguration.impl.ModelConfigurationImpl#getStatementPointer <em>Statement Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelConfigurationImpl extends ModelImpl implements ModelConfiguration {
	/**
	 * The default value of the '{@link #getStatementPointer() <em>Statement Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementPointer()
	 * @generated
	 * @ordered
	 */
	protected static final int STATEMENT_POINTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatementPointer() <em>Statement Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementPointer()
	 * @generated
	 * @ordered
	 */
	protected int statementPointer = STATEMENT_POINTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impModLangConfigurationPackage.Literals.MODEL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatementPointer() {
		return statementPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementPointer(int newStatementPointer) {
		int oldStatementPointer = statementPointer;
		statementPointer = newStatementPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impModLangConfigurationPackage.MODEL_CONFIGURATION__STATEMENT_POINTER, oldStatementPointer, statementPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impModLangConfigurationPackage.MODEL_CONFIGURATION__STATEMENT_POINTER:
				return getStatementPointer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case impModLangConfigurationPackage.MODEL_CONFIGURATION__STATEMENT_POINTER:
				setStatementPointer((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case impModLangConfigurationPackage.MODEL_CONFIGURATION__STATEMENT_POINTER:
				setStatementPointer(STATEMENT_POINTER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case impModLangConfigurationPackage.MODEL_CONFIGURATION__STATEMENT_POINTER:
				return statementPointer != STATEMENT_POINTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (statementPointer: ");
		result.append(statementPointer);
		result.append(')');
		return result.toString();
	}

} //ModelConfigurationImpl

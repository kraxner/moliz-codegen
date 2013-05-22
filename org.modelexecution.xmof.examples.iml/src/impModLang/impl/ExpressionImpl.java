/**
 */
package impModLang.impl;

import impModLang.Expression;
import impModLang.ImpModLangPackage;
import impModLang.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link impModLang.impl.ExpressionImpl#getX <em>X</em>}</li>
 *   <li>{@link impModLang.impl.ExpressionImpl#getCalc <em>Calc</em>}</li>
 *   <li>{@link impModLang.impl.ExpressionImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends EObjectImpl implements Expression {
	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Variable x;

	/**
	 * The default value of the '{@link #getCalc() <em>Calc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalc()
	 * @generated
	 * @ordered
	 */
	protected static final String CALC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalc() <em>Calc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalc()
	 * @generated
	 * @ordered
	 */
	protected String calc = CALC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Variable y;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpModLangPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getX() {
		if (x != null && x.eIsProxy()) {
			InternalEObject oldX = (InternalEObject)x;
			x = (Variable)eResolveProxy(oldX);
			if (x != oldX) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.EXPRESSION__X, oldX, x));
			}
		}
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Variable newX) {
		Variable oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.EXPRESSION__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalc() {
		return calc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalc(String newCalc) {
		String oldCalc = calc;
		calc = newCalc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.EXPRESSION__CALC, oldCalc, calc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getY() {
		if (y != null && y.eIsProxy()) {
			InternalEObject oldY = (InternalEObject)y;
			y = (Variable)eResolveProxy(oldY);
			if (y != oldY) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.EXPRESSION__Y, oldY, y));
			}
		}
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Variable newY) {
		Variable oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.EXPRESSION__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpModLangPackage.EXPRESSION__X:
				if (resolve) return getX();
				return basicGetX();
			case ImpModLangPackage.EXPRESSION__CALC:
				return getCalc();
			case ImpModLangPackage.EXPRESSION__Y:
				if (resolve) return getY();
				return basicGetY();
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
			case ImpModLangPackage.EXPRESSION__X:
				setX((Variable)newValue);
				return;
			case ImpModLangPackage.EXPRESSION__CALC:
				setCalc((String)newValue);
				return;
			case ImpModLangPackage.EXPRESSION__Y:
				setY((Variable)newValue);
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
			case ImpModLangPackage.EXPRESSION__X:
				setX((Variable)null);
				return;
			case ImpModLangPackage.EXPRESSION__CALC:
				setCalc(CALC_EDEFAULT);
				return;
			case ImpModLangPackage.EXPRESSION__Y:
				setY((Variable)null);
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
			case ImpModLangPackage.EXPRESSION__X:
				return x != null;
			case ImpModLangPackage.EXPRESSION__CALC:
				return CALC_EDEFAULT == null ? calc != null : !CALC_EDEFAULT.equals(calc);
			case ImpModLangPackage.EXPRESSION__Y:
				return y != null;
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
		result.append(" (calc: ");
		result.append(calc);
		result.append(')');
		return result.toString();
	}

} //ExpressionImpl

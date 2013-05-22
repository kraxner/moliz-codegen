/**
 */
package impModLang.impl;

import impModLang.Condition;
import impModLang.Goto;
import impModLang.ImpModLangPackage;
import impModLang.Mark;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link impModLang.impl.GotoImpl#getGotoMark <em>Goto Mark</em>}</li>
 *   <li>{@link impModLang.impl.GotoImpl#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GotoImpl extends StatementImpl implements Goto {
	/**
	 * The cached value of the '{@link #getGotoMark() <em>Goto Mark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGotoMark()
	 * @generated
	 * @ordered
	 */
	protected Mark gotoMark;

	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Condition cond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpModLangPackage.Literals.GOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark getGotoMark() {
		if (gotoMark != null && gotoMark.eIsProxy()) {
			InternalEObject oldGotoMark = (InternalEObject)gotoMark;
			gotoMark = (Mark)eResolveProxy(oldGotoMark);
			if (gotoMark != oldGotoMark) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.GOTO__GOTO_MARK, oldGotoMark, gotoMark));
			}
		}
		return gotoMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark basicGetGotoMark() {
		return gotoMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGotoMark(Mark newGotoMark) {
		Mark oldGotoMark = gotoMark;
		gotoMark = newGotoMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.GOTO__GOTO_MARK, oldGotoMark, gotoMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Condition newCond, NotificationChain msgs) {
		Condition oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpModLangPackage.GOTO__COND, oldCond, newCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Condition newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpModLangPackage.GOTO__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpModLangPackage.GOTO__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.GOTO__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpModLangPackage.GOTO__COND:
				return basicSetCond(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpModLangPackage.GOTO__GOTO_MARK:
				if (resolve) return getGotoMark();
				return basicGetGotoMark();
			case ImpModLangPackage.GOTO__COND:
				return getCond();
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
			case ImpModLangPackage.GOTO__GOTO_MARK:
				setGotoMark((Mark)newValue);
				return;
			case ImpModLangPackage.GOTO__COND:
				setCond((Condition)newValue);
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
			case ImpModLangPackage.GOTO__GOTO_MARK:
				setGotoMark((Mark)null);
				return;
			case ImpModLangPackage.GOTO__COND:
				setCond((Condition)null);
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
			case ImpModLangPackage.GOTO__GOTO_MARK:
				return gotoMark != null;
			case ImpModLangPackage.GOTO__COND:
				return cond != null;
		}
		return super.eIsSet(featureID);
	}

} //GotoImpl

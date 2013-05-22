/**
 */
package impModLang.impl;

import impModLang.Condition;
import impModLang.ImpModLangPackage;
import impModLang.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link impModLang.impl.ConditionImpl#getPar1 <em>Par1</em>}</li>
 *   <li>{@link impModLang.impl.ConditionImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link impModLang.impl.ConditionImpl#getPar2 <em>Par2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
	/**
	 * The cached value of the '{@link #getPar1() <em>Par1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar1()
	 * @generated
	 * @ordered
	 */
	protected Variable par1;

	/**
	 * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComp()
	 * @generated
	 * @ordered
	 */
	protected String comp = COMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPar2() <em>Par2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar2()
	 * @generated
	 * @ordered
	 */
	protected Variable par2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpModLangPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getPar1() {
		if (par1 != null && par1.eIsProxy()) {
			InternalEObject oldPar1 = (InternalEObject)par1;
			par1 = (Variable)eResolveProxy(oldPar1);
			if (par1 != oldPar1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.CONDITION__PAR1, oldPar1, par1));
			}
		}
		return par1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetPar1() {
		return par1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar1(Variable newPar1) {
		Variable oldPar1 = par1;
		par1 = newPar1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.CONDITION__PAR1, oldPar1, par1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComp() {
		return comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComp(String newComp) {
		String oldComp = comp;
		comp = newComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.CONDITION__COMP, oldComp, comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getPar2() {
		if (par2 != null && par2.eIsProxy()) {
			InternalEObject oldPar2 = (InternalEObject)par2;
			par2 = (Variable)eResolveProxy(oldPar2);
			if (par2 != oldPar2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.CONDITION__PAR2, oldPar2, par2));
			}
		}
		return par2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetPar2() {
		return par2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPar2(Variable newPar2) {
		Variable oldPar2 = par2;
		par2 = newPar2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.CONDITION__PAR2, oldPar2, par2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImpModLangPackage.CONDITION__PAR1:
				if (resolve) return getPar1();
				return basicGetPar1();
			case ImpModLangPackage.CONDITION__COMP:
				return getComp();
			case ImpModLangPackage.CONDITION__PAR2:
				if (resolve) return getPar2();
				return basicGetPar2();
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
			case ImpModLangPackage.CONDITION__PAR1:
				setPar1((Variable)newValue);
				return;
			case ImpModLangPackage.CONDITION__COMP:
				setComp((String)newValue);
				return;
			case ImpModLangPackage.CONDITION__PAR2:
				setPar2((Variable)newValue);
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
			case ImpModLangPackage.CONDITION__PAR1:
				setPar1((Variable)null);
				return;
			case ImpModLangPackage.CONDITION__COMP:
				setComp(COMP_EDEFAULT);
				return;
			case ImpModLangPackage.CONDITION__PAR2:
				setPar2((Variable)null);
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
			case ImpModLangPackage.CONDITION__PAR1:
				return par1 != null;
			case ImpModLangPackage.CONDITION__COMP:
				return COMP_EDEFAULT == null ? comp != null : !COMP_EDEFAULT.equals(comp);
			case ImpModLangPackage.CONDITION__PAR2:
				return par2 != null;
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
		result.append(" (comp: ");
		result.append(comp);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl

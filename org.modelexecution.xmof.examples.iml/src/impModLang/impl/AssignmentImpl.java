/**
 */
package impModLang.impl;

import impModLang.Assignment;
import impModLang.Expression;
import impModLang.ImpModLangPackage;
import impModLang.Mark;
import impModLang.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link impModLang.impl.AssignmentImpl#getMark <em>Mark</em>}</li>
 *   <li>{@link impModLang.impl.AssignmentImpl#getWriteTo <em>Write To</em>}</li>
 *   <li>{@link impModLang.impl.AssignmentImpl#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends StatementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getMark() <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMark()
	 * @generated
	 * @ordered
	 */
	protected Mark mark;

	/**
	 * The cached value of the '{@link #getWriteTo() <em>Write To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteTo()
	 * @generated
	 * @ordered
	 */
	protected Variable writeTo;

	/**
	 * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExp()
	 * @generated
	 * @ordered
	 */
	protected Expression exp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpModLangPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mark getMark() {
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMark(Mark newMark, NotificationChain msgs) {
		Mark oldMark = mark;
		mark = newMark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpModLangPackage.ASSIGNMENT__MARK, oldMark, newMark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMark(Mark newMark) {
		if (newMark != mark) {
			NotificationChain msgs = null;
			if (mark != null)
				msgs = ((InternalEObject)mark).eInverseRemove(this, ImpModLangPackage.MARK__ASSIGNMENT, Mark.class, msgs);
			if (newMark != null)
				msgs = ((InternalEObject)newMark).eInverseAdd(this, ImpModLangPackage.MARK__ASSIGNMENT, Mark.class, msgs);
			msgs = basicSetMark(newMark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.ASSIGNMENT__MARK, newMark, newMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getWriteTo() {
		if (writeTo != null && writeTo.eIsProxy()) {
			InternalEObject oldWriteTo = (InternalEObject)writeTo;
			writeTo = (Variable)eResolveProxy(oldWriteTo);
			if (writeTo != oldWriteTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImpModLangPackage.ASSIGNMENT__WRITE_TO, oldWriteTo, writeTo));
			}
		}
		return writeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetWriteTo() {
		return writeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteTo(Variable newWriteTo) {
		Variable oldWriteTo = writeTo;
		writeTo = newWriteTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.ASSIGNMENT__WRITE_TO, oldWriteTo, writeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExp() {
		return exp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs) {
		Expression oldExp = exp;
		exp = newExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImpModLangPackage.ASSIGNMENT__EXP, oldExp, newExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExp(Expression newExp) {
		if (newExp != exp) {
			NotificationChain msgs = null;
			if (exp != null)
				msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpModLangPackage.ASSIGNMENT__EXP, null, msgs);
			if (newExp != null)
				msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImpModLangPackage.ASSIGNMENT__EXP, null, msgs);
			msgs = basicSetExp(newExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImpModLangPackage.ASSIGNMENT__EXP, newExp, newExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpModLangPackage.ASSIGNMENT__MARK:
				if (mark != null)
					msgs = ((InternalEObject)mark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImpModLangPackage.ASSIGNMENT__MARK, null, msgs);
				return basicSetMark((Mark)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpModLangPackage.ASSIGNMENT__MARK:
				return basicSetMark(null, msgs);
			case ImpModLangPackage.ASSIGNMENT__EXP:
				return basicSetExp(null, msgs);
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
			case ImpModLangPackage.ASSIGNMENT__MARK:
				return getMark();
			case ImpModLangPackage.ASSIGNMENT__WRITE_TO:
				if (resolve) return getWriteTo();
				return basicGetWriteTo();
			case ImpModLangPackage.ASSIGNMENT__EXP:
				return getExp();
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
			case ImpModLangPackage.ASSIGNMENT__MARK:
				setMark((Mark)newValue);
				return;
			case ImpModLangPackage.ASSIGNMENT__WRITE_TO:
				setWriteTo((Variable)newValue);
				return;
			case ImpModLangPackage.ASSIGNMENT__EXP:
				setExp((Expression)newValue);
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
			case ImpModLangPackage.ASSIGNMENT__MARK:
				setMark((Mark)null);
				return;
			case ImpModLangPackage.ASSIGNMENT__WRITE_TO:
				setWriteTo((Variable)null);
				return;
			case ImpModLangPackage.ASSIGNMENT__EXP:
				setExp((Expression)null);
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
			case ImpModLangPackage.ASSIGNMENT__MARK:
				return mark != null;
			case ImpModLangPackage.ASSIGNMENT__WRITE_TO:
				return writeTo != null;
			case ImpModLangPackage.ASSIGNMENT__EXP:
				return exp != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl

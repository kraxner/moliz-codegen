/**
 */
package impModLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Condition#getPar1 <em>Par1</em>}</li>
 *   <li>{@link impModLang.Condition#getComp <em>Comp</em>}</li>
 *   <li>{@link impModLang.Condition#getPar2 <em>Par2</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Par1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par1</em>' reference.
	 * @see #setPar1(Variable)
	 * @see impModLang.ImpModLangPackage#getCondition_Par1()
	 * @model required="true"
	 * @generated
	 */
	Variable getPar1();

	/**
	 * Sets the value of the '{@link impModLang.Condition#getPar1 <em>Par1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par1</em>' reference.
	 * @see #getPar1()
	 * @generated
	 */
	void setPar1(Variable value);

	/**
	 * Returns the value of the '<em><b>Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp</em>' attribute.
	 * @see #setComp(String)
	 * @see impModLang.ImpModLangPackage#getCondition_Comp()
	 * @model required="true"
	 * @generated
	 */
	String getComp();

	/**
	 * Sets the value of the '{@link impModLang.Condition#getComp <em>Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp</em>' attribute.
	 * @see #getComp()
	 * @generated
	 */
	void setComp(String value);

	/**
	 * Returns the value of the '<em><b>Par2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par2</em>' reference.
	 * @see #setPar2(Variable)
	 * @see impModLang.ImpModLangPackage#getCondition_Par2()
	 * @model required="true"
	 * @generated
	 */
	Variable getPar2();

	/**
	 * Sets the value of the '{@link impModLang.Condition#getPar2 <em>Par2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par2</em>' reference.
	 * @see #getPar2()
	 * @generated
	 */
	void setPar2(Variable value);

} // Condition

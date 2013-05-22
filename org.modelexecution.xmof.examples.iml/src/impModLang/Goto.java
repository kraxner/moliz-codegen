/**
 */
package impModLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Goto#getGotoMark <em>Goto Mark</em>}</li>
 *   <li>{@link impModLang.Goto#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getGoto()
 * @model
 * @generated
 */
public interface Goto extends Statement {
	/**
	 * Returns the value of the '<em><b>Goto Mark</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goto Mark</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goto Mark</em>' reference.
	 * @see #setGotoMark(Mark)
	 * @see impModLang.ImpModLangPackage#getGoto_GotoMark()
	 * @model required="true"
	 * @generated
	 */
	Mark getGotoMark();

	/**
	 * Sets the value of the '{@link impModLang.Goto#getGotoMark <em>Goto Mark</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goto Mark</em>' reference.
	 * @see #getGotoMark()
	 * @generated
	 */
	void setGotoMark(Mark value);

	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Condition)
	 * @see impModLang.ImpModLangPackage#getGoto_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCond();

	/**
	 * Sets the value of the '{@link impModLang.Goto#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Condition value);

} // Goto

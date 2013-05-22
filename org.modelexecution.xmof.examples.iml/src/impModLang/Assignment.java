/**
 */
package impModLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Assignment#getMark <em>Mark</em>}</li>
 *   <li>{@link impModLang.Assignment#getWriteTo <em>Write To</em>}</li>
 *   <li>{@link impModLang.Assignment#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link impModLang.Mark#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference.
	 * @see #setMark(Mark)
	 * @see impModLang.ImpModLangPackage#getAssignment_Mark()
	 * @see impModLang.Mark#getAssignment
	 * @model opposite="assignment" containment="true"
	 * @generated
	 */
	Mark getMark();

	/**
	 * Sets the value of the '{@link impModLang.Assignment#getMark <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' containment reference.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(Mark value);

	/**
	 * Returns the value of the '<em><b>Write To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write To</em>' reference.
	 * @see #setWriteTo(Variable)
	 * @see impModLang.ImpModLangPackage#getAssignment_WriteTo()
	 * @model required="true"
	 * @generated
	 */
	Variable getWriteTo();

	/**
	 * Sets the value of the '{@link impModLang.Assignment#getWriteTo <em>Write To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write To</em>' reference.
	 * @see #getWriteTo()
	 * @generated
	 */
	void setWriteTo(Variable value);

	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference.
	 * @see #setExp(Expression)
	 * @see impModLang.ImpModLangPackage#getAssignment_Exp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExp();

	/**
	 * Sets the value of the '{@link impModLang.Assignment#getExp <em>Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp</em>' containment reference.
	 * @see #getExp()
	 * @generated
	 */
	void setExp(Expression value);

} // Assignment

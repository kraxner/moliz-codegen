/**
 */
package impModLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Expression#getX <em>X</em>}</li>
 *   <li>{@link impModLang.Expression#getCalc <em>Calc</em>}</li>
 *   <li>{@link impModLang.Expression#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(Variable)
	 * @see impModLang.ImpModLangPackage#getExpression_X()
	 * @model required="true"
	 * @generated
	 */
	Variable getX();

	/**
	 * Sets the value of the '{@link impModLang.Expression#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(Variable value);

	/**
	 * Returns the value of the '<em><b>Calc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calc</em>' attribute.
	 * @see #setCalc(String)
	 * @see impModLang.ImpModLangPackage#getExpression_Calc()
	 * @model required="true"
	 * @generated
	 */
	String getCalc();

	/**
	 * Sets the value of the '{@link impModLang.Expression#getCalc <em>Calc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calc</em>' attribute.
	 * @see #getCalc()
	 * @generated
	 */
	void setCalc(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' reference.
	 * @see #setY(Variable)
	 * @see impModLang.ImpModLangPackage#getExpression_Y()
	 * @model required="true"
	 * @generated
	 */
	Variable getY();

	/**
	 * Sets the value of the '{@link impModLang.Expression#getY <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(Variable value);

} // Expression

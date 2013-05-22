/**
 */
package impModLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Mark#getName <em>Name</em>}</li>
 *   <li>{@link impModLang.Mark#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see impModLang.ImpModLangPackage#getMark_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link impModLang.Mark#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link impModLang.Assignment#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' container reference.
	 * @see #setAssignment(Assignment)
	 * @see impModLang.ImpModLangPackage#getMark_Assignment()
	 * @see impModLang.Assignment#getMark
	 * @model opposite="mark" required="true" transient="false"
	 * @generated
	 */
	Assignment getAssignment();

	/**
	 * Sets the value of the '{@link impModLang.Mark#getAssignment <em>Assignment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' container reference.
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(Assignment value);

} // Mark

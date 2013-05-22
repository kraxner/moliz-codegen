/**
 */
package impModLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Statement#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link impModLang.Model#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see impModLang.ImpModLangPackage#getStatement_Model()
	 * @see impModLang.Model#getStatements
	 * @model opposite="statements" required="true" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link impModLang.Statement#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // Statement

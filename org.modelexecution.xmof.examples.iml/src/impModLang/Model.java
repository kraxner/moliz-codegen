/**
 */
package impModLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link impModLang.Model#getVariables <em>Variables</em>}</li>
 *   <li>{@link impModLang.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see impModLang.ImpModLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link impModLang.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see impModLang.ImpModLangPackage#getModel_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link impModLang.Statement}.
	 * It is bidirectional and its opposite is '{@link impModLang.Statement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see impModLang.ImpModLangPackage#getModel_Statements()
	 * @see impModLang.Statement#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Model

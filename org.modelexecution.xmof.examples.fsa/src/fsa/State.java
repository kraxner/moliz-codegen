/**
 */
package fsa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fsa.State#getName <em>Name</em>}</li>
 *   <li>{@link fsa.State#isAccepting <em>Accepting</em>}</li>
 *   <li>{@link fsa.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link fsa.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fsa.FsaPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see fsa.FsaPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fsa.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Accepting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepting</em>' attribute.
	 * @see #setAccepting(boolean)
	 * @see fsa.FsaPackage#getState_Accepting()
	 * @model
	 * @generated
	 */
	boolean isAccepting();

	/**
	 * Sets the value of the '{@link fsa.State#isAccepting <em>Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepting</em>' attribute.
	 * @see #isAccepting()
	 * @generated
	 */
	void setAccepting(boolean value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link fsa.Transition}.
	 * It is bidirectional and its opposite is '{@link fsa.Transition#getFromState <em>From State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see fsa.FsaPackage#getState_OutgoingTransitions()
	 * @see fsa.Transition#getFromState
	 * @model opposite="fromState"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link fsa.Transition}.
	 * It is bidirectional and its opposite is '{@link fsa.Transition#getToState <em>To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see fsa.FsaPackage#getState_IncomingTransitions()
	 * @see fsa.Transition#getToState
	 * @model opposite="toState"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // State

/**
 */
package ice.master.fsm.model.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.model.fsm.State#getName <em>Name</em>}</li>
 *   <li>{@link ice.master.fsm.model.fsm.State#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link ice.master.fsm.model.fsm.State#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.model.fsm.FsmPackage#getState()
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
	 * @see ice.master.fsm.model.fsm.FsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ice.master.fsm.model.fsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.model.fsm.Transition}.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.model.fsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' containment reference list.
	 * @see ice.master.fsm.model.fsm.FsmPackage#getState_Outgoings()
	 * @see ice.master.fsm.model.fsm.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoings();

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.model.fsm.FiniteStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(FiniteStateMachine)
	 * @see ice.master.fsm.model.fsm.FsmPackage#getState_Machine()
	 * @see ice.master.fsm.model.fsm.FiniteStateMachine#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	FiniteStateMachine getMachine();

	/**
	 * Sets the value of the '{@link ice.master.fsm.model.fsm.State#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(FiniteStateMachine value);

} // State

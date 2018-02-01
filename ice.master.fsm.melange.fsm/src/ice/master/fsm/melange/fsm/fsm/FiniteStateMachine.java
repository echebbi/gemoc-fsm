/**
 */
package ice.master.fsm.melange.fsm.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getInitial <em>Initial</em>}</li>
 *   <li>{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.melange.fsm.fsm.FsmPackage#getFiniteStateMachine()
 * @model
 * @generated
 */
public interface FiniteStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see ice.master.fsm.melange.fsm.fsm.FsmPackage#getFiniteStateMachine_Initial()
	 * @model
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

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
	 * @see ice.master.fsm.melange.fsm.fsm.FsmPackage#getFiniteStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.melange.fsm.fsm.State}.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.melange.fsm.fsm.State#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ice.master.fsm.melange.fsm.fsm.FsmPackage#getFiniteStateMachine_States()
	 * @see ice.master.fsm.melange.fsm.fsm.State#getMachine
	 * @model opposite="machine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(State)
	 * @see ice.master.fsm.melange.fsm.fsm.FsmPackage#getFiniteStateMachine_Current()
	 * @model
	 * @generated
	 */
	State getCurrent();

	/**
	 * Sets the value of the '{@link ice.master.fsm.melange.fsm.fsm.FiniteStateMachine#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void on(String event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // FiniteStateMachine

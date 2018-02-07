/**
 */
package ice.master.fsm.xdsml.fsmmt.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getInitial <em>Initial</em>}</li>
 *   <li>{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.xdsml.fsmmt.model.ModelPackage#getFiniteStateMachine()
 * @model
 * @generated
 */
public interface FiniteStateMachine extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(AbstractState)
	 * @see ice.master.fsm.xdsml.fsmmt.model.ModelPackage#getFiniteStateMachine_Initial()
	 * @model
	 * @generated
	 */
	AbstractState getInitial();

	/**
	 * Sets the value of the '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(AbstractState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.xdsml.fsmmt.model.AbstractState}.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.xdsml.fsmmt.model.AbstractState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ice.master.fsm.xdsml.fsmmt.model.ModelPackage#getFiniteStateMachine_States()
	 * @see ice.master.fsm.xdsml.fsmmt.model.AbstractState#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AbstractState> getStates();

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
	 * @see ice.master.fsm.xdsml.fsmmt.model.ModelPackage#getFiniteStateMachine_Current()
	 * @model
	 * @generated
	 */
	State getCurrent();

	/**
	 * Sets the value of the '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getCurrent <em>Current</em>}' reference.
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
	AbstractState on(String event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // FiniteStateMachine

/**
 */
package ice.master.fsm.model;

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
 *   <li>{@link ice.master.fsm.model.FiniteStateMachine#getInitial <em>Initial</em>}</li>
 *   <li>{@link ice.master.fsm.model.FiniteStateMachine#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.model.ModelPackage#getFiniteStateMachine()
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
	 * @see ice.master.fsm.model.ModelPackage#getFiniteStateMachine_Initial()
	 * @model
	 * @generated
	 */
	AbstractState getInitial();

	/**
	 * Sets the value of the '{@link ice.master.fsm.model.FiniteStateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(AbstractState value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.model.AbstractState}.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.model.AbstractState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ice.master.fsm.model.ModelPackage#getFiniteStateMachine_States()
	 * @see ice.master.fsm.model.AbstractState#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<AbstractState> getStates();

} // FiniteStateMachine

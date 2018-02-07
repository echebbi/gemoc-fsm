/**
 */
package ice.master.fsm.xdsml.fsm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.xdsml.fsm.model.AbstractState#getName <em>Name</em>}</li>
 *   <li>{@link ice.master.fsm.xdsml.fsm.model.AbstractState#getParent <em>Parent</em>}</li>
 *   <li>{@link ice.master.fsm.xdsml.fsm.model.AbstractState#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.xdsml.fsm.model.ModelPackage#getAbstractState()
 * @model
 * @generated
 */
public interface AbstractState extends EObject {
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
	 * @see ice.master.fsm.xdsml.fsm.model.ModelPackage#getAbstractState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ice.master.fsm.xdsml.fsm.model.AbstractState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.xdsml.fsm.model.FiniteStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(FiniteStateMachine)
	 * @see ice.master.fsm.xdsml.fsm.model.ModelPackage#getAbstractState_Parent()
	 * @see ice.master.fsm.xdsml.fsm.model.FiniteStateMachine#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	FiniteStateMachine getParent();

	/**
	 * Sets the value of the '{@link ice.master.fsm.xdsml.fsm.model.AbstractState#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FiniteStateMachine value);

	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.xdsml.fsm.model.Transition}.
	 * It is bidirectional and its opposite is '{@link ice.master.fsm.xdsml.fsm.model.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' containment reference list.
	 * @see ice.master.fsm.xdsml.fsm.model.ModelPackage#getAbstractState_Outgoings()
	 * @see ice.master.fsm.xdsml.fsm.model.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoings();

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
	void onEnter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void onExit();

} // AbstractState

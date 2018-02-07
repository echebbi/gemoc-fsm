/**
 */
package ice.master.fsm.xdsml.fsmmt.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ice.master.fsm.xdsml.fsmmt.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ice.master.fsm.xdsml.fsmmt/model/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.AbstractStateImpl <em>Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.AbstractStateImpl
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getAbstractState()
	 * @generated
	 */
	int ABSTRACT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE__OUTGOINGS = 2;

	/**
	 * The number of structural features of the '<em>Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.StateImpl
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = ABSTRACT_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGS = ABSTRACT_STATE__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.FiniteStateMachineImpl <em>Finite State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.FiniteStateMachineImpl
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getFiniteStateMachine()
	 * @generated
	 */
	int FINITE_STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__NAME = ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__PARENT = ABSTRACT_STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__OUTGOINGS = ABSTRACT_STATE__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__INITIAL = ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__STATES = ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE__CURRENT = ABSTRACT_STATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_STATE_MACHINE_FEATURE_COUNT = ABSTRACT_STATE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.TransitionImpl
	 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ice.master.fsm.xdsml.fsmmt.model.AbstractState <em>Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract State</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.AbstractState
	 * @generated
	 */
	EClass getAbstractState();

	/**
	 * Returns the meta object for the attribute '{@link ice.master.fsm.xdsml.fsmmt.model.AbstractState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.AbstractState#getName()
	 * @see #getAbstractState()
	 * @generated
	 */
	EAttribute getAbstractState_Name();

	/**
	 * Returns the meta object for the container reference '{@link ice.master.fsm.xdsml.fsmmt.model.AbstractState#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.AbstractState#getParent()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link ice.master.fsm.xdsml.fsmmt.model.AbstractState#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoings</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.AbstractState#getOutgoings()
	 * @see #getAbstractState()
	 * @generated
	 */
	EReference getAbstractState_Outgoings();

	/**
	 * Returns the meta object for class '{@link ice.master.fsm.xdsml.fsmmt.model.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine <em>Finite State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite State Machine</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine
	 * @generated
	 */
	EClass getFiniteStateMachine();

	/**
	 * Returns the meta object for the reference '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getInitial()
	 * @see #getFiniteStateMachine()
	 * @generated
	 */
	EReference getFiniteStateMachine_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getStates()
	 * @see #getFiniteStateMachine()
	 * @generated
	 */
	EReference getFiniteStateMachine_States();

	/**
	 * Returns the meta object for the reference '{@link ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine#getCurrent()
	 * @see #getFiniteStateMachine()
	 * @generated
	 */
	EReference getFiniteStateMachine_Current();

	/**
	 * Returns the meta object for class '{@link ice.master.fsm.xdsml.fsmmt.model.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the container reference '{@link ice.master.fsm.xdsml.fsmmt.model.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link ice.master.fsm.xdsml.fsmmt.model.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link ice.master.fsm.xdsml.fsmmt.model.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link ice.master.fsm.xdsml.fsmmt.model.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see ice.master.fsm.xdsml.fsmmt.model.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Trigger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.AbstractStateImpl <em>Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.AbstractStateImpl
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getAbstractState()
		 * @generated
		 */
		EClass ABSTRACT_STATE = eINSTANCE.getAbstractState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATE__NAME = eINSTANCE.getAbstractState_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__PARENT = eINSTANCE.getAbstractState_Parent();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STATE__OUTGOINGS = eINSTANCE.getAbstractState_Outgoings();

		/**
		 * The meta object literal for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.StateImpl
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.FiniteStateMachineImpl <em>Finite State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.FiniteStateMachineImpl
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getFiniteStateMachine()
		 * @generated
		 */
		EClass FINITE_STATE_MACHINE = eINSTANCE.getFiniteStateMachine();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE__INITIAL = eINSTANCE.getFiniteStateMachine_Initial();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE__STATES = eINSTANCE.getFiniteStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_STATE_MACHINE__CURRENT = eINSTANCE.getFiniteStateMachine_Current();

		/**
		 * The meta object literal for the '{@link ice.master.fsm.xdsml.fsmmt.model.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.TransitionImpl
		 * @see ice.master.fsm.xdsml.fsmmt.model.impl.ModelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

	}

} //ModelPackage

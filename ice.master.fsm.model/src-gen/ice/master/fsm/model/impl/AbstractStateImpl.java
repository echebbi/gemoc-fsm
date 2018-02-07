/**
 */
package ice.master.fsm.model.impl;

import ice.master.fsm.model.AbstractState;
import ice.master.fsm.model.FiniteStateMachine;
import ice.master.fsm.model.ModelPackage;
import ice.master.fsm.model.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.model.impl.AbstractStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link ice.master.fsm.model.impl.AbstractStateImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ice.master.fsm.model.impl.AbstractStateImpl#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends MinimalEObjectImpl.Container implements AbstractState {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiniteStateMachine getParent() {
		if (eContainerFeatureID() != ModelPackage.ABSTRACT_STATE__PARENT)
			return null;
		return (FiniteStateMachine) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(FiniteStateMachine newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParent, ModelPackage.ABSTRACT_STATE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(FiniteStateMachine newParent) {
		if (newParent != eInternalContainer()
				|| (eContainerFeatureID() != ModelPackage.ABSTRACT_STATE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, ModelPackage.FINITE_STATE_MACHINE__STATES,
						FiniteStateMachine.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_STATE__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this,
					ModelPackage.ABSTRACT_STATE__OUTGOINGS, ModelPackage.TRANSITION__SOURCE);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__PARENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParent((FiniteStateMachine) otherEnd, msgs);
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__PARENT:
			return basicSetParent(null, msgs);
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ModelPackage.ABSTRACT_STATE__PARENT:
			return eInternalContainer().eInverseRemove(this, ModelPackage.FINITE_STATE_MACHINE__STATES,
					FiniteStateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__NAME:
			return getName();
		case ModelPackage.ABSTRACT_STATE__PARENT:
			return getParent();
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			return getOutgoings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.ABSTRACT_STATE__PARENT:
			setParent((FiniteStateMachine) newValue);
			return;
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			getOutgoings().clear();
			getOutgoings().addAll((Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.ABSTRACT_STATE__PARENT:
			setParent((FiniteStateMachine) null);
			return;
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			getOutgoings().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.ABSTRACT_STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.ABSTRACT_STATE__PARENT:
			return getParent() != null;
		case ModelPackage.ABSTRACT_STATE__OUTGOINGS:
			return outgoings != null && !outgoings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractStateImpl

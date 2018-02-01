package ice.master.fsm.melange.fsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.melange.fsm.fsm.FiniteStateMachine;
import ice.master.fsm.melange.fsmmt.fsm.State;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FiniteStateMachineAdapter extends EObjectAdapter<FiniteStateMachine> implements ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public FiniteStateMachineAdapter() {
    super(ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  private EList<State> states_;
  
  @Override
  public EList<State> getStates() {
    if (states_ == null)
    	states_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStates(), adaptersFactory, eResource);
    return states_;
  }
  
  @Override
  public State getInitial() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitial(), eResource);
  }
  
  @Override
  public void setInitial(final State o) {
    if (o != null)
    	adaptee.setInitial(((ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  @Override
  public void main() {
    ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspect.main(adaptee);
  }
  
  @Override
  public void on(final String event) {
    ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspect.on(adaptee, event
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ice.master.fsm.melange.fsmmt.fsm.FsmPackage.eINSTANCE.getFiniteStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__STATES:
    		return getStates();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__INITIAL:
    		return getInitial();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__INITIAL:
    		return getInitial() != null;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__INITIAL:
    		setInitial(
    		(ice.master.fsm.melange.fsmmt.fsm.State)
    		 newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.FINITE_STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

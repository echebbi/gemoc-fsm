package ice.master.fsm.melange.fsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.melange.fsm.fsm.State;
import ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine;
import ice.master.fsm.melange.fsmmt.fsm.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements ice.master.fsm.melange.fsmmt.fsm.State {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  
  private EList<Transition> outgoings_;
  
  @Override
  public EList<Transition> getOutgoings() {
    if (outgoings_ == null)
    	outgoings_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoings(), adaptersFactory, eResource);
    return outgoings_;
  }
  
  @Override
  public FiniteStateMachine getMachine() {
    return (FiniteStateMachine) adaptersFactory.createAdapter(adaptee.getMachine(), eResource);
  }
  
  @Override
  public void setMachine(final FiniteStateMachine o) {
    if (o != null)
    	adaptee.setMachine(((ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FiniteStateMachineAdapter) o).getAdaptee());
    else adaptee.setMachine(null);
  }
  
  @Override
  public ice.master.fsm.melange.fsmmt.fsm.State on(final String event) {
    return (ice.master.fsm.melange.fsmmt.fsm.State) adaptersFactory.createAdapter(ice.master.fsm.melange.fsm.aspects.StateAspect.on(adaptee, event
    ), eResource);
  }
  
  @Override
  public void onEnter() {
    ice.master.fsm.melange.fsm.aspects.StateAspect.onEnter(adaptee);
  }
  
  @Override
  public void onExit() {
    ice.master.fsm.melange.fsm.aspects.StateAspect.onExit(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ice.master.fsm.melange.fsmmt.fsm.FsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__OUTGOINGS:
    		return getOutgoings();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__MACHINE:
    		return getMachine();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__OUTGOINGS:
    		return getOutgoings() != null && !getOutgoings().isEmpty();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__MACHINE:
    		return getMachine() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__OUTGOINGS:
    		getOutgoings().clear();
    		getOutgoings().addAll((Collection) newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.STATE__MACHINE:
    		setMachine(
    		(ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package ice.master.fsm.melange.fsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.melange.fsm.fsm.Transition;
import ice.master.fsm.melange.fsmmt.fsm.State;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements ice.master.fsm.melange.fsmmt.fsm.Transition {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
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
  
  @Override
  public String getTrigger() {
    return adaptee.getTrigger();
  }
  
  @Override
  public void setTrigger(final String o) {
    adaptee.setTrigger(o);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  @Override
  public boolean accepts(final String event) {
    return ice.master.fsm.melange.fsm.aspects.TransitionAspect.accepts(adaptee, event
    );
  }
  
  @Override
  public State on(final String event) {
    return (State) adaptersFactory.createAdapter(ice.master.fsm.melange.fsm.aspects.TransitionAspect.on(adaptee, event
    ), eResource);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String TRIGGER_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ice.master.fsm.melange.fsmmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		return getName();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TRIGGER:
    		return getTrigger();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TRIGGER:
    		return getTrigger() != TRIGGER_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(ice.master.fsm.melange.fsmmt.fsm.State)
    		 newValue);
    		return;
    	case ice.master.fsm.melange.fsmmt.fsm.FsmPackage.TRANSITION__TRIGGER:
    		setTrigger(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

package ice.master.fsm.xdsml.fsm.adapters.fsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.xdsml.fsm.model.State;
import ice.master.fsm.xdsml.fsmmt.model.AbstractState;
import ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsmmt.model.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements ice.master.fsm.xdsml.fsmmt.model.State {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
    adaptersFactory = ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
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
  public FiniteStateMachine getParent() {
    return (FiniteStateMachine) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final FiniteStateMachine o) {
    if (o != null)
    	adaptee.setParent(((ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.FiniteStateMachineAdapter) o).getAdaptee());
    else adaptee.setParent(null);
  }
  
  private EList<Transition> outgoings_;
  
  @Override
  public EList<Transition> getOutgoings() {
    if (outgoings_ == null)
    	outgoings_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoings(), adaptersFactory, eResource);
    return outgoings_;
  }
  
  @Override
  public AbstractState on(final String event) {
    return (AbstractState) adaptersFactory.createAdapter(ice.master.fsm.xdsml.fsm.aspects.StateAspect.on(adaptee, event
    ), eResource);
  }
  
  @Override
  public void onEnter() {
    ice.master.fsm.xdsml.fsm.aspects.StateAspect.onEnter(adaptee);
  }
  
  @Override
  public void onExit() {
    ice.master.fsm.xdsml.fsm.aspects.StateAspect.onExit(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ice.master.fsm.xdsml.fsmmt.model.ModelPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__NAME:
    		return getName();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__PARENT:
    		return getParent();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__OUTGOINGS:
    		return getOutgoings();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__PARENT:
    		return getParent() != null;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__OUTGOINGS:
    		return getOutgoings() != null && !getOutgoings().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__PARENT:
    		setParent(
    		(ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine)
    		 newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.STATE__OUTGOINGS:
    		getOutgoings().clear();
    		getOutgoings().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

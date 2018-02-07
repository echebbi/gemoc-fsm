package ice.master.fsm.xdsml.fsm.adapters.fsmmt.model;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.xdsml.fsm.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsmmt.model.AbstractState;
import ice.master.fsm.xdsml.fsmmt.model.State;
import ice.master.fsm.xdsml.fsmmt.model.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FiniteStateMachineAdapter extends EObjectAdapter<FiniteStateMachine> implements ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine {
  private FSMMTAdaptersFactory adaptersFactory;
  
  public FiniteStateMachineAdapter() {
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
  public ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine getParent() {
    return (ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine) adaptersFactory.createAdapter(adaptee.getParent(), eResource);
  }
  
  @Override
  public void setParent(final ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine o) {
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
  public AbstractState getInitial() {
    return (AbstractState) adaptersFactory.createAdapter(adaptee.getInitial(), eResource);
  }
  
  @Override
  public void setInitial(final AbstractState o) {
    if (o != null)
    	adaptee.setInitial(((ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.AbstractStateAdapter) o).getAdaptee());
    else adaptee.setInitial(null);
  }
  
  private EList<AbstractState> states_;
  
  @Override
  public EList<AbstractState> getStates() {
    if (states_ == null)
    	states_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStates(), adaptersFactory, eResource);
    return states_;
  }
  
  @Override
  public State getCurrent() {
    return (State) adaptersFactory.createAdapter(ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect.current(adaptee), eResource);
  }
  
  @Override
  public void setCurrent(final State current) {
    ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect.current(adaptee, (ice.master.fsm.xdsml.fsm.model.State)((EObjectAdapter)current).getAdaptee()
    );
  }
  
  @Override
  public void main() {
    ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect.main(adaptee);
  }
  
  @Override
  public AbstractState on(final String event) {
    return (AbstractState) adaptersFactory.createAdapter(ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect.on(adaptee, event
    ), eResource);
  }
  
  @Override
  public void onEnter() {
    ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect.onEnter(adaptee);
  }
  
  @Override
  public void onExit() {
    ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect.onExit(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ice.master.fsm.xdsml.fsmmt.model.ModelPackage.eINSTANCE.getFiniteStateMachine();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__NAME:
    		return getName();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__PARENT:
    		return getParent();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__OUTGOINGS:
    		return getOutgoings();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__INITIAL:
    		return getInitial();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__STATES:
    		return getStates();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__CURRENT:
    		return getCurrent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__PARENT:
    		return getParent() != null;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__OUTGOINGS:
    		return getOutgoings() != null && !getOutgoings().isEmpty();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__INITIAL:
    		return getInitial() != null;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__CURRENT:
    		return getCurrent() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__PARENT:
    		setParent(
    		(ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine)
    		 newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__OUTGOINGS:
    		getOutgoings().clear();
    		getOutgoings().addAll((Collection) newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__INITIAL:
    		setInitial(
    		(ice.master.fsm.xdsml.fsmmt.model.AbstractState)
    		 newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case ice.master.fsm.xdsml.fsmmt.model.ModelPackage.FINITE_STATE_MACHINE__CURRENT:
    		setCurrent(
    		(ice.master.fsm.xdsml.fsmmt.model.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}

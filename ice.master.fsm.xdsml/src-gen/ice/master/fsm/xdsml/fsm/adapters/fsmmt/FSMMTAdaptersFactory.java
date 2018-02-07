package ice.master.fsm.xdsml.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.AbstractStateAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.FiniteStateMachineAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.StateAdapter;
import ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.TransitionAdapter;
import ice.master.fsm.xdsml.fsm.model.AbstractState;
import ice.master.fsm.xdsml.fsm.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsm.model.State;
import ice.master.fsm.xdsml.fsm.model.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class FSMMTAdaptersFactory implements AdaptersFactory {
  private static FSMMTAdaptersFactory instance;
  
  public static FSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ice.master.fsm.xdsml.fsm.model.State){
    	return createStateAdapter((ice.master.fsm.xdsml.fsm.model.State) o, res);
    }
    if (o instanceof ice.master.fsm.xdsml.fsm.model.FiniteStateMachine){
    	return createFiniteStateMachineAdapter((ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) o, res);
    }
    if (o instanceof ice.master.fsm.xdsml.fsm.model.AbstractState){
    	return createAbstractStateAdapter((ice.master.fsm.xdsml.fsm.model.AbstractState) o, res);
    }
    if (o instanceof ice.master.fsm.xdsml.fsm.model.Transition){
    	return createTransitionAdapter((ice.master.fsm.xdsml.fsm.model.Transition) o, res);
    }
    
    return null;
  }
  
  public AbstractStateAdapter createAbstractStateAdapter(final AbstractState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.AbstractStateAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.AbstractStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.AbstractStateAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.StateAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.StateAdapter) adapter;
    }
  }
  
  public FiniteStateMachineAdapter createFiniteStateMachineAdapter(final FiniteStateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.FiniteStateMachineAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.FiniteStateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.FiniteStateMachineAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.TransitionAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.TransitionAdapter) adapter;
    }
  }
}

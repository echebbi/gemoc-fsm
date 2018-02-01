package ice.master.fsm.melange.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FiniteStateMachineAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter;
import ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.TransitionAdapter;
import ice.master.fsm.melange.fsm.fsm.FiniteStateMachine;
import ice.master.fsm.melange.fsm.fsm.State;
import ice.master.fsm.melange.fsm.fsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class FSMMTAdaptersFactory implements AdaptersFactory {
  private static FSMMTAdaptersFactory instance;
  
  public static FSMMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FSMMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof ice.master.fsm.melange.fsm.fsm.FiniteStateMachine){
    	return createFiniteStateMachineAdapter((ice.master.fsm.melange.fsm.fsm.FiniteStateMachine) o, res);
    }
    if (o instanceof ice.master.fsm.melange.fsm.fsm.State){
    	return createStateAdapter((ice.master.fsm.melange.fsm.fsm.State) o, res);
    }
    if (o instanceof ice.master.fsm.melange.fsm.fsm.Transition){
    	return createTransitionAdapter((ice.master.fsm.melange.fsm.fsm.Transition) o, res);
    }
    
    return null;
  }
  
  public FiniteStateMachineAdapter createFiniteStateMachineAdapter(final FiniteStateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FiniteStateMachineAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FiniteStateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FiniteStateMachineAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    }
  }
}

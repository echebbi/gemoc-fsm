package ice.master.fsm.semantic;

import ice.master.fsm.model.FiniteStateMachine;
import ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FiniteStateMachineAspectFiniteStateMachineAspectContext {
  public final static FiniteStateMachineAspectFiniteStateMachineAspectContext INSTANCE = new FiniteStateMachineAspectFiniteStateMachineAspectContext();
  
  public static FiniteStateMachineAspectFiniteStateMachineAspectProperties getSelf(final FiniteStateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> map = new java.util.WeakHashMap<ice.master.fsm.model.FiniteStateMachine, ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties>();
  
  public Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> getMap() {
    return map;
  }
}

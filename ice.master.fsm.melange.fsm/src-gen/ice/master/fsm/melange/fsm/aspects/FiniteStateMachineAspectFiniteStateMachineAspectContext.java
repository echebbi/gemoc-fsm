package ice.master.fsm.melange.fsm.aspects;

import ice.master.fsm.melange.fsm.fsm.FiniteStateMachine;
import ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FiniteStateMachineAspectFiniteStateMachineAspectContext {
  public final static FiniteStateMachineAspectFiniteStateMachineAspectContext INSTANCE = new FiniteStateMachineAspectFiniteStateMachineAspectContext();
  
  public static FiniteStateMachineAspectFiniteStateMachineAspectProperties getSelf(final FiniteStateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> map = new java.util.WeakHashMap<ice.master.fsm.melange.fsm.fsm.FiniteStateMachine, ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties>();
  
  public Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> getMap() {
    return map;
  }
}

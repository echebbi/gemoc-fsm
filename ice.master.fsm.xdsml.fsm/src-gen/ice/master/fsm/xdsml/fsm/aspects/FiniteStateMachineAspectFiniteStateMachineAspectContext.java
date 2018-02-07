package ice.master.fsm.xdsml.fsm.aspects;

import ice.master.fsm.xdsml.fsm.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FiniteStateMachineAspectFiniteStateMachineAspectContext {
  public final static FiniteStateMachineAspectFiniteStateMachineAspectContext INSTANCE = new FiniteStateMachineAspectFiniteStateMachineAspectContext();
  
  public static FiniteStateMachineAspectFiniteStateMachineAspectProperties getSelf(final FiniteStateMachine _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> map = new java.util.WeakHashMap<ice.master.fsm.xdsml.fsm.model.FiniteStateMachine, ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties>();
  
  public Map<FiniteStateMachine, FiniteStateMachineAspectFiniteStateMachineAspectProperties> getMap() {
    return map;
  }
}

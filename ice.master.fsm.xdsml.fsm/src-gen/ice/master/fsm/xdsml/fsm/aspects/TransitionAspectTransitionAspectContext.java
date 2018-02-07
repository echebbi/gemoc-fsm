package ice.master.fsm.xdsml.fsm.aspects;

import ice.master.fsm.xdsml.fsm.model.Transition;
import ice.master.fsm.xdsml.fsm.aspects.TransitionAspectTransitionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class TransitionAspectTransitionAspectContext {
  public final static TransitionAspectTransitionAspectContext INSTANCE = new TransitionAspectTransitionAspectContext();
  
  public static TransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ice.master.fsm.xdsml.fsm.aspects.TransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition, TransitionAspectTransitionAspectProperties> map = new java.util.WeakHashMap<ice.master.fsm.xdsml.fsm.model.Transition, ice.master.fsm.xdsml.fsm.aspects.TransitionAspectTransitionAspectProperties>();
  
  public Map<Transition, TransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}

package ice.master.fsm.semantic;

import ice.master.fsm.model.AbstractState;
import ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class AbstractStateAspectAbstractStateAspectContext {
  public final static AbstractStateAspectAbstractStateAspectContext INSTANCE = new AbstractStateAspectAbstractStateAspectContext();
  
  public static AbstractStateAspectAbstractStateAspectProperties getSelf(final AbstractState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AbstractState, AbstractStateAspectAbstractStateAspectProperties> map = new java.util.WeakHashMap<ice.master.fsm.model.AbstractState, ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties>();
  
  public Map<AbstractState, AbstractStateAspectAbstractStateAspectProperties> getMap() {
    return map;
  }
}

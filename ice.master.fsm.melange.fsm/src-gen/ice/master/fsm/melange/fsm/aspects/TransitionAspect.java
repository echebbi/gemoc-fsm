package ice.master.fsm.melange.fsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ice.master.fsm.melange.fsm.fsm.State;
import ice.master.fsm.melange.fsm.fsm.Transition;
import ice.master.fsm.melange.fsm.aspects.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static boolean accepts(final Transition _self, final String event) {
	final ice.master.fsm.melange.fsm.aspects.TransitionAspectTransitionAspectProperties _self_ = ice.master.fsm.melange.fsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_accepts(_self_, _self, event);
	;
	return (boolean) result;
}
  
  public static State on(final Transition _self, final String event) {
	final ice.master.fsm.melange.fsm.aspects.TransitionAspectTransitionAspectProperties _self_ = ice.master.fsm.melange.fsm.aspects.TransitionAspectTransitionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_on(_self_, _self, event);
	;
	return (ice.master.fsm.melange.fsm.fsm.State) result;
}
  
  protected static boolean _privk3_accepts(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final String event) {
    String _trigger = _self.getTrigger();
    return Objects.equal(event, _trigger);
  }
  
  protected static State _privk3_on(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final String event) {
    State _xifexpression = null;
    boolean _accepts = TransitionAspect.accepts(_self, event);
    if (_accepts) {
      _xifexpression = _self.getTarget();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}

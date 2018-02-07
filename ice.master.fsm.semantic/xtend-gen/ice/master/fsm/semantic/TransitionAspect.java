package ice.master.fsm.semantic;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ice.master.fsm.model.AbstractState;
import ice.master.fsm.model.Transition;
import ice.master.fsm.semantic.TransitionAspectTransitionAspectProperties;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TransitionAspect {
  public static boolean accepts(final Transition _self, final String event) {
    final ice.master.fsm.semantic.TransitionAspectTransitionAspectProperties _self_ = ice.master.fsm.semantic.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_accepts(_self_, _self,event);;
    return (boolean)result;
  }
  
  public static AbstractState on(final Transition _self, final String event) {
    final ice.master.fsm.semantic.TransitionAspectTransitionAspectProperties _self_ = ice.master.fsm.semantic.TransitionAspectTransitionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_on(_self_, _self,event);;
    return (ice.master.fsm.model.AbstractState)result;
  }
  
  protected static boolean _privk3_accepts(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final String event) {
    String _trigger = _self.getTrigger();
    return Objects.equal(event, _trigger);
  }
  
  protected static AbstractState _privk3_on(final TransitionAspectTransitionAspectProperties _self_, final Transition _self, final String event) {
    AbstractState _xifexpression = null;
    boolean _accepts = TransitionAspect.accepts(_self, event);
    if (_accepts) {
      _xifexpression = _self.getTarget();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
}

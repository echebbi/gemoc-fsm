package ice.master.fsm.semantic;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ice.master.fsm.model.AbstractState;
import ice.master.fsm.model.Transition;
import ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties;
import ice.master.fsm.semantic.TransitionAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = AbstractState.class)
@SuppressWarnings("all")
public class AbstractStateAspect {
  /**
   * @return the next state if the event triggers a transition, null otherwise
   */
  public static AbstractState on(final AbstractState _self, final String event) {
    final ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_on(_self_, _self,event);;
    return (ice.master.fsm.model.AbstractState)result;
  }
  
  @Abstract
  public static void onEnter(final AbstractState _self) {
    final ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectContext.getSelf(_self);
    _privk3_onEnter(_self_, _self);;
  }
  
  @Abstract
  public static void onExit(final AbstractState _self) {
    final ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectContext.getSelf(_self);
    _privk3_onExit(_self_, _self);;
  }
  
  protected static AbstractState _privk3_on(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self, final String event) {
    EList<Transition> _outgoings = _self.getOutgoings();
    for (final Transition outgoing : _outgoings) {
      boolean _accepts = TransitionAspect.accepts(outgoing, event);
      if (_accepts) {
        return TransitionAspect.on(outgoing, event);
      }
    }
    return null;
  }
  
  protected static void _privk3_onEnter(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self) {
  }
  
  protected static void _privk3_onExit(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self) {
  }
}

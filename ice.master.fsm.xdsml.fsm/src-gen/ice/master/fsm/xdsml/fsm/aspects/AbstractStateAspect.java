package ice.master.fsm.xdsml.fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import ice.master.fsm.xdsml.fsm.model.AbstractState;
import ice.master.fsm.xdsml.fsm.model.Transition;
import ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties;
import ice.master.fsm.xdsml.fsm.aspects.TransitionAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = AbstractState.class)
@SuppressWarnings("all")
public class AbstractStateAspect {
  public static AbstractState on(final AbstractState _self, final String event) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) {
		result = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect
				.on((ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) _self, event);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.State) {
		result = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect._privk3_on(_self_,
				(ice.master.fsm.xdsml.fsm.model.State) _self, event);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.AbstractState) {
		result = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect._privk3_on(_self_,
				(ice.master.fsm.xdsml.fsm.model.AbstractState) _self, event);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (ice.master.fsm.xdsml.fsm.model.AbstractState) result;
}
  
  @Abstract
  public static void onEnter(final AbstractState _self) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
			.getSelf(_self);
	if (_self instanceof ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) {
		ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect
				.onEnter((ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) _self);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.State) {
		ice.master.fsm.xdsml.fsm.aspects.StateAspect.onEnter((ice.master.fsm.xdsml.fsm.model.State) _self);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.AbstractState) {
		ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect._privk3_onEnter(_self_,
				(ice.master.fsm.xdsml.fsm.model.AbstractState) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Abstract
  public static void onExit(final AbstractState _self) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
			.getSelf(_self);
	if (_self instanceof ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) {
		ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect._privk3_onExit(_self_,
				(ice.master.fsm.xdsml.fsm.model.FiniteStateMachine) _self);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.State) {
		ice.master.fsm.xdsml.fsm.aspects.StateAspect.onExit((ice.master.fsm.xdsml.fsm.model.State) _self);
	} else if (_self instanceof ice.master.fsm.xdsml.fsm.model.AbstractState) {
		ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect._privk3_onExit(_self_,
				(ice.master.fsm.xdsml.fsm.model.AbstractState) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
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

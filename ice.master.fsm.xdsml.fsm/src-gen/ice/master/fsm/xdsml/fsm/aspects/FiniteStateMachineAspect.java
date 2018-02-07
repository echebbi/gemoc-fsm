package ice.master.fsm.xdsml.fsm.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ice.master.fsm.xdsml.fsm.model.AbstractState;
import ice.master.fsm.xdsml.fsm.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsm.model.State;
import ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import ice.master.fsm.xdsml.fsm.aspects.StateAspect;
import java.util.Scanner;

@Aspect(className = FiniteStateMachine.class)
@SuppressWarnings("all")
public class FiniteStateMachineAspect {
  private static void enter(final FiniteStateMachine _self, final AbstractState next) {
    final ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_enter(_self_, _self,next);;
  }
  
  @Step
  public static AbstractState on(final FiniteStateMachine _self, final String event) {
	final ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_on(_self_, _self, event));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "FiniteStateMachine", "on");
	} else {
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (ice.master.fsm.xdsml.fsm.model.AbstractState) result;
}
  
  @Main
  public static void main(final FiniteStateMachine _self) {
	final ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectContext
			.getSelf(_self);
	_privk3_main(_self_, _self);
	;
}
  
  public static State current(final FiniteStateMachine _self) {
	final ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_current(_self_, _self);
	;
	return (ice.master.fsm.xdsml.fsm.model.State) result;
}
  
  public static void current(final FiniteStateMachine _self, final State current) {
	final ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspectFiniteStateMachineAspectContext
			.getSelf(_self);
	_privk3_current(_self_, _self, current);
	;
}
  
  protected static void _privk3_enter(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final AbstractState next) {
    FiniteStateMachineAspect.current(_self, ((State) next));
    State _current = FiniteStateMachineAspect.current(_self);
    boolean _tripleNotEquals = (_current != null);
    if (_tripleNotEquals) {
      StateAspect.onEnter(FiniteStateMachineAspect.current(_self));
    }
  }
  
  protected static AbstractState _privk3_on(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final String event) {
    State _current = FiniteStateMachineAspect.current(_self);
    boolean _tripleEquals = (_current == null);
    if (_tripleEquals) {
      return null;
    }
    AbstractState next = StateAspect.on(FiniteStateMachineAspect.current(_self), event);
    if ((next != null)) {
      StateAspect.onExit(FiniteStateMachineAspect.current(_self));
      FiniteStateMachineAspect.enter(_self, next);
    }
    return FiniteStateMachineAspect.current(_self);
  }
  
  protected static void _privk3_main(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self) {
    FiniteStateMachineAspect.enter(_self, _self.getInitial());
    final Scanner cli = new Scanner(System.in);
    String event = null;
    boolean stopped = false;
    while (((!stopped) && ((event = cli.nextLine()) != null))) {
      boolean _equals = Objects.equal(event, "exit()");
      if (_equals) {
        stopped = true;
      } else {
        FiniteStateMachineAspect.on(_self, event);
      }
    }
  }
  
  protected static State _privk3_current(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ice.master.fsm.xdsml.fsm.model.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.current;
  }
  
  protected static void _privk3_current(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final State current) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrent")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, current);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.current = current;
    }
  }
}

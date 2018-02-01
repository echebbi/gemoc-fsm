package ice.master.fsm.melange.fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ice.master.fsm.melange.fsm.fsm.State;
import ice.master.fsm.melange.fsm.fsm.Transition;
import ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectProperties;
import ice.master.fsm.melange.fsm.aspects.TransitionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static State on(final State _self, final String event) {
	final ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectProperties _self_ = ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectContext
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
		manager.executeStep(_self, command, "State", "on");
	} else {
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (ice.master.fsm.melange.fsm.fsm.State) result;
}
  
  @Step
  public static void onEnter(final State _self) {
	final ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectProperties _self_ = ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_onEnter(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "onEnter");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void onExit(final State _self) {
	final ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectProperties _self_ = ice.master.fsm.melange.fsm.aspects.StateAspectStateAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_onExit(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "State", "onExit");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static State _privk3_on(final StateAspectStateAspectProperties _self_, final State _self, final String event) {
    EList<Transition> _outgoings = _self.getOutgoings();
    for (final Transition outgoing : _outgoings) {
      boolean _accepts = TransitionAspect.accepts(outgoing, event);
      if (_accepts) {
        return TransitionAspect.on(outgoing, event);
      }
    }
    return null;
  }
  
  protected static void _privk3_onEnter(final StateAspectStateAspectProperties _self_, final State _self) {
    String _name = _self.getName();
    String _plus = ("Entering " + _name);
    InputOutput.<String>println(_plus);
  }
  
  protected static void _privk3_onExit(final StateAspectStateAspectProperties _self_, final State _self) {
    String _name = _self.getName();
    String _plus = ("Exiting " + _name);
    InputOutput.<String>println(_plus);
  }
}

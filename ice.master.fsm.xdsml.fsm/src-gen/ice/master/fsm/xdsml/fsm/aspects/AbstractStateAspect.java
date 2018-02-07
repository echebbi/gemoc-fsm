package ice.master.fsm.xdsml.fsm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ice.master.fsm.xdsml.fsm.model.AbstractState;
import ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties;

@Aspect(className = AbstractState.class)
@SuppressWarnings("all")
public class AbstractStateAspect {
  @Step
  public static AbstractState on(final AbstractState _self, final String event) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
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
		manager.executeStep(_self, command, "AbstractState", "on");
	} else {
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (ice.master.fsm.xdsml.fsm.model.AbstractState) result;
}
  
  @Step
  public static void onEnter(final AbstractState _self) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
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
		manager.executeStep(_self, command, "AbstractState", "onEnter");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void onExit(final AbstractState _self) {
	final ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspectAbstractStateAspectContext
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
		manager.executeStep(_self, command, "AbstractState", "onExit");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static AbstractState _privk3_on(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self, final String event) {
    return null;
  }
  
  protected static void _privk3_onEnter(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self) {
  }
  
  protected static void _privk3_onExit(final AbstractStateAspectAbstractStateAspectProperties _self_, final AbstractState _self) {
  }
}

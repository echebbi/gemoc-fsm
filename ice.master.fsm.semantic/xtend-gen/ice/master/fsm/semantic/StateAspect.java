package ice.master.fsm.semantic;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ice.master.fsm.model.State;
import ice.master.fsm.semantic.AbstractStateAspect;
import ice.master.fsm.semantic.StateAspectStateAspectProperties;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect extends AbstractStateAspect {
  @Step
  public static void onEnter(final State _self) {
    final ice.master.fsm.semantic.StateAspectStateAspectProperties _self_ = ice.master.fsm.semantic.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_onEnter(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"State","onEnter");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void onExit(final State _self) {
    final ice.master.fsm.semantic.StateAspectStateAspectProperties _self_ = ice.master.fsm.semantic.StateAspectStateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_onExit(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"State","onExit");
    } else {
    	command.execute();
    }
    ;;
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

package ice.master.fsm.semantic;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import ice.master.fsm.model.AbstractState;
import ice.master.fsm.model.FiniteStateMachine;
import ice.master.fsm.semantic.AbstractStateAspect;
import ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;

@Aspect(className = FiniteStateMachine.class)
@SuppressWarnings("all")
public class FiniteStateMachineAspect extends AbstractStateAspect {
  /**
   * Initializes current state
   */
  @OverrideAspectMethod
  public static void onEnter(final FiniteStateMachine _self) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_onEnter(_self_, _self);;
  }
  
  /**
   * Sets current state
   */
  private static void enter(final FiniteStateMachine _self, final AbstractState next) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_enter(_self_, _self,next);;
  }
  
  @Step
  @OverrideAspectMethod
  public static AbstractState on(final FiniteStateMachine _self, final String event) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_on(_self_, _self,event));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"FiniteStateMachine","on");
    } else {
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (ice.master.fsm.model.AbstractState)result;
  }
  
  /**
   * Forwards an event to FSM's current state
   */
  private static void forwardToCurrentState(final FiniteStateMachine _self, final String event) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_forwardToCurrentState(_self_, _self,event);;
  }
  
  @InitializeModel
  public static void enterInitialState(final FiniteStateMachine _self, final EList<String> args) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_enterInitialState(_self_, _self,args);;
  }
  
  @Main
  public static void main(final FiniteStateMachine _self) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  public static AbstractState current(final FiniteStateMachine _self) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_current(_self_, _self);;
    return (ice.master.fsm.model.AbstractState)result;
  }
  
  public static void current(final FiniteStateMachine _self, final AbstractState current) {
    final ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_ = ice.master.fsm.semantic.FiniteStateMachineAspectFiniteStateMachineAspectContext.getSelf(_self);
    _privk3_current(_self_, _self,current);;
  }
  
  protected static void _privk3_onEnter(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self) {
    FiniteStateMachineAspect.enter(_self, _self.getInitial());
  }
  
  protected static void _privk3_enter(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final AbstractState next) {
    FiniteStateMachineAspect.current(_self, next);
    AbstractState _current = FiniteStateMachineAspect.current(_self);
    boolean _tripleNotEquals = (_current != null);
    if (_tripleNotEquals) {
      AbstractStateAspect.onEnter(FiniteStateMachineAspect.current(_self));
    }
  }
  
  private static AbstractState super_on(final FiniteStateMachine _self, final String event) {
    final ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectProperties _self_ = ice.master.fsm.semantic.AbstractStateAspectAbstractStateAspectContext.getSelf(_self);
    return  ice.master.fsm.semantic.AbstractStateAspect._privk3_on(_self_, _self,event);
  }
  
  protected static AbstractState _privk3_on(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final String event) {
    final AbstractState successor = FiniteStateMachineAspect.super_on(_self, event);
    if ((successor != null)) {
      return successor;
    }
    FiniteStateMachineAspect.forwardToCurrentState(_self, event);
    return null;
  }
  
  protected static void _privk3_forwardToCurrentState(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final String event) {
    AbstractState _current = FiniteStateMachineAspect.current(_self);
    boolean _tripleEquals = (_current == null);
    if (_tripleEquals) {
      return;
    }
    final AbstractState next = AbstractStateAspect.on(FiniteStateMachineAspect.current(_self), event);
    if ((next != null)) {
      AbstractStateAspect.onExit(FiniteStateMachineAspect.current(_self));
      FiniteStateMachineAspect.enter(_self, next);
    }
  }
  
  protected static void _privk3_enterInitialState(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final EList<String> args) {
    FiniteStateMachineAspect.onEnter(_self);
  }
  
  protected static void _privk3_main(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self) {
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
    AbstractStateAspect.onExit(_self);
  }
  
  protected static AbstractState _privk3_current(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrent") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (ice.master.fsm.model.AbstractState) ret;
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
  
  protected static void _privk3_current(final FiniteStateMachineAspectFiniteStateMachineAspectProperties _self_, final FiniteStateMachine _self, final AbstractState current) {
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

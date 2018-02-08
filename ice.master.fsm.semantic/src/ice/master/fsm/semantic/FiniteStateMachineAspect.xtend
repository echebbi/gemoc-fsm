package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import ice.master.fsm.model.AbstractState
import ice.master.fsm.model.FiniteStateMachine
import java.util.Scanner
import org.eclipse.emf.common.util.EList

@Aspect(className=FiniteStateMachine)
class FiniteStateMachineAspect extends AbstractStateAspect {
	
	public AbstractState current
	
	/** Initializes current state */
	@OverrideAspectMethod
	def public void onEnter() {
		_self.enter(_self.initial)
	}
	
	/** Sets current state */
	def private void enter(AbstractState next) {
		_self.current = next
		
		if( _self.current !== null )
			_self.current.onEnter()
	}

	@Step
	@OverrideAspectMethod
	/** Triggers a transition if possible, else forwards the event to FSM's current state */
	def public AbstractState on(String event) {
		// Check whether a transition of the FSM can be triggered
		val successor = _self.super_on(event)
		
		if( successor !== null )
			return successor 
		
		_self.forwardToCurrentState(event)
		return null
	}
	
	/** Forwards an event to FSM's current state */
	def private void forwardToCurrentState(String event) {
		if( _self.current === null )
			return
			
		val AbstractState next = _self.current.on(event)

		if( next !== null ) {
			_self.current.onExit()
			_self.enter(next)
		}
	}

	@InitializeModel
	def public void enterInitialState(EList<String> args) {	
		_self.onEnter()	
	}
	
	@Main
	def public void main() {
		val cli = new Scanner(System.in)
		var String event
		
		var stopped = false
		
		while ((! stopped) && ((event = cli.nextLine) !== null)) {
			if( event == "exit()" )
				stopped = true
			else
				_self.on(event)
		}
		
		_self.onExit()
	}
	
}

package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import ice.master.fsm.model.fsm.FiniteStateMachine
import ice.master.fsm.model.fsm.State
import java.util.Scanner

import static extension ice.master.fsm.semantic.StateAspect.*

@Aspect(className=FiniteStateMachine)
class FiniteStateMachineAspect {
	
	private State current

	@Step
	def public void on(String event) {
		if (_self.current === null)
			return;
			
		var State next = _self.current.on(event)

		if (next !== null) {
			_self.current.onExit()
			_self.current(next)
			_self.current.onEnter()
		}
	}
	
	@Main
	def public void main() {
		_self.current = _self.initial
		
		val cli = new Scanner(System.in)
		var String event
		
		var stopped = false
		
//		println("Event ? ")
//		print("> ")
		
		while ((! stopped) && ((event = cli.nextLine) !== null)) {
			if( event == "exit()" )
				stopped = true
			else
				_self.on(event)
				
//			println("Event ? ")
//			print("> ")
		}
	}
	
}
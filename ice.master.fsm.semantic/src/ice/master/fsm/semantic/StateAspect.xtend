package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import ice.master.fsm.model.AbstractState
import ice.master.fsm.model.State
import ice.master.fsm.model.Transition

import static extension ice.master.fsm.semantic.TransitionAspect.*

@Aspect(className=State)
class StateAspect {
	
	@Step
	def public AbstractState on(String event) {
		for (Transition outgoing : _self.outgoings)
			if (outgoing.accepts(event))
				return outgoing.on(event);

		return null;
	}
	
	@Step
	def public void onEnter() {
		println("Entering " + _self.name)
	}
	
	@Step
	def public void onExit() {
		println("Exiting " + _self.name)
	}
	
}

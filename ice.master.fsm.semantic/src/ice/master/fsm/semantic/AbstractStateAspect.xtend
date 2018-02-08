package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Abstract
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ice.master.fsm.model.AbstractState
import ice.master.fsm.model.Transition

import static extension ice.master.fsm.semantic.TransitionAspect.*

@Aspect(className=AbstractState)
class AbstractStateAspect {
	
	/** @return the next state if the event triggers a transition, null otherwise */
	// TODO Investigate why using Optional<AbstractState> as return type makes xDMSL's generation fail
	def public AbstractState on(String event) {
		for (Transition outgoing : _self.outgoings)
			if (outgoing.accepts(event))
				return outgoing.on(event)

		return null;
	}
	
	@Abstract
	def public void onEnter() {
		
	}
	
	@Abstract
	def public void onExit() {
		
	}
	
}
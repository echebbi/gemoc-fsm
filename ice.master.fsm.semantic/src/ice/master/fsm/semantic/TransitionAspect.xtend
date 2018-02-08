package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ice.master.fsm.model.AbstractState
import ice.master.fsm.model.Transition

@Aspect(className=Transition)
class TransitionAspect {

	def public boolean accepts(String event) {
		return event == _self.trigger
	}

	def public AbstractState on(String event) {
		return if(_self.accepts(event)) _self.target else null
	}
	
}

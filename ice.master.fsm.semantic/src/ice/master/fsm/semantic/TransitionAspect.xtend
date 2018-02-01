package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import ice.master.fsm.model.fsm.State
import ice.master.fsm.model.fsm.Transition

@Aspect(className=Transition)
class TransitionAspect {

//	@Step
	def public boolean accepts(String event) {
		return event == _self.trigger
	}

//	@Step
	def public State on(String event) {
		return if(_self.accepts(event)) _self.target else null
	}
	
}
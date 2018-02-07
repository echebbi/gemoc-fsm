package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import ice.master.fsm.model.AbstractState

@Aspect(className=AbstractState)
class AbstractStateAspect {
	
	@Step
	def public AbstractState on(String event) {

	}
	
	@Step
	def public void onEnter() {
		
	}
	
	@Step
	def public void onExit() {
		
	}
	
}
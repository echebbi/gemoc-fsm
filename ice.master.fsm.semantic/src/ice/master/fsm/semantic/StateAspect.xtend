package ice.master.fsm.semantic

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import ice.master.fsm.model.State

@Aspect(className=State)
class StateAspect extends AbstractStateAspect {
	
	@Step
	def public void onEnter() {
		println("Entering " + _self.name)
	}
	
	@Step
	def public void onExit() {
		println("Exiting " + _self.name)
	}
}

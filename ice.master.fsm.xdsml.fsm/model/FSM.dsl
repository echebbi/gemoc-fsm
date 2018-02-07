DSL ice.master.fsm.xdsml.FSM {
	abstract-syntax {
		ecore = "platform:/resource/ice.master.fsm.xdsml.fsm/model/FSM.ecore"
	}
	semantics {
		k3 = "ice.master.fsm.xdsml.fsm.aspects.FiniteStateMachineAspect",
		"ice.master.fsm.xdsml.fsm.aspects.TransitionAspect",
		"ice.master.fsm.xdsml.fsm.aspects.StateAspect",
		"ice.master.fsm.xdsml.fsm.aspects.AbstractStateAspect"
	}
}

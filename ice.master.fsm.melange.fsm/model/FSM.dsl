DSL ice.master.fsm.melange.FSM {
	abstract-syntax {
		ecore = "platform:/resource/ice.master.fsm.melange.fsm/model/FSM.ecore"
	}
	semantics {
		k3 = "ice.master.fsm.melange.fsm.aspects.StateAspect",
		"ice.master.fsm.melange.fsm.aspects.FiniteStateMachineAspect",
		"ice.master.fsm.melange.fsm.aspects.TransitionAspect"
	}
}

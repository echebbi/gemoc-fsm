package ice.master.fsm.melange.fsm.adapters.fsmmt.fsm;

import ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine;
import ice.master.fsm.melange.fsmmt.fsm.FsmFactory;
import ice.master.fsm.melange.fsmmt.fsm.FsmPackage;
import ice.master.fsm.melange.fsmmt.fsm.State;
import ice.master.fsm.melange.fsmmt.fsm.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FSMMTAdaptersFactory adaptersFactory = ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  
  private ice.master.fsm.melange.fsm.fsm.FsmFactory fsmAdaptee = ice.master.fsm.melange.fsm.fsm.FsmFactory.eINSTANCE;
  
  @Override
  public FiniteStateMachine createFiniteStateMachine() {
    return adaptersFactory.createFiniteStateMachineAdapter(fsmAdaptee.createFiniteStateMachine(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return ice.master.fsm.melange.fsmmt.fsm.FsmPackage.eINSTANCE;
  }
}

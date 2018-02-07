package ice.master.fsm.xdsml.fsm.adapters.fsmmt.model;

import ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory;
import ice.master.fsm.xdsml.fsmmt.model.AbstractState;
import ice.master.fsm.xdsml.fsmmt.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsmmt.model.ModelFactory;
import ice.master.fsm.xdsml.fsmmt.model.ModelPackage;
import ice.master.fsm.xdsml.fsmmt.model.State;
import ice.master.fsm.xdsml.fsmmt.model.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ModelFactoryAdapter extends EFactoryImpl implements ModelFactory {
  private FSMMTAdaptersFactory adaptersFactory = ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance();
  
  private ice.master.fsm.xdsml.fsm.model.ModelFactory modelAdaptee = ice.master.fsm.xdsml.fsm.model.ModelFactory.eINSTANCE;
  
  @Override
  public AbstractState createAbstractState() {
    return adaptersFactory.createAbstractStateAdapter(modelAdaptee.createAbstractState(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(modelAdaptee.createState(), null);
  }
  
  @Override
  public FiniteStateMachine createFiniteStateMachine() {
    return adaptersFactory.createFiniteStateMachineAdapter(modelAdaptee.createFiniteStateMachine(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(modelAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getModelPackage();
  }
  
  public ModelPackage getModelPackage() {
    return ice.master.fsm.xdsml.fsmmt.model.ModelPackage.eINSTANCE;
  }
}

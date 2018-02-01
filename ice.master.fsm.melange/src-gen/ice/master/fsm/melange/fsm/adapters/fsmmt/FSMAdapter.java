package ice.master.fsm.melange.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import ice.master.fsm.melange.FSMMT;
import ice.master.fsm.melange.fsmmt.fsm.FsmFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class FSMAdapter extends ResourceAdapter implements FSMMT {
  public FSMAdapter() {
    super(ice.master.fsm.melange.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
  }
  
  @Override
  public FsmFactory getFsmFactory() {
    return new ice.master.fsm.melange.fsm.adapters.fsmmt.fsm.FsmFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getFsmFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

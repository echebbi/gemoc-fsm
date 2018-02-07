package ice.master.fsm.xdsml.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import ice.master.fsm.xdsml.FSMMT;
import ice.master.fsm.xdsml.fsmmt.model.ModelFactory;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class FSMAdapter extends ResourceAdapter implements FSMMT {
  public FSMAdapter() {
    super(ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ModelFactory getModelFactory() {
    return new ice.master.fsm.xdsml.fsm.adapters.fsmmt.model.ModelFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getModelFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}

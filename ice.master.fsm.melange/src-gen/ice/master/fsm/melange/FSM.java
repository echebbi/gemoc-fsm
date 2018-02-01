package ice.master.fsm.melange;

import fr.inria.diverse.melange.lib.IMetamodel;
import ice.master.fsm.melange.FSMMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class FSM implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static FSM load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    FSM mm = new FSM();
    mm.setResource(res);
    return mm ;
  }
  
  public FSMMT toFSMMT() {
    ice.master.fsm.melange.fsm.adapters.fsmmt.FSMAdapter adaptee = new ice.master.fsm.melange.fsm.adapters.fsmmt.FSMAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}

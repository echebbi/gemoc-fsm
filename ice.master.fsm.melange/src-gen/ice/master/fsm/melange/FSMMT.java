package ice.master.fsm.melange;

import fr.inria.diverse.melange.lib.IModelType;
import ice.master.fsm.melange.fsmmt.fsm.FsmFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}

package ice.master.fsm.xdsml;

import fr.inria.diverse.melange.lib.IModelType;
import ice.master.fsm.xdsml.fsmmt.model.ModelFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FSMMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ModelFactory getModelFactory();
  
  public abstract void save(final String uri) throws IOException;
}

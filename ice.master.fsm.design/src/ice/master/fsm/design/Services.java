package ice.master.fsm.design;

import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import ice.master.fsm.xdsml.fsm.model.AbstractState;
import ice.master.fsm.xdsml.fsm.model.FiniteStateMachine;
import ice.master.fsm.xdsml.fsm.model.Transition;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
      return self;
    }
    
    /**
     * Deletes the representations having {@code eObject} has target, if any.
     * 
     * @param eObject
     * 			The object which representations have to be removed.
     */
    public void deleteRepresentations(EObject eObject) {
    	awakeOpenedEditors();
    	doDeleteRepresentations(eObject);
    }
    
    /**
     * Awakes Sirius editors so that the framework becomes able to close them
     * automatically when the relative representation is deleted.
     */
    private void awakeOpenedEditors() {
    	for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
    		for (IWorkbenchPage page : window.getPages()) {
    			for (IEditorReference editor : page.getEditorReferences()) {
    				editor.getPart(true);	// "Awake" the editor so that Sirius is able to close it automatically
    			}
    		}
    	}
    }

    /**
     * Delete all the representations of {@code eObject}.
     * 
     * @param eObject
     * 			The object which representations have to be removed.
     */
	private void doDeleteRepresentations(EObject eObject) {
		Session session = SessionManager.INSTANCE.getSession(eObject);
		
		for (DRepresentationDescriptor descriptor: DialectManager.INSTANCE.getAllRepresentationDescriptors(session)) {
    		if( ! descriptor.getTarget().equals(eObject) )
    			continue;
    		
    		DialectManager.INSTANCE.deleteRepresentation(descriptor, session);
		}
	}
	
	public void deleteIncomingTransitions(EObject eObject) {
		if( eObject instanceof AbstractState ) {
			AbstractState state = (AbstractState) eObject;
			
			FiniteStateMachine fsm = state.getParent();
			
			if( fsm == null )
				return;
			
			for( AbstractState sibling : fsm.getStates() ) {
				for (Iterator<Transition> iterator = sibling.getOutgoings().iterator() ; iterator.hasNext() ; ) {
					Transition transition = iterator.next();
					
					if( Objects.equals(state, transition.getTarget()) )
						iterator.remove();
				}
			}
		}
	}
}

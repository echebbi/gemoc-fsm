package ice.master.fsm.xdsml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	ice.master.fsm.xdsml.fsm.model.ModelPackage.eNS_URI,
    	ice.master.fsm.xdsml.fsm.model.ModelPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor fSM = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ice.master.fsm.xdsml.FSM", "", "http://ice.master.fsm.xdsml.fsm/model/", "ice.master.fsm.xdsml.FSMMT"
    );
    fSM.addAdapter("ice.master.fsm.xdsml.FSMMT", ice.master.fsm.xdsml.fsm.adapters.fsmmt.FSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ice.master.fsm.xdsml.FSM",
    	fSM
    );
    MelangeRegistry.ModelTypeDescriptor fSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ice.master.fsm.xdsml.FSMMT", "", "http://ice.master.fsm.xdsml.fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ice.master.fsm.xdsml.FSMMT",
    	fSMMT
    );
  }
}

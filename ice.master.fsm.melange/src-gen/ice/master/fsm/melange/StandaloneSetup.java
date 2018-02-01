package ice.master.fsm.melange;

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
    	ice.master.fsm.melange.fsm.fsm.FsmPackage.eNS_URI,
    	ice.master.fsm.melange.fsm.fsm.FsmPackage.eINSTANCE
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
    	"ice.master.fsm.melange.FSM", "", "http://ice.master.fsm.melange.fsm/fsm/", "ice.master.fsm.melange.FSMMT"
    );
    fSM.addAdapter("ice.master.fsm.melange.FSMMT", ice.master.fsm.melange.fsm.adapters.fsmmt.FSMAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ice.master.fsm.melange.FSM",
    	fSM
    );
    MelangeRegistry.ModelTypeDescriptor fSMMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ice.master.fsm.melange.FSMMT", "", "http://ice.master.fsm.melange.fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ice.master.fsm.melange.FSMMT",
    	fSMMT
    );
  }
}

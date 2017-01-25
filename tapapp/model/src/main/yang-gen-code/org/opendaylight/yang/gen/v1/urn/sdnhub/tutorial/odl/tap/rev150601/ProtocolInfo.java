package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap;
import org.opendaylight.yangtools.yang.binding.DataObject;


public interface ProtocolInfo
    extends
    DataObject,
    Augmentation<Tap>
{




    java.lang.Integer getDlType();
    
    java.lang.Short getNwProto();
    
    java.lang.Integer getTpSrc();
    
    java.lang.Integer getTpDst();

}


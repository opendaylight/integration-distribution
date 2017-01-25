package org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.tapapp.tapapp.impl.rev150604.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.tapapp.tapapp.impl.rev150604.modules.module.configuration.tapapp.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.tapapp.tapapp.impl.rev150604.modules.module.configuration.tapapp.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.tapapp.tapapp.impl.rev150604.modules.module.configuration.tapapp.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tapapp-impl</b>
 * <br>(Source path: <i>META-INF/yang/tapapp-impl.yang</i>):
 * <pre>
 * case tapapp-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:tapapp:tapapp-impl?revision=2015-06-04)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:tapapp:tapapp-impl?revision=2015-06-04)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:sdnhub:odl:tutorial:tapapp:tapapp-impl?revision=2015-06-04)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tapapp-impl/modules/module/configuration/(urn:sdnhub:odl:tutorial:tapapp:tapapp-impl?revision=2015-06-04)tapapp-impl</i>
 *
 */
public interface TapappImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.odl.tutorial.tapapp.tapapp.impl.rev150604.modules.module.configuration.TapappImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:odl:tutorial:tapapp:tapapp-impl",
        "2015-06-04", "tapapp-impl").intern();

    DataBroker getDataBroker();
    
    NotificationService getNotificationService();
    
    RpcRegistry getRpcRegistry();

}


package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.grouping.MacAddressMatch;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.grouping.IpAddressMatch;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tap</b>
 * <br>(Source path: <i>META-INF/yang/tap.yang</i>):
 * <pre>
 * grouping tap-grouping {
 *     leaf node {
 *         type leafref;
 *     }
 *     leaf-list src-node-connector {
 *         type leafref;
 *     }
 *     leaf-list sink-node-connector {
 *         type leafref;
 *     }
 *     container mac-address-match {
 *         leaf type {
 *             type field-type;
 *         }
 *         leaf value {
 *             type mac-address;
 *         }
 *     }
 *     container ip-address-match {
 *         leaf type {
 *             type field-type;
 *         }
 *         leaf value {
 *             type ipv4-prefix;
 *         }
 *     }
 *     leaf traffic-match {
 *         type traffic-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tap/tap-grouping</i>
 *
 */
public interface TapGrouping
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:tutorial:odl:tap",
        "2015-06-01", "tap-grouping").intern();

    NodeId getNode();
    
    List<NodeConnectorId> getSrcNodeConnector();
    
    List<NodeConnectorId> getSinkNodeConnector();
    
    MacAddressMatch getMacAddressMatch();
    
    IpAddressMatch getIpAddressMatch();
    
    TrafficType getTrafficMatch();

}


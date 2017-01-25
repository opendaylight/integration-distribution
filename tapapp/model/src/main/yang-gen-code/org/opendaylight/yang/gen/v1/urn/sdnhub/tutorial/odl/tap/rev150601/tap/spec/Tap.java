package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>tap</b>
 * <br>(Source path: <i>META-INF/yang/tap.yang</i>):
 * <pre>
 * list tap {
 *     key "id"
 *     leaf id {
 *         type string;
 *     }
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
 *     leaf dl-type {
 *         type uint16;
 *     }
 *     leaf nw-proto {
 *         type uint8;
 *     }
 *     leaf tp-src {
 *         type uint16;
 *     }
 *     leaf tp-dst {
 *         type uint16;
 *     }
 *     augment \(urn:sdnhub:tutorial:odl:tap)tap-spec\(urn:sdnhub:tutorial:odl:tap)tap {
 *         status CURRENT;
 *         leaf dl-type {
 *             type uint16;
 *         }
 *         leaf nw-proto {
 *             type uint8;
 *         }
 *         leaf tp-src {
 *             type uint16;
 *         }
 *         leaf tp-dst {
 *             type uint16;
 *         }
 *     }
 *     uses tap-grouping;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>tap/tap-spec/tap</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.TapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.TapBuilder
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.TapKey
 *
 */
public interface Tap
    extends
    ChildOf<TapSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>,
    TapGrouping,
    Identifiable<TapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:sdnhub:tutorial:odl:tap",
        "2015-06-01", "tap").intern();

    java.lang.String getId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     */
    TapKey getKey();

}


package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.grouping.IpAddressMatch;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.grouping.MacAddressMatch;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TrafficType;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap
 *
 */
public class TapBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap> {

    private java.lang.String _id;
    private IpAddressMatch _ipAddressMatch;
    private TapKey _key;
    private MacAddressMatch _macAddressMatch;
    private NodeId _node;
    private List<NodeConnectorId> _sinkNodeConnector;
    private List<NodeConnectorId> _srcNodeConnector;
    private TrafficType _trafficMatch;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> augmentation = Collections.emptyMap();

    public TapBuilder() {
    }
    public TapBuilder(org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping arg) {
        this._node = arg.getNode();
        this._srcNodeConnector = arg.getSrcNodeConnector();
        this._sinkNodeConnector = arg.getSinkNodeConnector();
        this._macAddressMatch = arg.getMacAddressMatch();
        this._ipAddressMatch = arg.getIpAddressMatch();
        this._trafficMatch = arg.getTrafficMatch();
    }

    public TapBuilder(Tap base) {
        if (base.getKey() == null) {
            this._key = new TapKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._ipAddressMatch = base.getIpAddressMatch();
        this._macAddressMatch = base.getMacAddressMatch();
        this._node = base.getNode();
        this._sinkNodeConnector = base.getSinkNodeConnector();
        this._srcNodeConnector = base.getSrcNodeConnector();
        this._trafficMatch = base.getTrafficMatch();
        if (base instanceof TapImpl) {
            TapImpl impl = (TapImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getNode();
            this._srcNodeConnector = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getSrcNodeConnector();
            this._sinkNodeConnector = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getSinkNodeConnector();
            this._macAddressMatch = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getMacAddressMatch();
            this._ipAddressMatch = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getIpAddressMatch();
            this._trafficMatch = ((org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping)arg).getTrafficMatch();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.TapGrouping] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getId() {
        return _id;
    }
    
    public IpAddressMatch getIpAddressMatch() {
        return _ipAddressMatch;
    }
    
    public TapKey getKey() {
        return _key;
    }
    
    public MacAddressMatch getMacAddressMatch() {
        return _macAddressMatch;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public List<NodeConnectorId> getSinkNodeConnector() {
        return _sinkNodeConnector;
    }
    
    public List<NodeConnectorId> getSrcNodeConnector() {
        return _srcNodeConnector;
    }
    
    public TrafficType getTrafficMatch() {
        return _trafficMatch;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TapBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public TapBuilder setIpAddressMatch(final IpAddressMatch value) {
        this._ipAddressMatch = value;
        return this;
    }
    
     
    public TapBuilder setKey(final TapKey value) {
        this._key = value;
        return this;
    }
    
     
    public TapBuilder setMacAddressMatch(final MacAddressMatch value) {
        this._macAddressMatch = value;
        return this;
    }
    
     
    public TapBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public TapBuilder setSinkNodeConnector(final List<NodeConnectorId> value) {
        this._sinkNodeConnector = value;
        return this;
    }
    
     
    public TapBuilder setSrcNodeConnector(final List<NodeConnectorId> value) {
        this._srcNodeConnector = value;
        return this;
    }
    
     
    public TapBuilder setTrafficMatch(final TrafficType value) {
        this._trafficMatch = value;
        return this;
    }
    
    public TapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public TapBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Tap build() {
        return new TapImpl(this);
    }

    private static final class TapImpl implements Tap {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap.class;
        }

        private final java.lang.String _id;
        private final IpAddressMatch _ipAddressMatch;
        private final TapKey _key;
        private final MacAddressMatch _macAddressMatch;
        private final NodeId _node;
        private final List<NodeConnectorId> _sinkNodeConnector;
        private final List<NodeConnectorId> _srcNodeConnector;
        private final TrafficType _trafficMatch;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> augmentation = Collections.emptyMap();

        private TapImpl(TapBuilder base) {
            if (base.getKey() == null) {
                this._key = new TapKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._ipAddressMatch = base.getIpAddressMatch();
            this._macAddressMatch = base.getMacAddressMatch();
            this._node = base.getNode();
            this._sinkNodeConnector = base.getSinkNodeConnector();
            this._srcNodeConnector = base.getSrcNodeConnector();
            this._trafficMatch = base.getTrafficMatch();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public IpAddressMatch getIpAddressMatch() {
            return _ipAddressMatch;
        }
        
        @Override
        public TapKey getKey() {
            return _key;
        }
        
        @Override
        public MacAddressMatch getMacAddressMatch() {
            return _macAddressMatch;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public List<NodeConnectorId> getSinkNodeConnector() {
            return _sinkNodeConnector;
        }
        
        @Override
        public List<NodeConnectorId> getSrcNodeConnector() {
            return _srcNodeConnector;
        }
        
        @Override
        public TrafficType getTrafficMatch() {
            return _trafficMatch;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddressMatch);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_macAddressMatch);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_sinkNodeConnector);
            result = prime * result + Objects.hashCode(_srcNodeConnector);
            result = prime * result + Objects.hashCode(_trafficMatch);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap other = (org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddressMatch, other.getIpAddressMatch())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macAddressMatch, other.getMacAddressMatch())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_sinkNodeConnector, other.getSinkNodeConnector())) {
                return false;
            }
            if (!Objects.equals(_srcNodeConnector, other.getSrcNodeConnector())) {
                return false;
            }
            if (!Objects.equals(_trafficMatch, other.getTrafficMatch())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TapImpl otherImpl = (TapImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.tap.spec.Tap>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Tap [");
            boolean first = true;
        
            if (_id != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_id=");
                builder.append(_id);
             }
            if (_ipAddressMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_ipAddressMatch=");
                builder.append(_ipAddressMatch);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_macAddressMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_macAddressMatch=");
                builder.append(_macAddressMatch);
             }
            if (_node != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_node=");
                builder.append(_node);
             }
            if (_sinkNodeConnector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_sinkNodeConnector=");
                builder.append(_sinkNodeConnector);
             }
            if (_srcNodeConnector != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_srcNodeConnector=");
                builder.append(_srcNodeConnector);
             }
            if (_trafficMatch != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_trafficMatch=");
                builder.append(_trafficMatch);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}

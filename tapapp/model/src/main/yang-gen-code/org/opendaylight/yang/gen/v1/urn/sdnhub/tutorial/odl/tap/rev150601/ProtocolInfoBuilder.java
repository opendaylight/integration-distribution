package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo
 *
 */
public class ProtocolInfoBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo> {

    private java.lang.Integer _dlType;
    private java.lang.Short _nwProto;
    private java.lang.Integer _tpDst;
    private java.lang.Integer _tpSrc;


    public ProtocolInfoBuilder() {
    }

    public ProtocolInfoBuilder(ProtocolInfo base) {
        this._dlType = base.getDlType();
        this._nwProto = base.getNwProto();
        this._tpDst = base.getTpDst();
        this._tpSrc = base.getTpSrc();
    }


    public java.lang.Integer getDlType() {
        return _dlType;
    }
    
    public java.lang.Short getNwProto() {
        return _nwProto;
    }
    
    public java.lang.Integer getTpDst() {
        return _tpDst;
    }
    
    public java.lang.Integer getTpSrc() {
        return _tpSrc;
    }

     
     private static void checkDlTypeRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public ProtocolInfoBuilder setDlType(final java.lang.Integer value) {
    if (value != null) {
        checkDlTypeRange(value);
    }
        this._dlType = value;
        return this;
    }
    
     
     private static void checkNwProtoRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public ProtocolInfoBuilder setNwProto(final java.lang.Short value) {
    if (value != null) {
        checkNwProtoRange(value);
    }
        this._nwProto = value;
        return this;
    }
    
     
     private static void checkTpDstRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public ProtocolInfoBuilder setTpDst(final java.lang.Integer value) {
    if (value != null) {
        checkTpDstRange(value);
    }
        this._tpDst = value;
        return this;
    }
    
     
     private static void checkTpSrcRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public ProtocolInfoBuilder setTpSrc(final java.lang.Integer value) {
    if (value != null) {
        checkTpSrcRange(value);
    }
        this._tpSrc = value;
        return this;
    }

    public ProtocolInfo build() {
        return new ProtocolInfoImpl(this);
    }

    private static final class ProtocolInfoImpl implements ProtocolInfo {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo.class;
        }

        private final java.lang.Integer _dlType;
        private final java.lang.Short _nwProto;
        private final java.lang.Integer _tpDst;
        private final java.lang.Integer _tpSrc;


        private ProtocolInfoImpl(ProtocolInfoBuilder base) {
            this._dlType = base.getDlType();
            this._nwProto = base.getNwProto();
            this._tpDst = base.getTpDst();
            this._tpSrc = base.getTpSrc();
        }

        @Override
        public java.lang.Integer getDlType() {
            return _dlType;
        }
        
        @Override
        public java.lang.Short getNwProto() {
            return _nwProto;
        }
        
        @Override
        public java.lang.Integer getTpDst() {
            return _tpDst;
        }
        
        @Override
        public java.lang.Integer getTpSrc() {
            return _tpSrc;
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
            result = prime * result + Objects.hashCode(_dlType);
            result = prime * result + Objects.hashCode(_nwProto);
            result = prime * result + Objects.hashCode(_tpDst);
            result = prime * result + Objects.hashCode(_tpSrc);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo other = (org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601.ProtocolInfo)obj;
            if (!Objects.equals(_dlType, other.getDlType())) {
                return false;
            }
            if (!Objects.equals(_nwProto, other.getNwProto())) {
                return false;
            }
            if (!Objects.equals(_tpDst, other.getTpDst())) {
                return false;
            }
            if (!Objects.equals(_tpSrc, other.getTpSrc())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ProtocolInfo [");
            boolean first = true;
        
            if (_dlType != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dlType=");
                builder.append(_dlType);
             }
            if (_nwProto != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_nwProto=");
                builder.append(_nwProto);
             }
            if (_tpDst != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tpDst=");
                builder.append(_tpDst);
             }
            if (_tpSrc != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_tpSrc=");
                builder.append(_tpSrc);
             }
            return builder.append(']').toString();
        }
    }

}

package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;


public enum TrafficType {
    ARP(0),
    
    DNS(1),
    
    HTTP(2),
    
    HTTPS(3),
    
    TCP(4),
    
    UDP(5),
    
    DHCP(6),
    
    ICMP(7)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, TrafficType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TrafficType> b = com.google.common.collect.ImmutableMap.builder();
        for (TrafficType enumItem : TrafficType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private TrafficType(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding TrafficType item
     */
    public static TrafficType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}

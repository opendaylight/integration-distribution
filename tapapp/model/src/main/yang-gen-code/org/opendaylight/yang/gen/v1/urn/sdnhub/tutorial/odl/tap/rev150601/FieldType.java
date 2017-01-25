package org.opendaylight.yang.gen.v1.urn.sdnhub.tutorial.odl.tap.rev150601;


public enum FieldType {
    Source(0),
    
    Destination(1),
    
    Both(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, FieldType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, FieldType> b = com.google.common.collect.ImmutableMap.builder();
        for (FieldType enumItem : FieldType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private FieldType(int value) {
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
     * @return corresponding FieldType item
     */
    public static FieldType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}

package devices.livingRoom;

import devices.TV;

public class LivingRoomTV extends TV {
    protected String source;
    String name;
    public LivingRoomTV(String name) {
        super("LivingRoomTV");
        this.name = name;
    }
    public void setSource(String source) {
        this.source = source;
        System.out.printf("Setting Source of '%s' to '%s'.\n", name, source);
    }
}

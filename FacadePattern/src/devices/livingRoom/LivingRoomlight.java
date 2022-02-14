package devices.livingRoom;

import devices.Light;

public class LivingRoomlight extends Light {
    protected int brightness = 50;
    String name;
    public LivingRoomlight(String name) {
        super("LivingRoomLight");
        this.name = name;
    }

    public void dim() {
        brightness = 20;
        System.out.printf("Dimming '%s'.\n", name);
    }

    public void bright() {
        brightness = 100;
        System.out.printf("Setting brightness of '%s' to '%d'.\n", name, brightness);
    }

}

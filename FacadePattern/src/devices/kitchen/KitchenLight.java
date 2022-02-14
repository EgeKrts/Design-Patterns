package devices.kitchen;

import devices.Light;

public class KitchenLight extends Light {
    protected int brightness = 40;
    String name;
    public KitchenLight(String name) {
        super("KitchenLight");
        this.name = name;
    }
    public void dim() {
        brightness = 20;
        System.out.printf("Dimming '%s'.\n", name);
    }
    public void bright() {
        brightness = 80;
        System.out.printf("Setting brightness of '%s' to '%d'.\n", name, brightness);
    }
}

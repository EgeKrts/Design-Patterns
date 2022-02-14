package devices.kitchen;

public class Microwave {
    String name;
    protected int temp;
    protected int time;
    protected boolean grillOn = false;

    public Microwave(String name) {
        this.name = name;
    }

    public void on(){
        System.out.printf("Turning on  '%s'.\n", name);
    }
    public void grillOn() {
        this.grillOn = true;
        System.out.printf("Turning on grill of '%s'.\n", name);
    }

    public void grillOff() {
        this.grillOn = false;
        System.out.printf("Turning off grill of '%s'.\n", name);
    }

    public void setOnHeat(int temp, int time) {
        this.temp = temp;
        this.time = time;
        System.out.printf("Setting '%s' on Pre-Heat, temprature '%d', time '%d' minutes.\n", name, temp, time);
    }

    public void bake(String pizzaName, int temp, int time) {
        this.temp = temp;
        this.time = time;
        System.out.printf("Baking '%s' in '%s' for temprature '%d', time '%d' minutes.\n", pizzaName, name, temp, time);
    }
}

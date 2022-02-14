package devices;

public abstract class TV {
    String name;
    public TV(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(name + " on");
    }

    public void off() {
        System.out.println(name + " off");
    }
}

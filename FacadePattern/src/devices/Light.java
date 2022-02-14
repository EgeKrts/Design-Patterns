package devices;

public abstract class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " on");
    }
    public abstract void dim();
    public abstract void bright();
}

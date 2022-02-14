package devices.kitchen;

public class CoffeeMaker {
    String name;

    public CoffeeMaker(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name +" on");
    }

    public void off() {
        System.out.println(name +" off");
    }
}

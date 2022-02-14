package devices.kitchen;

public class ElectricGrill {
    protected int temp;
    String name;
    public ElectricGrill(String name) {
        this.name = name;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.printf("Setting '%s' temprature to '%d'.\n", name, temp);
    }

    public int temperature() {
        return temp;
    }

    public void on() {
        System.out.println(name + " on");
    }
    public void off(){
        System.out.println(name + " off");
    }
}

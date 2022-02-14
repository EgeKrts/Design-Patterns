package devices;

public abstract class Fan {
    String description;
    public static int TOP_SPEED = 4;
    protected int currentSpeed = 1;


    public Fan(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description +" on");
    }

    public void increase() {
        if (currentSpeed < TOP_SPEED) {
            currentSpeed++;
            System.out.printf("Increasing Speed of '%s' to '%d'.\n", description, currentSpeed);
        } else {
            System.out.printf("'%s' is already running at top speed!\n", description);
        }
    }

    public void off() {
        System.out.println(description +" off");
    }
}

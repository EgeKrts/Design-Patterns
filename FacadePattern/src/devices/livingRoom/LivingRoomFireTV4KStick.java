package devices.livingRoom;

import devices.TV;

public class LivingRoomFireTV4KStick extends TV{
    String name;
    protected String appName;
    protected String contentName;

    public LivingRoomFireTV4KStick(String name) {
        super("LivingRoomFireTV4KStick");
        this.name = name;
    }

    public void openApp(String appName) {
        this.appName = appName;
        System.out.printf("Opening '%s' on '%s'.\n", appName, name);
    }

    public void selectContent(String contentName) {
        this.contentName = contentName;
        System.out.printf("Searching '%s' on '%s'.\n", contentName, appName);
    }

    public void play() {
        System.out.printf("Playing '%s' on '%s'.\n", contentName, appName);
    }

    public void closeApp() {
        System.out.printf("Closing '%s' on '%s'.\n", appName, name);
    }

    public String appName() {
        return appName;
    }

    public String contentName() {
        return contentName;
    }
    public String name(){
        return name;
    }
}

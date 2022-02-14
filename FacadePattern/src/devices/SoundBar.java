package devices;

public class SoundBar {
    String name;

    int topVol = 30;
    int lowVol = 0;
    String mode;
    int curVol = 1;

    public SoundBar(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " on");
    }

    public void setSoundMode(String mode) {
        this.mode = mode;
        System.out.printf("Setting Sound-Mode of '%s' to '%s'.\n", name, mode);
    }

    public void volume(int vol) {
        if (vol >= lowVol && vol <= topVol) {
            curVol = vol;
            System.out.printf("Setting volume of '%s' to '%d'.\n", name, curVol);
        } else {
            System.out.printf("Volume of '%s' is supports range between '%d' and '%d'!\n", name, lowVol, topVol);
        }
    }

    public void off() {
        System.out.println(name + " off");
    }
    public String soundMode() {
        return mode;
    }
}

package devices.livingRoom;

import devices.SoundBar;
import devices.TV;

public class LivingRoomSoundBar extends SoundBar {

    protected TV tv;

    public LivingRoomSoundBar(TV tv) {
        super("LivingRoomSoundBar");
        this.tv = tv;
    }

    public TV tv() {
        return tv;
    }
}

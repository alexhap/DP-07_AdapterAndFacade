/**
 * Created by alex on 25.06.2015.
 *
 */

public class Amplifier {
    public void on() {
        System.out.println("Sound Amplifier turned on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Sound Amplifier input switched to DVD Player output channel");
    }

    public void serSurroundSound() {
        System.out.println("Sound Amplifier switched to Surround mode");
    }

    public void setVolume(int i) {
        System.out.println("Sound Amplifier volume set to level " + i);
    }

    public void off() {
        System.out.println("Sound Amplifier turned off");
    }
}

/**
 * Created by alex on 25.06.2015.
 *
 */

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player turned on");
    }

    public void play(String movieName) {
        System.out.println("DVD player starts playing '" + movieName + "'");
    }

    public void stop() {
        System.out.println("DVD player stops playing");
    }

    public void eject() {
        System.out.println("DVD player disk ejected");
    }

    public void off() {
        System.out.println("DVD Player turned off");
    }
}

/**
 * Created by alex on 25.06.2015.
 *
 */

public class TheaterLights {

    private int level = 0;

    public void dim(int i) {
        level = i;
        status();
    }

    private void status() {
        System.out.println("Lights level set to " + level + "%");
    }

    public void on() {
        dim(100);
    }
}

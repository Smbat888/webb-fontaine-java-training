package week4;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Singltone {
    private static Singltone singltone;

    private Singltone() {

    }

    public static Singltone getInstance() {
        if (singltone == null) {
            singltone = new Singltone();
        }
        return singltone;
    }
}

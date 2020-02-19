package reflection;

public class MySingltone {

    private static MySingltone instance;

    private MySingltone() {

    }

    public static MySingltone getInstance() {
        if (instance == null) {
            instance = new MySingltone();
        }
        return instance;
    }
}
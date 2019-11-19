package Execises;

public class MySingleTon {
    private static MySingleTon instance;

    private MySingleTon() {
    }

    public static MySingleTon getInstance() {
        if (instance == null) {
            instance = new MySingleTon();
        }
        return instance;

    }

}

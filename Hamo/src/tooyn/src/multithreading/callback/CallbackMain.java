package tooyn.src.multithreading.callback;

public class CallbackMain {

    public static void main(String[] args) {
        new CallbackWithThread(() -> {
            System.out.println("finish !!! ");
        }).start();
    }
}

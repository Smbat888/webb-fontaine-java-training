package multithreading.multithreading.examples;

public class MyCallbackThread implements Runnable {

    private MyCallback callback;

    public MyCallbackThread(MyCallback callback) {
        this.callback = callback;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10000; ++i) {
            System.out.println("i ================= " + i);
            if (callback != null && i == 5000) {
                callback.onResponse("response passed");
            }
        }
        if (callback != null) {
            callback.onFinish("filepat");
        }
    }
}

interface MyCallback {
    void onResponse(String response);
    void onFinish(String filepath);
}

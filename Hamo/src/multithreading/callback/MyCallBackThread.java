package multithreading.callback;

/**
 * Created by: Hmayak Atayan on 25 January, 2020
 */
public class MyCallBackThread implements Runnable {

    private CallBack callback;

    public MyCallBackThread(CallBack callback) {
        this.callback = callback;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("===========================" + i);
            if (callback != null && i == 5000) {
                callback.onResponse("response passed");
            }
        }
        if (callback != null) {
            callback.onFinish();
        }
    }
}


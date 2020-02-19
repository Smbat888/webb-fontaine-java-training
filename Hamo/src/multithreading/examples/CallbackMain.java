package multithreading.examples;

import java.util.List;

public class CallbackMain implements MyCallback {

    private String filePath;

    public static void main(String[] args) {

        System.out.println(" starting ");

        CallbackMain main = new CallbackMain();
        main.process();

    }

    private void process() {
        MyCallbackThread myCallbackThread = new MyCallbackThread(this);
        new Thread(myCallbackThread).start();
    }

    @Override
    public void onResponse(List<User> response) {
        System.out.println("response = " + response.toString());
    }

    @Override
    public void onFinish(String filepath) {
        this.filePath = filepath;
        System.out.println(" finished!!! ");

        // downloadFromThisFilepath();
    }
}

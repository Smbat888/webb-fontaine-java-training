package multithreading.callback;

/**
 * Created by: Hmayak Atayan on 25 January, 2020
 */
public class CallbackMain implements CallBack {
    public static void main(String[] args) {
        System.out.println("starting ");

        CallbackMain main = new CallbackMain();
        main.process();

    }

    private void process() {
        MyCallBackThread myCallBackThread = new MyCallBackThread(this);
        new Thread(myCallBackThread).start();
    }


    @Override
    public void onResponse(String response) {
        System.out.println("response = " + response);
    }

    @Override
    public void onFinish() {
        System.out.println(" finished ");
    }
}

package multithreading.callback;

interface Callback {
    void callback(); // would be in any signature
}

class CallbackWithThread extends Thread {

    private Callback c;

    public CallbackWithThread(Callback c) {
        this.c = c;
    }

    @Override
    public void run() {
        // some work
        this.c.callback(); // callback
    }
}

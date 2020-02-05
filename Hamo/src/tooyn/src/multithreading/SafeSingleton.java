package tooyn.src.multithreading;

public class SafeSingleton {

    private static volatile SafeSingleton instance;
    private static final Object mutex = new Object();

    private SafeSingleton() {
    }

    public static SafeSingleton getInstance() {
        SafeSingleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new SafeSingleton();
            }
        }
        return result;
    }

    public void dox() {

    }

}

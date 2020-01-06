package ClassWork.OOP.callbacks;

public class Helper {

    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void goThrough(String[] items) {
        for (int i = 0; i < items.length; ++i) {
            System.out.println("items[i] = " + items[i]);
            if (items[i] == null) {
                callback.onNullItem(items[i]);
            } else if (items[i].isEmpty()) {
                callback.onIsEmpty(i);
            }
        }
        callback.onComplete();
    }

    public void xx(C c) {

    }
}

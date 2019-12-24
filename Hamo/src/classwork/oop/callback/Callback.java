package classwork.oop.callback;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public interface Callback {
    void onComplete();
    void onNullItem(String item);
    void onIsEmpty(int position);
}

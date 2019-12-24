package classwork.oop.bzbzal;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public interface Call {
    void onComplete();
    void onNullItem(String item);
    void onIsEmpty(int position);
}

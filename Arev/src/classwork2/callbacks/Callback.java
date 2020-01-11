package classwork2.callbacks;

public interface Callback {
    void onComplete();
    void onNullItem(String item);
    void onIsEmpty(int position);

}

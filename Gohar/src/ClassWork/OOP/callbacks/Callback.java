package ClassWork.OOP.callbacks;

public interface Callback {
    void onComplete();
    void onNullItem(String item);
    void onIsEmpty(int position);
}

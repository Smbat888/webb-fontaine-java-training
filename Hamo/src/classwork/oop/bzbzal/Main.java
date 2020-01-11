package classwork.oop.bzbzal;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Main implements Call {
    public static void main(String[] args) {

     Main main = new Main();
     main.helperCall();
    }

    public void helperCall() {
        CallHelper callHelper = new CallHelper();
        callHelper.setCall(this);
        String[] items = {"Hamo", "Gohar", "", null, "Smbat", "Arshak", null};
        callHelper.goThrough(items);
    }

    @Override
    public void onComplete() {
        System.out.println("on Complete method");
    }

    @Override
    public void onNullItem(String item) {
        System.out.println("item = " + item);
    }

    @Override
    public void onIsEmpty(int position) {
        System.out.println("item is emptry in: " + position + " position");
    }
}

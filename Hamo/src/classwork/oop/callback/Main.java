package classwork.oop.callback;

/**
 * Created by: Hmayak Atayan on 30 November, 2019
 */
public class Main implements Callback {
    public static void main(String[] args) {

        Main main = new Main();
        main.helperCall();

    }

    public void helperCall() {
        Helper helper = new Helper();
        helper.setCallback(this);
        String[] items = {"Hamo", "Gohar", "", null, "Smbat", "Arshak", null};
        helper.goThrough(items);
    }

    @Override
    public void onComplete() {
        System.out.println("on Complete");
    }

    @Override
    public void onNullItem(String item) {
        System.out.println("it is a Null item");
    }

    @Override
    public void onIsEmpty(int position) {
        System.out.println("it's an empty postion" + position + "position");
    }
}

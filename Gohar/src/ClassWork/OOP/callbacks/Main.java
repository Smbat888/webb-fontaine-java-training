package ClassWork.OOP.callbacks;

public class Main implements Callback {

    public static void main(String[] args) {
        Main main = new Main();
        main.helperCall();
    }

    public void helperCall() {
        Helper helper = new Helper();
        Callback b = new B();

        helper.setCallback(this);
        String[] items = {"Smbat", "Arshak", "", "Samvel", "", null, "Hamo", null, ""};
        helper.goThrough(items);

    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onNullItem(String item) {

    }

    @Override
    public void onIsEmpty(int position) {

    }
}

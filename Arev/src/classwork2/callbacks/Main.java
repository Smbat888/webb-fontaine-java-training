package classwork2.callbacks;

public class Main implements Callback {
    public static void main(String[] args) {
        Main main = new Main();
        main.helperCall();

    }
    public void helperCall(){
        Helper helper = new Helper();
        helper.setCallback(this);
        String [] items = {"Smbat","Arshak",null,"Samvel","Hamo","Gohar",null,"Vane","","Agnesa","Arev",""};
        helper.goThrough(items);

    }

    @Override
    public void onComplete() {
        System.out.println("OnComplete");
    }

    @Override
    public void onNullItem(String item) {
        System.out.println("it is a Null item");
    }

    @Override
    public void onIsEmpty(int position) {
        System.out.println("it is an empty item in the " + position + " position");

    }
}

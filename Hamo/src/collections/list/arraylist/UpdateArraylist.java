package collections.list.arraylist;

import java.util.ArrayList;

public class UpdateArraylist {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(updateElement(strings));

    }

    public static ArrayList<String> updateElement(ArrayList<String> arrayList) {
        arrayList.set(0, "Hamo");
        return arrayList;
    }
}

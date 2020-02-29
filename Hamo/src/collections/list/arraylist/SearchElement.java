package collections.list.arraylist;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(strings.contains("c"));
    }
}

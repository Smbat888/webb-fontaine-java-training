package collections.set.hashset;

import java.util.HashSet;

public class RemoveAllElements {
    public static void main(String[] args) {


        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("e");
        hashSet1.add("h");
        hashSet1.add("j");
        hashSet1.add("g");
        hashSet1.add("e2");

        hashSet1.removeAll(hashSet1);
        System.out.println(hashSet1);
    }
}

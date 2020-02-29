package collections.set.hashset;

import java.util.HashSet;

public class RetainAllElements {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("7");
        hashSet.add("e");

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("e");
        hashSet1.add("h");
        hashSet1.add("j");
        hashSet1.add("g");
        hashSet1.add("e2");

        HashSet<String> retainAll = new HashSet<>();
        hashSet.retainAll(hashSet1);

        System.out.println(hashSet);
    }
}

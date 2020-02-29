package collections.set.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();


        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");

        treeSet.addAll(hashSet);

        System.out.println(treeSet);
    }
}

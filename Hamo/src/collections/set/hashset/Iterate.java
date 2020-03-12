package collections.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(3);

        System.out.println(hashSet);

        for (Integer i : hashSet) {
            System.out.println("i = " + i);
        }

        HashSet<String> fruitsStore = new HashSet<String>();

//        for(String fruit: Arrays.asList("mango", "apple", "banana")){
//            fruitsStore.add(fruit);
//        }

        fruitsStore.add("mango");
        fruitsStore.add("banana");
        fruitsStore.add("apple");
        fruitsStore.add("yellow");
        fruitsStore.add("ananas");

        System.out.println("Ordering in HashSet :" + fruitsStore);

//        Iterator<Integer> iterator = hashSet.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
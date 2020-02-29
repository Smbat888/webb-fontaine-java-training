package collections.list.arraylist;

import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            numbers.add(i);
        }

        ArrayList <Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            otherNumbers.add(i);
        }

        System.out.println(numbers.equals(otherNumbers));
    }
}

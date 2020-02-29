package collections.list.arraylist;


import java.util.ArrayList;

public class SampleArrayList {

    public static ArrayList<Integer> numbers = new ArrayList<Integer>(10);

    /*todo remember
     * can get size of the arraylist but not capacity
     * int oldDefaultCapacity = 10;
     * int newCapacity = (oldDefaultCapacity * 3) / 2 + 1;
     *  default loadFactor = 0.75; and load factor can reSet as parameter
     */
    public static void main(String[] args) {
//        System.out.println(numbers.size());
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(0, 4); //adding an element in the middle push the other to the right
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(3));
        System.out.println(numbers.size());

    }
}

package collections.list.arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        Collections.swap(list, 1, 2);

        System.out.println(list);
    }  }



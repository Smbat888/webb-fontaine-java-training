package week2.homework;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Marathon {
    static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    static int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
            317, 265};

    public static void main(String[] args) {
        bubbleSort(times,names);
        System.out.println("First place  is: " + names[0] + " in " + times[0] + " seconds");
        System.out.println("Second place  is: " + names[1] + " in " + times[1] + " seconds");

    }


    public static void bubbleSort(int [] times,String [] names ) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < times.length - 1; j++) {
                if (times[j] > times[j + 1]) {
                    temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}


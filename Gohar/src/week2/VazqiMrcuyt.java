package week2;

import java.util.Scanner;

/**
 * Created by Gohar Farmanyan on October
 */
public class VazqiMrcuyt {
    static Scanner scanner = new Scanner(System.in);
    static String nametemp;

    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int temp, size;

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};
        size = times.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (times[i] > times[j]) {
                    temp = times[i];
                    times[i] = times[j];
                    times[j] = temp;
                    nametemp = names[i];
                    names[i] = names[j];
                    names[j] = nametemp;
                }
            }
        }
        System.out.println(times[0]);
        System.out.println(names[0]);

    }
}

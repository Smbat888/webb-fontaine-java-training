package Java.Week1;


import java.sql.SQLOutput;

public class Faster {
    public static void main(String[] args) {
        String[]names={"A", "B", "C"};


        int[] times = {3,5,8};
        int min = times [0];
        int index = 0;

        for (int i=0; i<times.length; i++) {
            min = Math.min(min, times[i]);
        }
        for (int j=1; j<times.length; j++) {
            if (times[j]== min) {
                index = j;

            }


        }
        System.out.println(names[index]);
    }
}

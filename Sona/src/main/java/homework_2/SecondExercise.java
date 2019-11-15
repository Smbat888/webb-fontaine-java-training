package main.java.homework_2;

public class SecondExercise {

    public static void main(String args[]) {

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};

        int theFastest = times[0];
        int theFastestItemId = 0;
        int theSecondFastest = 0;
        int theSecondFastestItemId = 0;
        for (int i = 1; i < times.length; i++) {
            if (theFastest >= times[i]) {
                theSecondFastest = theFastest;
                theSecondFastestItemId = theFastestItemId;
                theFastest = times[i];
                theFastestItemId = i;

            }
        }
        System.out.println("The fastest score is " + theFastest);
        System.out.println("The fastest person's name is " + names[theFastestItemId]);
        System.out.println("The fastest score is " + theSecondFastest);
        System.out.println("The fastest person's name is " + names[theSecondFastestItemId]);
    }

}
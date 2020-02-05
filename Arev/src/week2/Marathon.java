package week2;

public class Marathon {
    static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    static int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
            317, 265};

    public static void main(String[] args) {
        int minTime = times[0];
        int secondMinTime = 0;
        int minTimeIndex = 0;
        int secondMinTimeIndex = 0;
        for (int i = 1; i < times.length - 1; i++) {
            if (minTime >= times[i]) {
                secondMinTime = minTime;
                secondMinTimeIndex = minTimeIndex;
                minTime = times[i];
                minTimeIndex = i;
            }
        }
        System.out.println("The fastest men is =  " + names[minTimeIndex] + " min time is = " + minTime);
        System.out.println("The secondfastest men is =  " + names[secondMinTimeIndex] + " second min time is = " + secondMinTime);


    }

}

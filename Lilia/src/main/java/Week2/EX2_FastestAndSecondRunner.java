package Week2;

public class EX2_FastestAndSecondRunner {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};
        int fastest = times[0];
        int fastestIndex = 0;
        int second = times[0];
        int secondIndex = 0;
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastest) {
                second = fastest;
                fastest = times[i];
                fastestIndex = i;
            }
            else if (times[i] > fastest) {
                second = times[i];
                secondIndex = i;
            }
        }
        String firstPlace = names[fastestIndex];
        String secondPlace = names[secondIndex];
        System.out.println("The winner is:" + firstPlace + " and the second place winner is:" + secondPlace);
    }
}

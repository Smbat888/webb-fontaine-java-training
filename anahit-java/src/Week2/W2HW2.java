package Week2;

public class W2HW2 {
    public static void main(String[] args) {

        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = new int[] {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};

        int max = times[0];
        int maxindex=0;
        int secondmax=times[0];
        int secondmaxindex=0;
        for (int i = 0; i < times.length; i++) {

            if (times[i] > max) {
                secondmax=max;
                max=times[i];
                maxindex=i;
            } else if (times[i] > secondmax) {
                secondmax=times[i];
                secondmaxindex=i;

            }

        }
        String firstplace= names[maxindex];
        String secondplace=names[secondmaxindex];
        System.out.println(  firstplace +"" + " "+  secondplace);
    }
}

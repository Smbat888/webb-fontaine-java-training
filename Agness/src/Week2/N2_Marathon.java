package Week2;
public class N2_Marathon {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265};
        int biggest = 0;
        int j=0;
        int index = 0;
        for (int i=0; i <= times.length-1; i++) {
            if (times[i] > biggest) {
                biggest = times[i];
                index = j;
            }
            j++;
        }
        String result = String.format("%s %s %d", "The fastest is:", names[index], biggest);
        System.out.println(result);

        int bigger = 0;
        int index2 = 0;
        int k = 0;

        for (int i=0; i<= times.length-1; i++) {
            if (times[i] > bigger && times[i] < biggest) {
                bigger = times[i];
                index2 = k;
            }
            j++;
        }
        String results = String.format("%s %s %d", "The second place is:", names[index2], bigger);
        System.out.println(results);
    }
}

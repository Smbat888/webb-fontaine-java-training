package week1.experiments;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class NestedLoop {
    public static void main(String[] args) {

        experiment();
    }

    public static void experiment() {
        int innerloop;
        int outerloop;
        for (outerloop = 1; outerloop <= 8; ++outerloop) {
            for (innerloop = 1; innerloop < outerloop; innerloop++) {
                System.out.print(innerloop);
            }
            System.out.println();
        }
        for (outerloop = 6; outerloop >= 0; outerloop--) {
            for (innerloop = 1; innerloop <= outerloop; innerloop++) {
                System.out.print(innerloop);
            }
            System.out.println();

        }
    }
}

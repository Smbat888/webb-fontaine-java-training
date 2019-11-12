package week1.experiments;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class BackTriangle {
    public static void main(String[] args) {
//        tpimetod();
    tpiTarsErankyuni();
    }

    public static void tpimetod() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void tpiTarsErankyuni(){
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

package conditions1.lessonone;

/**
 * Created by: Hmayak on Sep, 2019
 */
public class Test {
   static int sum = 0;

    public static void main(String[] args) {
        sum();
    }

    public static boolean isParz(int a) {
        boolean isNumberPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isNumberPrime = false;
            }
        }
        return isNumberPrime;
    }

    public static void sum() {
        for (int i = 2; i < 100; i++) {
            if (isParz(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}


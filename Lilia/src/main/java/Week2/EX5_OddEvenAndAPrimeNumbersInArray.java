package Week2;

public class EX5_OddEvenAndAPrimeNumbersInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];
        int[] prime = new int[10];
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                prime[z] = array[i];
                z++;
            }
            if (isEven(array[i])) {
                even[x] = array[i];
                x++;
            } else {
                odd[y] = array[i];
                y++;
            }
        }

        System.out.print("Even Numbers:");
        print(even);
        System.out.println();
        System.out.print("Odd Numbers:");
        print(odd);
        System.out.println();
        System.out.print("Prime Numbers");
        print(prime);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ] ");
        }
    }
}

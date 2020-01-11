package classwork.exceptions;

import java.util.Scanner;

/**
 * Created by: Hmayak Atayan on 16 December, 2019
 */
public class Try {
    static Scanner scanner = new Scanner(System.in);
    static String b;
    static int[] arr = {1, 2, 3, 4, 5};
    private static Object NullObjectException;


    public static void main(String[] args) {


        arrayException(arr);

        arithmeticException();

        multipleCatch(arr);

    //    catchException(arr);

     //   withInputs(10);

        System.out.println("---------------------------");

     //   ownException();

        System.out.println(".................");

        protocolCheck("test");
    }

    public static void arrayException(int[] array) {
        try {
            System.out.println(array[array.length]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("throw index out of bounds ");
        } finally {
            System.out.println("in finally block");
        }
    }

    private static void arithmeticException() {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("throw arithmetic exception");
        }
    }

    public static void multipleCatch(int[] array) {
        try {
            System.out.println(array[array.length - 1] / 0);
        } catch (ArithmeticException ex) {
            System.out.println("in ArithmeticException ");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(" in ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void catchException(int[] array) {
        try {
            System.out.println(array[array.length - 1] / 0);
        } catch (Throwable ex) {
            System.out.println("in ex");
        }
    }

    public static void withInputs(int n) {
        n = scanner.nextInt();
        try {
            System.out.println(10 / n);
        } catch (ArithmeticException ex) {
            System.out.println("Thrown in case of 0");
        }
    }

    public static void ownException() {
        if (b == null) {
            throw new NullObjectException ();
        }
    }

    public static void protocolCheck(String url){
        if (url.startsWith("http")|| url.startsWith("https")){
            System.out.println("validated");
        }
        else throw new UnsupportedProtocolException("the url is not validated");
    }
}

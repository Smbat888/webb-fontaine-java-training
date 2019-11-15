package main.java.homework_3;

import java.util.Scanner;

public class SixthExercise {

    public static void main(String[] args) {
        int[] array = typing();
        int number1 = chooseNumber(array);
        increase(number1);
    }

    static int[] typing() {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter numbers");
            array[i] = scan.nextInt();
        }
        return array;
    }

    static int chooseNumber(int[] array) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter which number by count you want to increase with 10%");
        int number = scan.nextInt();
        int number1 = array[number - 1];
        return number1;
    }

    static void increase(int number1) {

        double percent = (double) number1 * 10 / 100;
        double increasedNumber = number1 + percent;

        System.out.println("The increased number is " + increasedNumber);
    }
}

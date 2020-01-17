package Java.Week2;

import java.util.Scanner;
public class NumbersToArray {
    public static void main(String[] args) {
        int arraySize = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter positive number");
        int UserInput =input.nextInt();
        int UserInputClone = UserInput;
        int mnacord = 0;
        while(UserInput != 0) {
            UserInput /= 10;
            arraySize++;
        }
        int [] newArray = new int [arraySize];
        for (int i= arraySize -1; i>=0; i--) {
            mnacord = UserInputClone % 10;
            UserInputClone = UserInputClone / 10;
            newArray[i] = mnacord;
        }
        System.out.print("New array is: ");
        for (int i=0; i<newArray.length; i++) {
            System.out.print("{" + newArray[i] + "} ");
        }
    }
}

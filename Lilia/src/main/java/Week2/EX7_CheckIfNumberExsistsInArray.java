package Week2;

import java.util.Scanner;

public class EX7_CheckIfNumberExsistsInArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int array[] = new int[10];
        boolean exist=false;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
        }
        System.out.println("Enter a number:");
        int num = input.nextInt();
        for (int i = 0; i < array.length; i++){
            if (num == array[i]){
                exist=true;
            }
        }
        if(exist){
            System.out.println("The number you entered exists in the array");
        }else
            System.out.println("The number you entered doesn't exist in the array");

    }
}
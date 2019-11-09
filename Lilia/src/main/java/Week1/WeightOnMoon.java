package Week1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class WeightOnMoon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight=");
        float weight;

        while ((weight=input.nextFloat())<=0) {
            System.out.println("Please enter a positive number");
        }
        double MoonWeight = weight * 0.17;
        System.out.println("your weight on moon is=" + MoonWeight);
    }
}

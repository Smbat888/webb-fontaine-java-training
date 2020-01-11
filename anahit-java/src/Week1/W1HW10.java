package Week1;

import java.util.Scanner;

public class W1HW10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int sum=0;

        int x = s.nextInt();
        int y = s.nextInt();

  int max = Math.max(x,y);
  int min = Math.min(x,y);
  int nuberofintegers= max-min+1;
  for(int i=min; i<=max; i++){

      sum=sum+i;
  }
        System.out.println(sum);
        System.out.println(sum/nuberofintegers);
    }
}

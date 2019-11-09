package Week2;

public class EX1_AverageOfArrayElements {
    public static void main(String[] args) {
        double sum = 0;
        double[] avrArray = new double[10];
        for (int i = 0; i < avrArray.length; i++) {
            avrArray[i] = Math.random() * 10;
            String strDouble = String.format("%.2f", avrArray[i]);
            System.out.print(strDouble + ", ");
        }
        for (int i = 0; i < avrArray.length; i++) {
            sum=sum+avrArray[i];
        }
        double average=sum/10;
        System.out.println("The average is:"+average);
    }
}


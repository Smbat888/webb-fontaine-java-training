package Week3;

public class N2_ArrX3 {
    public static void main(String[] args) {
        String[] array = {"aa", ". ", "21"};
        arrayX3(array);
    }

    public static void arrayX3(String[] array) {
        for (String i : array) {
            String x = String.format("%s%s%s",i,i,i);
            System.out.print(x);
        }
    }
}


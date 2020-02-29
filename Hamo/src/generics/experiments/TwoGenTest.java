package generics.experiments;

public class TwoGenTest {

    public static void main(String[] args) {

        TwoGen<String, Integer> twoGen = new TwoGen<>("check",41);


        System.out.println(twoGen.getOb1());
        System.out.println(twoGen.getOb2());
        System.out.println("=============");
        twoGen.showTypes();

    }
}

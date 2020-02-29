package generics.experiments;

public class GenTest {


    public static void main(String[] args) {


        Gen<Integer> gen = new Gen<>(88);

        gen.showType();

        int iob = gen.getOb();

        System.out.println("iob = " + iob);
        System.out.println("---------------------");

        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String text = strOb.getOb();
        System.out.println(text);
    }
}

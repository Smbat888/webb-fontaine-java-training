package generics.experiments;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Hamo", 27, "Atayan");
        GenOOP<Parent> genOOP = new GenOOP<>(child);
        System.out.println(genOOP.getOb1().getAge());
    }
}

public class Author {
    private String name;
    private String surname;
    private int age;

    public void setAuthor(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString(){
        return String.format("{ name: %s,surname: %s, age: %d}", name, surname,age);
    }

    public static void authorArrayToString(Author[] authors) {
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
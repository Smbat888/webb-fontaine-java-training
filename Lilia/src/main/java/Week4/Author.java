package Week4;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        Author author = (Author) o;
        if (age == author.age &&
                name.equals(author.name) &&
                surname.equals(author.surname)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("{ name: %s,surname: %s, age: %d}", name, surname, age);
    }

}
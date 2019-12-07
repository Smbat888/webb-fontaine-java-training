package Week3.Person;

public class DataRepo {
    static String[] companies = {"WFA","FB", "EGS", "VMWare", "MyLLC", "DataArt"};
    static String[] names = {"Anahit","Aida", "Anna", "Michael", "John", "Jonny"};


    public static Person[] getData() {
        Person[] persons = new Person[10];
        for (int i = 0; i < persons.length; i++) {
            Person person = new Person();
            person.name = names[(int) (Math.random() * 6)];
            person.company = companies[(int) (Math.random() * 6)];
            person.age = (int) (Math.random() * 100);
            persons[i] = person;
        }
        return persons;
    }
}

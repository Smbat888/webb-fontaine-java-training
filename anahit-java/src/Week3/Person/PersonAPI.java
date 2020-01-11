package Week3.Person;

public class PersonAPI {



    public static int getLength(Person[] persons, String company) {
        int length = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals((company))) {
                length++;
            }
        }
        return length;
    }


    public static Person[] getPersonsInCompany(Person[] persons, String company) {
        Person[] personsCompany = new Person[getLength(persons, company)];
        int i = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals(company)) {
                personsCompany[i] = person;
                i++;
            }
        }
        return personsCompany;
    }
}
package Week3.Person;

public class PersonAPI {
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

    public static int getLength(Person[] persons, String company) {
        int length = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals((company))) {
                length++;
            }
        }
        return length;
    }

    public static int getOldestLength(Person[] persons) {
        int oldest = 1;
        for (int i = 0; i < persons.length; i++) {
            if (persons != null && persons[i].age > oldest) {
                oldest = persons[i].age;
            }
        }
        int length = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age == oldest) {
                length++;
            }
        }
        return length;
    }

    public static Person[] getOldestPerson(Person[] persons) {
        Person[] oldestPersons = new Person[getOldestLength(persons)];
        int oldest = 1;
        for (int i = 0; i < persons.length; i++) {
            if (persons != null && persons[i].age > oldest) {
                oldest = persons[i].age;
            }
        }
        int index = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age == oldest) {
                oldestPersons[index] = persons[i];
                index++;
            }
        }
        return oldestPersons;
    }

    public static int getYoungestLength(Person[] persons) {
        int youngest = 10;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
            }
        }
        int length = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age == youngest) {
                length++;
            }
        }
        return length;
    }

    public static Person[] getYoungestPersons(Person[] persons) {
        Person[] youngestPersons = new Person[getYoungestLength(persons)];
        int youngest = 10;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
            }
        }
        int index = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age == youngest) {
                youngestPersons[index] = persons[i];
                index++;
            }
        }
        return youngestPersons;
    }

    public static int getTheMaxRepeatedAge(Person[] persons) {
        int counter = 1, tempCounter;
        int max = persons[0].age;
        int temp;
        for (int i = 0; i < (persons.length - 1); i++) {
            temp = persons[i].age;
            tempCounter = 0;
            for (Person person : persons) {
                if (temp == person.age) {
                    tempCounter++;
                }
                if (tempCounter > counter) {
                    max = temp;
                    counter = tempCounter;
                }
            }
        }
        return max;
    }

    public static Person[] getAscendingSortedByAge(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].age > persons[j].age) {
                    persons[i].age = persons[i].age - persons[j].age;
                    persons[j].age = persons[i].age + persons[j].age;
                    persons[i].age = persons[j].age - persons[i].age;
                }
            }
        }
        return persons;
    }

    public static Person[] getDescendingSortedByAge(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].age < persons[j].age) {
                    persons[i].age = persons[i].age - persons[j].age;
                    persons[j].age = persons[i].age + persons[j].age;
                    persons[i].age = persons[j].age - persons[i].age;
                }
            }
        }
        return persons;
    }

    public static Person[] getSortedByNames(Person[] persons) {
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].name.compareTo(persons[j].name) > 0) {
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        return persons;
    }

    public static Person[] getSortedByCompanies(Person[] persons) {
        Person temp;
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].company.compareTo(persons[j].company) > 0) {
                    temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
        return persons;
    }

    public static Person getTheMostRepeatedPerson(Person[] persons) {
        Person temp=new Person();
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].company.equals(persons[j].company) && persons[i].name.equals(persons[j].name) && persons[i].age == persons[j].age) {
                    temp = persons[i];
                }
            }
        }
        return temp;
    }
}
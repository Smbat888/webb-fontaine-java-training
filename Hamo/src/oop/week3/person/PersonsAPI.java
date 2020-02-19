package oop.week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 * <p>
 * Ունենք Person class որն ունի անուն, աշխատավայր եւ տարիք։
 * Գրել ֆունկցիա, որը տրված մարդկանց զանգվածից կառանեձնեցնի
 * - այն մարդկանց ովքեր աշխատում են պարամետրով փոխանցված աշխատավայրում +
 * - ամենատարեց եւ ամենաերիտասարդ մարդուն +
 * - բոլոր մարդկանց տարիքներից կվերադարձնի ամենաշատ կրկնվող տարիքը +
 * - կսորտավորի մարդկանց. ըստ տարիքի +
 * - կսորտավորի մարդկանց. ըստ անունի - +
 * - կսորտավորի մարդկանց. ըստ աշխատատեղի - +
 * - կվերադարձնի կրկնվող մարդուն կամ մարդկանց (այսինքն, ընդունենք, որ  կարա նույն մարդը կարա կրկնվի զանգվածում) use compare() method -
 */
public class PersonsAPI {

    public static Person[] getPersonsInCompany(Person[] persons, String company) {
        Person[] companyPersons = new Person[getLength(persons, company)];

        int i = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals(company)) {
                companyPersons[i] = person;
                i++;
            }
        }

        return companyPersons;
    }

    public static int getLength(Person[] persons, String value) {
        int length = 0;
        for (Person person : persons) {
            if (person != null && person.company.equals(value)) {
                length++;
            }
        }
        return length;
    }

    public static Person getOldestPerson(Person[] persons) {
        int oldest = 1;
        int oldestIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age > oldest) {
                oldest = persons[i].age;
                oldestIndex = i;
            }
        }
        return persons[oldestIndex];
    }

    public static Person getYoungestPerson(Person[] persons) {
        int youngest = 25;
        int youngestIndex = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].age < youngest) {
                youngest = persons[i].age;
                youngestIndex = i;
            }
        }
        return persons[youngestIndex];
    }

    public static int getMostRepeatedAge(Person[] persons) {
        int maxAge = persons[0].age;
        for (Person person : persons) {
            if (maxAge < person.age) {
                maxAge = person.age;
            }
        }

        int[] ages = new int[maxAge + 1];
        for (int i = 0; i < persons.length; i++) {
            ages[persons[i].age] += 1;
        }
        int mostRepeatedAge = 0;
        for (int i = 0; i < maxAge; i++) {
            if (ages[mostRepeatedAge] < ages[i]) {
                mostRepeatedAge = i;
            }
        }
        return mostRepeatedAge;
    }

    public static Person[] sortByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; ++i) {
            for (int j = i + 1; j < persons.length; ++j) {
                if (persons[i].age > persons[j].age) {
                    Person yongPerson = persons[j];
                    persons[j] = persons[i];
                    persons[i] = yongPerson;
                }
            }
        }
        return persons;
    }


    public static Person[] sortByName(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].name.compareTo(persons[j].name) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = tmp;
                }
            }
        }
        return persons;
    }


    public static Person[] sortByCompany(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[i].company.compareTo(persons[j].company) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[i];
                    persons[i] = tmp;
                }
            }
        }
        return persons;
    }

    public static Person getDuplicatePerson(Person[] persons) {
        for (int i = 0; i < persons.length - 1; ++i) {
            for (int j = i + 1; j <persons.length; ++j) {
                if (persons[i].equals(persons[j])){
                    return persons[i];
                }
            }
        }
        return null;
    }


}








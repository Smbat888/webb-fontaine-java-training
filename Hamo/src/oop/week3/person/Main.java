package oop.week3.person;

/**
 * Created by: Hmayak on Oct, 2019
 */
public class Main {

    public static void main(String[] args) {

        Person persons[] = PersonRepository.getData();
        Person.arrayToString(persons);
        System.out.println();
        Person.arrayToString(PersonsAPI.getPersonsInCompany(persons, "Webb Fontaine"));
        System.out.println();
        System.out.println(PersonsAPI.getOldestPerson(persons));
        System.out.println("--------------------");
        System.out.println(PersonsAPI.getYoungestPerson(persons));
        System.out.println("-----------------");
        System.out.println(PersonsAPI.getMostRepeatedAge(persons));
        System.out.println("-----------------");
        System.out.println(PersonsAPI.getDuplicatePerson(persons));

        for (int i = 0; i < persons.length ; i++) {
            System.out.println(PersonsAPI.sortByAge(persons)[i].age);
            System.out.print(PersonsAPI.sortByAge(persons)[i].name);
            System.out.print(PersonsAPI.sortByAge(persons)[i].company);
            System.out.println();
        }

        for (int i = 0; i < persons.length ; i++) {
            System.out.println(PersonsAPI.sortByName(persons)[i].age);
            System.out.print(PersonsAPI.sortByName(persons)[i].name);
            System.out.print(PersonsAPI.sortByName(persons)[i].company);
            System.out.println();
        }

        for (int i = 0; i < persons.length ; i++) {
            System.out.println(PersonsAPI.sortByCompany(persons)[i].age);
            System.out.print(PersonsAPI.sortByCompany(persons)[i].name);
            System.out.print(PersonsAPI.sortByCompany(persons)[i].company);
        }

            }
        }



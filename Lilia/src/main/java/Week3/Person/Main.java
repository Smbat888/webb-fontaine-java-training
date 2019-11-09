package Week3.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person persons[] =PersonRepo.getData();
        Person.arrayToString(persons);
        System.out.println();
        System.out.println("People working in requested company are:");
        Person.arrayToString(PersonAPI.getPersonsInCompany(persons,"Webb"));
        System.out.println("List of oldest people:");
        Person.arrayToString(PersonAPI.getOldestPerson(persons));
        System.out.println("List of youngest people:");
        Person.arrayToString(PersonAPI.getYoungestPersons(persons));
        System.out.println("The most repeated age is:");
        System.out.println(PersonAPI.getTheMaxRepeatedAge(persons));
        System.out.println("Sorted by age(Ascending to Descending:");
        Person.arrayToString(PersonAPI.getAscendingSortedByAge(persons));
        System.out.println();
        System.out.println("Sorted by age(Descending to Ascending:");
        Person.arrayToString(PersonAPI.getDescendingSortedByAge(persons));
        System.out.println();
        System.out.println("Sorted by Name:");
        Person.arrayToString(PersonAPI.getSortedByNames(persons));
        System.out.println();
        System.out.println("Sorted by Company:");
        Person.arrayToString(PersonAPI.getSortedByCompanies(persons));
        System.out.println("The Most Repeated Person:");
        System.out.println(PersonAPI.getTheMostRepeatedPerson(persons));
    }
}

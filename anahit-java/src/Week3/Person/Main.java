package Week3.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person persons[] =DataRepo.getData();

        System.out.println("People working in the company are: ");
        Person.arrayToString(PersonAPI.getPersonsInCompany(persons,"WFA"));
    }

}

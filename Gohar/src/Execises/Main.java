package Execises;

public class Main {
    public static void main(String[] args) {

        Adress companyAdress = new Adress("Armenia", "Yerevan", "Armenakyan", 0015);
        Company company = new Company("Webbfontaine", companyAdress);
        Job job = new Job("QA Engineer", company, 10000000);
        Adress myAdress = new Adress("Armenia", "Yerevan", "Israyelyan21", 0015);
        Person p = new Person("Gohar", 32, myAdress, job);

        System.out.println(p.getCompanyName());
        for(Person person : DataRepo.data) {
            System.out.println(person);
        }

    }
}

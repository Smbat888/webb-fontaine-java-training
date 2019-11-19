package Execises;

public class DataRepo {

    public static final Person[] data = new Person[3];
    static {
        Adress companyAdress = new Adress("Armenia", "Yerevan", "Armenakyan", 0015);
        Company company = new Company("Webbfontaine", companyAdress);
        Job job = new Job("QA Engineer", company, 10000000);
        Adress myAdress = new Adress("Armenia", "Yerevan", "Israyelyan21", 0015);
        Person p = new Person("Gohar", 32, myAdress, job);
        data[0] =p;

        companyAdress = new Adress("Russia", "Moscow", "Grigorev", 0125);
        company = new Company("Epam", companyAdress);
        job = new Job("QA", company, 10000000);
        myAdress = new Adress("Armenia", "Yerevan", "Israyelyan21", 0015);
        p = new Person("Vlad", 32, myAdress, job);
        data[1] =p;

        companyAdress = new Adress("Estonia", "Esiminch", "VabsheEsiminch", 0125);
        company = new Company("Global Logic", companyAdress);
        job = new Job("QA", company, 10000000);
        myAdress = new Adress("Armenia", "Yerevan", "Israyelyan21", 0015);
        p = new Person("Hmayak", 32, myAdress, job);
        data[2] =p;
    }
}

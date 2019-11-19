package Execises;

public class Person {

    private String name;
    private int age;
    private Adress adress;
    private Job job;

    public Person(String name, int age, Adress adress, Job job) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.job = job;
    }

    public String getCompanyName(){
        return job.getConpany().getName();
    }

    @Override
    public String toString() {
        return String.format("{%s , %d , %s, %s }", name, age, adress, job);
    }
}

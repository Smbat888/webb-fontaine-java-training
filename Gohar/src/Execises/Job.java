package Execises;

public class Job {
    private String title;
    private Company company;
    private double salary;

    public Job(String title, Company company, double salary) {
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Company getConpany() {
        return company;
    }

    public void setConpany(Company conpany) {
        this.company = conpany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("{%s ,%s, %f }", title, company, salary);
    }
}

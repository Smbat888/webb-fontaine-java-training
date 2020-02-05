package week4.tooyn;

/**
 * Created by: Hmayak on Nov, 2019
 */
public class Job {
    private String tittle;
    private Company company;
    private int salary;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Job(String tittle, Company company, int salary) {
        this.tittle = tittle;
        this.company = company;
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return String.format("%s,%s,%d", tittle, company, salary);
    }
}

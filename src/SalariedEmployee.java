import java.time.LocalDate;
import java.util.Date;

public class SalariedEmployee extends Employee{

    private double weeklySalary;


    public double getWeeklySalary() {
        return weeklySalary;
    }


    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0)
            this.weeklySalary = weeklySalary;
        else throw new IllegalArgumentException("Weekly salary must be >= 0" );

    }


    public SalariedEmployee(String name, String lastName, String SSN, LocalDate birthDate, double weeklySalary) {
        super(name, lastName, SSN , birthDate);
        setWeeklySalary(weeklySalary);
    }

    @Override
    public double Earnings() {
        return weeklySalary;
    }


    @Override
    public String toString() {
        return super.toString()+"weekly Salary=" + weeklySalary;
    }


}


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


    public SalariedEmployee(String name, String lastName, String SSN, double weeklySalary) {
        super(name, lastName, SSN);
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

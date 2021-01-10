
public class HourlyEmployee extends Employee{

    private double hourlyWage;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if ( hourlyWage >= 0)
            this.hourlyWage = hourlyWage;
        else throw new IllegalArgumentException("Hourly wage must be >= 0" );

    }

    private double hoursWorked;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if ( hoursWorked >= 0)
            this.hoursWorked = hoursWorked;
        else throw new IllegalArgumentException("Hours worked must be >= 0" );

    }

    @Override
    public double Earnings(){

        if (hoursWorked <= 40){
             return hourlyWage * hoursWorked;
        }else {
            return (40 * hourlyWage + (hoursWorked - 40) * (hourlyWage * 1.5));
        }
    }

    public HourlyEmployee(String name, String lastName, String SSN, double hourlyWage , double hoursWorked) {
        super(name, lastName, SSN);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString()+
                "hourly Wage=" + getHourlyWage() +
                ", hours Worked=" + getHoursWorked();
    }
}

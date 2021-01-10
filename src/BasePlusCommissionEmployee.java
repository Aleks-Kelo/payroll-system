

public class BasePlusCommissionEmployee extends CommissionEmployee{


    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if ( baseSalary >= 0)
            this.baseSalary = baseSalary;
        else throw new IllegalArgumentException("Base salary must be >= 0" );
    }

    @Override
    public double Earnings() {

        return  super.Earnings() + baseSalary;
    }


    public BasePlusCommissionEmployee(String name, String lastName, String SSN, double grossSales, double commissionRate,double baseSalary) {
        super(name, lastName, SSN, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    @Override
    public String toString() {

        return super.toString()+", base Salary=" + baseSalary;
    }
}

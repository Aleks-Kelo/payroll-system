import java.time.LocalDate;
import java.util.Date;

public class CommissionEmployee extends Employee{

    private double grossSales;

    public void setGrossSales(double grossSales) {

        if ( grossSales >= 0 )
            this.grossSales = grossSales;
        else throw new IllegalArgumentException("Gross sales must be >= 0" );
    }

    public double getGrossSales() {
        return grossSales;
    }

    private double commissionRate;

    public void setCommissionRate(double commissionRate) {

        if ( commissionRate > 0 && commissionRate < 1 )
            this.commissionRate = commissionRate;
        else throw new IllegalArgumentException("Commission rate must be bigger than 0 and smaller than 1" );
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double Earnings(){

        return commissionRate * grossSales;
    }

    public CommissionEmployee(String name, String lastName, String SSN, LocalDate birthDate, double grossSales, double commissionRate) {
        super(name, lastName, SSN, birthDate);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    @Override
    public String toString() {

        return super.toString()+"gross Sales=" + grossSales +
                ", commission Rate=" + commissionRate;
    }
}

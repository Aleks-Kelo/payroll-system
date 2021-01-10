
public class Test {

    public static void main(String[] args) {

        Employee[] employees = new Employee[15];

        employees[0] = new SalariedEmployee("Salaried","Employee","000-00-0000",400);
        employees[1] = new SalariedEmployee("Salaried","Employee","000-00-0001",300);
        employees[2] = new SalariedEmployee("Salaried","Employee","000-00-0002",500);

        employees[3] = new HourlyEmployee("Hourly","Employee","000-00-0003",10,40);
        employees[4] = new HourlyEmployee("Hourly","Employee","000-00-0004",16,20);
        employees[5] = new HourlyEmployee("Hourly","Employee","000-00-0005",9,45);

        employees[6] = new CommissionEmployee("Commission","Employee","000-00-0006",7000,0.08);
        employees[7] = new CommissionEmployee("Commission","Employee","000-00-0007",8000,0.05);
        employees[8] = new CommissionEmployee("Commission","Employee","000-00-0008",5500,0.07);

        employees[9] = new BasePlusCommissionEmployee("CommissionPlusBase","Employee","000-00-0009",5000,0.035,200);
        employees[10] = new BasePlusCommissionEmployee("CommissionPlusBase","Employee","000-00-0010",7400,0.015,300);
        employees[11] = new BasePlusCommissionEmployee("CommissionPlusBase","Employee","000-00-0011",4050,0.02,400);

        employees[12] = new PieceWorker("Piece","Worker","000-00-0012",30,20);
        employees[13] = new PieceWorker("Piece","Worker","000-00-0013",35,15);
        employees[14] = new PieceWorker("Piece","Worker","000-00-0014",33,18);


        double maxSalary = 0, SalariedE = 0, HourlyE = 0, CommissionE = 0, ComPlusBaseE = 0, PieceE = 0;
        double SalariedNr = 0, HourlyNr = 0, CommissionNr = 0, ComPlusBaseNr = 0, PieceNr = 0;
        for (Employee employee : employees) {
            if (employee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee thisEmployee = (BasePlusCommissionEmployee) employee;
                thisEmployee.setBaseSalary(1.1 * thisEmployee.getBaseSalary());
            }
            System.out.println(employee.toString());
            System.out.println("Earnings=" + employee.Earnings());


            if (employee.Earnings() > maxSalary) {
                maxSalary = employee.Earnings();
            }

            if (employee instanceof SalariedEmployee) {

                SalariedE += employee.Earnings();
                SalariedNr++;
            }
            if (employee instanceof HourlyEmployee) {

                HourlyE += employee.Earnings();
                HourlyNr++;
            }
            if (employee instanceof CommissionEmployee) {

                CommissionE += employee.Earnings();
                CommissionNr++;
            }
            if (employee instanceof BasePlusCommissionEmployee) {

                ComPlusBaseE += employee.Earnings();
                ComPlusBaseNr++;
            }
            if (employee instanceof PieceWorker) {

                PieceE += employee.Earnings();
                PieceNr++;
            }


        }
        System.out.println("The maximum earning is :"+maxSalary);









    }
}









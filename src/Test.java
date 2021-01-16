import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = new Employee[15];


        employees[0] = new SalariedEmployee("Salaried", "Employee1", "000-00-0000", LocalDate.of(1999, 1, 4), 400);
        employees[1] = new SalariedEmployee("Salaried", "Employee2", "000-00-0001", LocalDate.of(1993, 2, 9), 300);
        employees[2] = new SalariedEmployee("Salaried", "Employee3", "000-00-0002", LocalDate.of(1987, 11, 3), 500);

        employees[3] = new HourlyEmployee("Hourly", "Employee1", "000-00-0003", LocalDate.of(1979, 10, 17), 10, 40);
        employees[4] = new HourlyEmployee("Hourly", "Employee2", "000-00-0004", LocalDate.of(1987, 6, 29), 16, 20);
        employees[5] = new HourlyEmployee("Hourly", "Employee3", "000-00-0005", LocalDate.of(1994, 8, 5), 9, 45);

        employees[6] = new CommissionEmployee("Commission", "Employee1", "000-00-0006", LocalDate.of(1968, 7, 27), 7000, 0.08);
        employees[7] = new CommissionEmployee("Commission", "Employee2", "000-00-0007", LocalDate.of(1989, 12, 14), 8000, 0.05);
        employees[8] = new CommissionEmployee("Commission", "Employee3", "000-00-0008", LocalDate.of(1997, 3, 19), 5500, 0.07);

        employees[9] = new BasePlusCommissionEmployee("CommissionPlusBase", "Employee1", "000-00-0009", LocalDate.of(2000, 8, 6), 5000, 0.035, 200);
        employees[10] = new BasePlusCommissionEmployee("CommissionPlusBase", "Employee2", "000-00-0010", LocalDate.of(1985, 4, 1), 7400, 0.015, 300);
        employees[11] = new BasePlusCommissionEmployee("CommissionPlusBase", "Employee3", "000-00-0011", LocalDate.of(2001, 6, 30), 4050, 0.02, 400);

        employees[12] = new PieceWorker("Piece", "Worker1", "000-00-0012", LocalDate.of(1980, 5, 3), 30, 20);
        employees[13] = new PieceWorker("Piece", "Worker2", "000-00-0013", LocalDate.of(1998, 1, 18), 35, 15);
        employees[14] = new PieceWorker("Piece", "Worker3", "000-00-0014", LocalDate.of(1975, 3, 24), 33, 18);


        double maxSalary = 0, SalariedE = 0, HourlyE = 0, CommissionE = 0, ComPlusBaseE = 0, PieceE = 0;
        double SalariedNr = 0, HourlyNr = 0, CommissionNr = 0, ComPlusBaseNr = 0, PieceNr = 0;
        double bonusedSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee thisEmployee = (BasePlusCommissionEmployee) employee;
                thisEmployee.setBaseSalary(1.1 * thisEmployee.getBaseSalary());
            }

            System.out.println(employee.toString());
            if (LocalDate.now().getMonthValue() == employee.getBirthDate().getMonthValue()) {
                bonusedSalary = (employee.Earnings() + 100);
                System.out.println("Since it is your birthday you receive a bonus of 100.Total Earnings :" + bonusedSalary+"\n");


            } else
                System.out.println("Earnings=" + employee.Earnings()+"\n");

            if (bonusedSalary > maxSalary) {
                maxSalary = bonusedSalary;
            } else if (employee.Earnings() > maxSalary) {
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
        System.out.println("The maximum earning is :" + maxSalary+"\n");
        System.out.println("The average earning for Salaried Employees is :" + SalariedE / SalariedNr+"\n");
        System.out.println("The average earning for Hourly Employees is :" + HourlyE / HourlyNr+"\n");
        System.out.println("The average earning for Commission Employees is :" + CommissionE / CommissionNr+"\n");
        System.out.println("The average earning for Base plus commission Employees is :" + ComPlusBaseE / ComPlusBaseNr+"\n");
        System.out.println("The average earning for Piece Worker is :" + PieceE / PieceNr+"\n");






        insertionSort(employees);
        binarySearch(employees,395);




    }

    public static void insertionSort(Employee[] employees) {
        int n = employees.length;
        for (int j = 1; j < n; j++) {
            Employee key = employees[j];
            int i = j - 1;
            while ((i > -1) && (employees[i].Earnings() > key.Earnings())) {
                employees[i + 1] = employees[i];
                i--;
            }
            employees[i + 1] = key;
        }
        int index = 1;
        for (Employee employee : employees) {
            System.out.println(index+"."+employee.getName() + " " + employee.getLastName() + " :" + (int)employee.Earnings());
            index++;
        }


    }

    public static void binarySearch(Employee[] employees, int salary) {
        int low = 0;
        int high = employees.length - 1;
        int mid = (low + high) / 2;


        while (low <=high) {
            if ( (int )employees[mid].Earnings() < salary ){
                low = mid + 1;
            }
            else if ((int)employees[mid].Earnings() == salary) {
                System.out.println("\nThe employee with salary "+salary+ " is found at index :"+(mid+1));
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if ( low > high ){
            System.out.println("Salary not found");
        }

    }

}

















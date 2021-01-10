import java.util.Date;

public abstract class Employee {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String employeeName){
        name = employeeName;
    }

    private String lastName;

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String employeeLastName){
        lastName = employeeLastName;
    }

    private String SSN;

    public String getSSN(){
        return SSN;
    }

    public void setSSN(String employeeSSN){
        SSN = employeeSSN;
    }

    public Employee(String name,String lastName,String SSN){
        this.name = name;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public abstract double Earnings();

    @Override
    public String toString() {
        return "Employee" +
                " name=" + getName() +
                ", last name=" + getLastName()+
                ", SSN=" + getSSN() +", ";
    }

    //    private Date birthDate;
//
//    public Date getBirthDate() {
//        return birthDate;
//    }
//
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }
}

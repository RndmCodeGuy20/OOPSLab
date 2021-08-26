/**
 * @author Shantanu Mane
 * @version 20.20
 * @brief Consider a class Employee with data members as employee id and
 *        employee name. Create an interface taxable which has method
 *        calculateTax(). Derive a class permanent from class employee and
 *        interface taxable. Data member for permanent is Salary, include
 *        function AdditionalEarning which stores information if there is
 *        additional earning. Calculate tax for the permanent employee. If
 *        salary for an employee is between 1 lakh to 5 lakh tax is 10%. If
 *        salary is more than 5 lakh tax is 20%. Add a function to display the
 *        salary and tax. Derive a class HourlyEmployee from Employee. Data
 *        members are HoursWorked, RatePerHour. Include methods to calculate
 *        salary and display it.
 * @RndmCodeGuy20 
 */
public class EmployeeAss6 {
    public static void main(String[] args) {

        Permanent permanentEmp = new Permanent(19763, "Vaishali", 500000);
        permanentEmp.Display_Info();
        System.out.println("Employee Type : Permanent");
        permanentEmp.Display_Sal();

        //-------------------------------//------------------------------//

        Hourly_Employee hourlyEmp = new Hourly_Employee(200220, "Shantanu", 90, 800);
        hourlyEmp.Display_Info();
        System.out.println("Employee Type: Hourly");
        hourlyEmp.Display_Sal();
    }
}

class Employee {
    long empID;
    String empName;

    Employee(long id, String empName) {
        empID = id;
        this.empName = empName;
    }

    void Display_Info() {
        System.out.println("\n==================================================");
        System.out.println("Employee Information:\n");
        System.out.println("Employee ID      : " + empID);
        System.out.println("empName of Employee : " + empName);
    }
}

interface Taxable {
    double CalTax(double Salary);
}

class Permanent extends Employee implements Taxable {
    double Salary, temp, tax, percent, addEarn;

    Permanent(long ID, String empName, double Salary) {
        super(ID, empName);
        this.Salary = Salary;
        addEarn = 5000;
    }

    public double CalculateTax(double Salary) {
        if (Salary > 100000 && Salary <= 500000) {
            percent = 10;
        } else if (Salary > 500000) {
            percent = 20;
        } else if (Salary < 100000) {
            percent = 0;
        }
        tax = (percent / 100) * Salary;
        return tax;
    }

    double CalSal(double Salary, double tax) {
        CalTax(Salary);
        temp = Salary - tax;
        return temp;
    }

    void Additional_Earning() {
        System.out.println("\nAdditional Earnings :" + addEarn);
    }

    void Display_Sal() {
        System.out.println("\nInitial Salary             : " + Salary + " Rs");
        System.out.println("Tax deducted               : " + CalTax(Salary) + " Rs");
        System.out.println("Salary after Tax Deduction : " + CalSal(Salary, tax) + " Rs");
        Additional_Earning();
        System.out.println("\n--------------------------------------------");
        System.out.println("Total Salary               : " + (temp + addEarn) + " Rs");
    }

    @Override
    public double CalTax(double Salary) {
        // TODO Auto-generated method stub
        return 0;
    }
}

class Hourly_Employee extends Employee {
    int Hours_Worked;
    double Rate;

    Hourly_Employee(long id, String empName, int Hours_Worked, double Rate) {
        super(id, empName);
        this.Hours_Worked = Hours_Worked;
        this.Rate = Rate;
    }

    double CalSal(int Hours_Worked, double Rate) {
        return Hours_Worked * Rate;
    }

    void Display_Sal() {
        System.out.println("\nNumber of Hours Worked : " + Hours_Worked);
        System.out.println("Rate per Hour          : " + Rate + " Rs");
        System.out.println("\n--------------------------------------------");
        System.out.println("Total Salary           : " + CalSal(Hours_Worked, Rate) + " Rs");
    }
}
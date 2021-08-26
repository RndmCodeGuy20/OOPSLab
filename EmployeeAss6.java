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
        this.empID = id;
        this.empName = empName;
    }

    void Display_Info() {
        System.out.println("\n==================================");
        System.out.println("Employee Information:\n");
        System.out.println("Employee ID      : " + empID);
        System.out.println("empName of Employee : " + empName);
    }
}

interface Taxable {
    double CalTax(double Salary);
}

class Permanent extends Employee implements Taxable {
    double Salary, temp, tax, percent, AE;

    Permanent(long ID, String empName, double Salary) {
        super(ID, empName);
        this.Salary = Salary;
        AE = 5000;
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
        System.out.println("\nAdditional Earnings :" + AE);
    }

    void Display_Sal() {
        System.out.println("\nInitial Salary             : " + Salary + " Rs");
        System.out.println("Tax deducted               : " + CalTax(Salary) + " Rs");
        System.out.println("Salary after Tax Deduction : " + CalSal(Salary, tax) + " Rs");
        Additional_Earning();
        System.out.println("\n--------------------------------------------");
        System.out.println("Total Salary               : " + (temp + AE) + " Rs");
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
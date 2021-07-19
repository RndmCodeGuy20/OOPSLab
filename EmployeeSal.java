import java.util.Scanner;

public class EmployeeSal {

    double Salary;
    int Hours;
    public void getInfo(double Salary, int Hours) {
        this.Salary = Salary;
        this.Hours = Hours;
    }

    public void addSal() {
        if (Salary < 500) {
            Salary+=10;
        }
    }

    public void addWork() {
        if (Hours > 6) {
            Salary += 5;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Employee's Salary : ");
        double Sal = scan.nextInt();

        System.out.println("Enter the Employee's number of working hours per day : ");
        int Hours = scan.nextInt();

        EmployeeSal eSal = new EmployeeSal();

        eSal.getInfo(Sal, Hours);
        eSal.addSal();
        eSal.addWork();

        System.out.println("Working Hours per day of the Employee is : " + eSal.Hours);
        System.out.println("Salary of the Employee is : " + eSal.Salary);

        scan.close();

    }
}

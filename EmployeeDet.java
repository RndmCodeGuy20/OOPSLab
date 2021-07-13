/**
 * EmployeeDet
 */
class Employee {

    String Name;
    int Age;
    String Designation;
    double Salary;

    Employee(String Name, int Age, String Designation, double Salary){
        this.Name = Name;
        this.Age = Age;
        this.Designation = Designation;
        this.Salary = Salary;
    }

    void display() {
        System.out.println(Name + "\n" + Age + "\n" + Designation + "\n" + Salary);
    }
}

public class EmployeeDet {
    public static void main(String[] args) {
        Employee E1 = new Employee("Shantanu Mane",22, "Junior Developer", 50000);

        E1.display();
    }
}
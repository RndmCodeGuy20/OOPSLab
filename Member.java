public class Member {
    String Name;
    int Age;
    long PhoneNum;
    String Address;
    double Salary;

    public void PrintSalary(double Salary) {
        System.out.println("Salary of the person is : " + Salary);
    }

    public static void main(String[] args) {
        Employee DispEmp = new Employee();
        Manager DispMan = new Manager();

        DispEmp.PrintInfoEmp("Shantanu Mane", 23, 98989897, "4th Street, Hudson Valley", 20000);
        DispMan.PrintInfoMan("Bill Gates", 40, 98984985, "6th Road, Hudson Valley", 40000);

        Member dispSal = new Member();
        dispSal.PrintSalary(30000);
    }
}

class Employee extends Member {
    String Specialization = "WEBDEV";
    String Department = "Front-End";

    public void PrintInfoEmp(String Name, int Age, long PhoneNum, String Address, double Salary) {
        System.out.println("=======================================");
        System.out.println("\n\nCredentials of the Employee is : " + "\n\n" + "Name : " + Name + "\n\n" + "Age : " + Age
                + "\n\n" + "Phone Number : " + PhoneNum + "\n\n" + "Address : " + Address + "\n\n" + "Salary : "
                + Salary + "\n\n" + "Specialization : " + Specialization + "\n\n" + "Department : " + Department);
    }

}

class Manager extends Member {
    String Specialization = "AIML";
    String Department = "Cloud";

    public void PrintInfoMan(String Name, int Age, long PhoneNum, String Address, double Salary) {
        System.out.println("=======================================");
        System.out.println("\n\nCredentials of the Manager is : " + "\n\n" + "Name : " + Name + "\n\n" + "Age : " + Age
                + "\n\n" + "Phone Number : " + PhoneNum + "\n\n" + "Address : " + Address + "\n\n" + "Salary : "
                + Salary + "\n\n" + "Specialization : " + Specialization + "\n\n" + "Department : " + Department);

    }

}
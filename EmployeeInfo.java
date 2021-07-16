public class EmployeeInfo {
    String Name;
    String Address;
    int YearofJoin;

    EmployeeInfo(String Name, int YearofJoin,String Address){
        this.Name = Name;
        this.YearofJoin = YearofJoin;
        this.Address = Address;
    }

    public void PrintInfo() {
        System.out.println(this.Name + "\t\t\t" + this.YearofJoin + "\t\t" + this.Address);
    }

    public static void main(String[] args) {
        System.out.println("Name \t\t Year of Joining \t Address");

        EmployeeInfo Emp1 = new EmployeeInfo("Robert", 1994, "64-C Wall Street");
        Emp1.PrintInfo();
        
        EmployeeInfo Emp2 = new EmployeeInfo("Sam", 2000, "68-D Wall Street");
        Emp2.PrintInfo();

        EmployeeInfo Emp3 = new EmployeeInfo("John", 1999, "26-B Wall Street");
        Emp3.PrintInfo();
    }
}

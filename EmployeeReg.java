import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Create a class Employee having data members ID and Name. Write getdata
 *        method to get data.Perform user defined exception handling to handle
 *        above constraints.
 * 
 * @copyright @RndmCodeGuy20
 */

class Invalid extends RuntimeException {
    Invalid(String msg) {
        super(msg);
    }
}

public class EmployeeReg {

    String ID;

    EmployeeReg(String ID) {
        this.ID = ID;
    }

    public void PatternMatcher() {
        String Pat = "(CS)([0][0-4][0-9])|(IT)([0][0-4][0-9])|(EC)([0][0-4][0-9])";
        Pattern p = Pattern.compile(Pat);

        Matcher m = p.matcher(ID);

        try {
            if (!m.find()) {

                throw new Invalid("Invalid ID");

            } else {

                System.out.println("Valid ID");

            }
        } catch (Invalid i) {

            // TODO: handle exception

            i.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String Name = scan.nextLine();

        System.out.println("Enter Employee ID : ");
        String IDInput = scan.nextLine();

        System.out.println("\nName of the Employee is : " + Name);

        EmployeeReg empReg = new EmployeeReg(IDInput);
        empReg.PatternMatcher();

        scan.close();
    }
}

/**
 * *OUTPUT (Best Case)
 * 
 * PS C:\OOPSLab> javac .\EmployeeReg.java PS 
 * C:\OOPSLab> java EmployeeReg 
 * 
 * Enter Name : Shantanu 
 * Enter Employee ID : CS045
 * 
 * Name of the Employee is : Shantanu 
 * Valid ID
 * 
 * 
 * *OUTPUT (Worst Case)
 * 
 * PS C:\OOPSLab> javac .\EmployeeReg.java 
 * PS C:\OOPSLab> java EmployeeReg Enter
 * 
 * Name : Mane 
 * Enter Employee ID : IT067
 * 
 * Name of the Employee is : Mane 
 * Invalid: Invalid ID at
 *      EmployeeReg.PatternMatcher(EmployeeReg.java:28) at
 *      EmployeeReg.main(EmployeeReg.java:57)
 */
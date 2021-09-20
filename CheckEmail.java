import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief  Check whether the string is a valid email address with the help of
 *         regular expression.
 * 
 * @copyright @RndmCodeGuy20
 */
public class CheckEmail {
    public static void main(String[] args) {

        String EmailID;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the E-mail : ");
        EmailID = scan.nextLine();

        String EmailPat = "/^([a-z0-9\\._]+)@([a-z]+).([a-z]{2,3})$/";

        Pattern p = Pattern.compile(EmailPat);

        Matcher m = p.matcher(EmailID);

        if (m.find()) {
            System.out.println("Valid ID!");
        } else {
            System.out.println("Invalid ID");
        }
        
        scan.close();
    }
}

/*  
*OUTPUT (Best Case)

PS C:\OOPSLab> javac .\CheckEmail.java
PS C:\OOPSLab> java CheckEmail        
Enter the E-mail : shantanu@gmail.com
Valid ID

*OUTPUT (Worst Case)

PS C:\OOPSLab> javac .\CheckEmail.java
PS C:\OOPSLab> java CheckEmail        
Enter the E-mail : .-#mane@gmail.comp
Invalid ID
*/
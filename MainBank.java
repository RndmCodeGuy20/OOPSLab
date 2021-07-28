import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class MainBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of account do you want?");
        String choice = scan.nextLine();
        System.out.println(choice);

        if (choice.equals("Savings")) {

            Savings accSavings = new Savings();

            System.out.println("Enter your credentials : ");

            accSavings.InfoUserSavings("Shantanu Mane", 19, 'M', 1000);
            accSavings.WithdrawSav(300);
            accSavings.CreditSave(230);

        } else if (choice.equals("Credit")) {
        } else {
            System.out.println("Wrong choice!!!");
        }

    }
}

//=====//====//=====//

class Savings extends MainBank {
    int TotalBalSav;
    final int MinBalSav = 1000;

    public void InfoUserSavings(String Name, int Age, char Gend, int inpBal) {
        
        
        System.out.println("User Credentials : " + Name + " " + Age + " " + Gend + "Input Amount " + inpBal);
        if (inpBal < MinBalSav) {
            System.out.println("Minimum Balance not satisfied!");
        }
        TotalBalSav = inpBal;
    }

    public void WithdrawSav(int amWithSav) {

        System.out.println("Your Total Balance is " + TotalBalSav);
        if (amWithSav < TotalBalSav) {
            TotalBalSav = TotalBalSav - amWithSav;
        } else {
            System.out.println("Insufficient Balance!!!");
        }
        System.out.println("Remaining amount in account after withdrawal is " + TotalBalSav);
    }

    public void CreditSave(int CredAmSav) {
        System.out.println("Your Total Balance is " + TotalBalSav);

        TotalBalSav = TotalBalSav + CredAmSav;

        System.out.println("Remaining amount in account after credit is " + TotalBalSav);

    }
}

//====//====//=====//

class Current extends MainBank {
    int TotalBalCurr;

}

class Customer {

}
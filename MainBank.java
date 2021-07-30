import java.util.Scanner;

public class MainBank {
    static int InitialBal;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of account do you want? (Savings / Currents)");

        String choice = scan.nextLine();

        if (choice.equals("Savings")) {

            Savings accSavings = new Savings();

            System.out.print("Enter your credentials : \n\n");

            System.out.print("Enter Name : ");
            String Name = scan.nextLine();

            System.out.print("\nEnter Age : ");
            int Age = scan.nextInt();

            System.out.print("\nEnter Gender : ");
            char Gend = scan.next().charAt(0);

            if (Name.equals("Shantanu Mane")) {
                InitialBal = 2000;
            } else if (Name.equals("Vaishali Mane")) {
                InitialBal = 900;
            }

            accSavings.InfoUserSavings(Name, Age, Gend, InitialBal);

            System.out.println("\n\nWhat operation do you want to do?" + "\n\n" + "Press A to open new account" + "\n\n"
                    + "Press B to deposit amount " + "\n\n" + "Press C to debit amount" + "\n\n"
                    + "Press D to close account");
            char OperChoice;

            OperChoice = scan.next().charAt(0);

            switch (OperChoice) {
                case 'A':
                    System.out.println("How much amount do you want to deposit?");
                    int inpAmo = scan.nextInt();
                    accSavings.OpenAccSav(Name, Age, Gend, inpAmo);
                    break;
                case 'B':
                    System.out.println("How much amount do you want to deposit?");
                    inpAmo = scan.nextInt();
                    accSavings.CreditSave(InitialBal, inpAmo);
                    break;

                case 'C':
                    System.out.println("How much amount do you want to debit?");
                    int debit = scan.nextInt();
                    accSavings.WithdrawSav(InitialBal, debit);
                    break;

                case 'D':
                    System.out.println("Confirm Delete Account?");
                    String delchoice = scan.nextLine();
                    accSavings.DeleteAccSave(delchoice);

                default:
                    break;
            }

        } else if (choice.equals("Currents")) {
            Current accCurrents = new Current();

            System.out.print("Enter your credentials : \n\n");

            System.out.print("Enter Name :");
            String Name = scan.nextLine();

            System.out.print("\nEnter Age : ");
            int Age = scan.nextInt();

            System.out.print("\nEnter Gender : ");
            char Gend = scan.next().charAt(0);

            if (Name.equals("Shantanu Mane")) {
                InitialBal = 9000;
            } else if (Name.equals("Vaishali Mane")) {
                InitialBal = 900;
            }

            accCurrents.InfoUserCurrent(Name, Age, Gend, InitialBal);

            System.out.println("\n\nWhat operation do you want to do?" + "\n\n" + "Press A to open new account" + "\n\n"
                    + "Press B to deposit amount " + "\n\n" + "Press C to debit amount" + "\n\n"
                    + "Press D to close account");
            char OperChoice;

            OperChoice = scan.next().charAt(0);

            switch (OperChoice) {
                case 'A':
                    System.out.println("How much amount do you want to deposit?");
                    int inpAmo = scan.nextInt();
                    accCurrents.OpenAccCurr(Name, Age, Gend, inpAmo);
                    break;
                case 'B':
                    System.out.println("How much amount do you want to deposit?");
                    inpAmo = scan.nextInt();
                    accCurrents.CreditCurr(InitialBal, inpAmo);
                    break;

                case 'C':
                    System.out.println("How much amount do you want to debit?");
                    int debit = scan.nextInt();
                    accCurrents.WithdrawCurr(InitialBal, debit);
                    break;

                case 'D':
                    System.out.println("Confirm Delete Account?");
                    String delchoice = scan.nextLine();
                    accCurrents.DeleteAccCurr(delchoice);
                default:
                    System.out.println("Wrong CHOICE!!!");
                    break;
            }
        } else {
            System.out.println("Wrong choice!!!");
        }
        scan.close();
    }
}

//=====//====//=====//

class Savings extends MainBank {
    int TotalBalSav;
    final int MinBalSav = 1000;

    public void OpenAccSav(String Name, int Age, char Gend, int inpAmount) {
        int min = 70000;
        int max = 80000;

        int b = (int) (Math.random() * (max - min + 1) + min);

        if (inpAmount < MinBalSav) {
            System.out.println("Minimum balance not satisfied, CANNOT open account!!! Deposit amount more than 1000!");
        } else {
            TotalBalSav = inpAmount;
            System.out.println("Account created successfully!!!" + "\n\n" + "Your Unique ID is " + b + "\n\n"
                    + "Total Balance is : " + TotalBalSav);
        }
    }

    public void InfoUserSavings(String Name, int Age, char Gend, int inpBal) {

        System.out.println(
                "\n\nUser Credentials : \t" + "\nName : " + Name + " \nAge : \t" + Age + " \nGender : \t" + Gend + "\nCurrent Balance Amount : \t" + inpBal);
        if (inpBal < MinBalSav) {
            System.out.println("Minimum Balance not satisfied!");
        }
        TotalBalSav = inpBal;
    }

    public void WithdrawSav(int InitialBal, int amWithSav) {
        TotalBalSav = InitialBal;

        System.out.println("Your Total Balance is " + TotalBalSav);
        if (amWithSav < TotalBalSav) {
            TotalBalSav = TotalBalSav - amWithSav;
        } else {
            System.out.println("Insufficient Balance!!!");
        }
        System.out.println("Remaining amount in account after withdrawal is " + TotalBalSav);
    }

    public void CreditSave(int InitialBal, int CredAmSav) {
        TotalBalSav = InitialBal;
        System.out.println("Your Total Balance is " + TotalBalSav);

        TotalBalSav = TotalBalSav + CredAmSav;

        System.out.println("Remaining amount in account after credit is " + TotalBalSav);

    }

    public void DeleteAccSave(String choiceString) {
        System.out.println("Account Closed successfully!!!");
    }
}

// ====//====//=====//

class Current extends MainBank {
    int TotalBalCurr;

    final int MinBalCurr = 5000;

    public void OpenAccCurr(String Name, int Age, char Gend, int inpAmount) {
        int min = 70000;
        int max = 80000;

        int b = (int) (Math.random() * (max - min + 1) + min);

        if (inpAmount < MinBalCurr) {
            System.out.println("Minimum balance not satisfied, CANNOT open account!!! Deposit amount more than 1000!");
        } else {
            TotalBalCurr = inpAmount;
            System.out.println("Account created successfully!!!" + "\n\n" + "Your Unique ID is " + b + "\n\n"
                    + "Total Balance is : " + TotalBalCurr);
        }
    }

    public void InfoUserCurrent(String Name, int Age, char Gend, int inpBal) {

        System.out.println("\n\nUser Credentials : \t" + "\nName : " + Name + " \nAge : \t" + Age + " \nGender : \t" + Gend
                + "\nCurrent Balance Amount : \t" + inpBal);
        if (inpBal < MinBalCurr) {
            System.out.println("Minimum Balance not satisfied!");
        }
        TotalBalCurr = inpBal;
    }

    public void WithdrawCurr(int InitialBal, int amWithCurr) {
        TotalBalCurr = InitialBal;

        System.out.println("Your Total Balance is " + TotalBalCurr);
        if (amWithCurr < TotalBalCurr) {
            TotalBalCurr = TotalBalCurr - amWithCurr;
        } else {
            System.out.println("Insufficient Balance!!!");
        }
        System.out.println("Remaining amount in account after withdrawal is " + TotalBalCurr);
    }

    public void CreditCurr(int InitialBal, int CredAmCurr) {
        TotalBalCurr = InitialBal;
        System.out.println("Your Total Balance is " + TotalBalCurr);

        TotalBalCurr = TotalBalCurr + CredAmCurr;

        System.out.println("Remaining amount in account after credit is " + TotalBalCurr);

    }

    public void DeleteAccCurr(String choiceString) {
        System.out.println("Account Closed successfully!!!");
    }

}
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Real1,Real2;
        int Im1,Im2;

        System.out.println("Enter the Real part of both the numbers : " );
        Real1 = scan.nextInt();
        Real2 = scan.nextInt();

        System.out.println("Enter the Imaginary part of both the numbers : ");
        Im1 = scan.nextInt();
        Im2 = scan.nextInt();

        System.out.println("The First Complex number entered is : " + Real1 + " + " + Im1 + "i");
        System.out.println("The Second Complex number entered is : " + Real2 + " + " + Im2 + "i");

        CompCalc numObj1 = new CompCalc(Real1, Im1);
        CompCalc numObj2 = new CompCalc(Real2, Im2);

        numObj1.Sub(Real2, Im2);
        numObj1.Add(Real2, Im2);
        numObj1.Prod(Real2, Im2);

        scan.close();
    }
    
}

/**
 * CompCalc
 */
class CompCalc {

    int Real;
    int Im;

    CompCalc(int R, int I){
        Real = R;
        Im = I;
    }

    public void Add(int Real1, int Im1) {
        double AddRe = Real + Real1;
        double AddIm = Im + Im1;

        System.out.println("Sum of the two numbers are : " + AddRe + " + " + AddIm + "i");
    }    

    public void Sub(int Real1, int Im1) {
        double SubRe = Real - Real1;
        double SubIm = Im - Im1;
        
        System.out.println("Subtraction of the two numbers are : " + SubRe + " + " + SubIm + "i");
    }

    public void Prod(int Real1, int Im1) {
        double ProdRe = Real * Real1 - Im * Im1;
        double ProdIm = Real * Im1 + Real1 * Im;

        System.out.println("Product of the two numbers are : " + ProdRe + " + " + ProdIm + "i");
    }
}
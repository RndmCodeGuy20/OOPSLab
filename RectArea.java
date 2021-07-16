import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle :");
        int length = scan.nextInt();

        System.out.println("Enter the length of the rectangle :");
        int breadth = scan.nextInt();

        AreaCalc sides = new AreaCalc(length,breadth);

        System.out.println("Area of the rectangle is : " + sides.ReturnArea() + " units^2");
        scan.close();
    }

}
/**
 * *AreaCalc
 */
class AreaCalc{
    int Length;
    int Breadth;

    public AreaCalc(int l,int b){
        Length = l;
        Breadth = b;
    }

    public int ReturnArea() {
        return Length*Breadth;
    }
}
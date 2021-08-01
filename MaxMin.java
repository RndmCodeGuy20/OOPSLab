import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input Number 1 : ");
        int Num1 = scan.nextInt();

        System.out.println("Input Number 2 : ");
        int Num2 = scan.nextInt();

        Compare Check = new Compare(Num1, Num2);

        System.out.println("Max terms : " + Check.dispMax() + "\n\n" + "Min term : " + Check.dispMin());
        
    }
}

class Compare extends MaxMin{
    int N1;
    int N2;
    int Max;
    int Min;
    public Compare(int Num1 , int Num2){
        N1 = Num1;
        N2 = Num2;
    }

    public int dispMax() {
        if (N1 > N2) {
            Max = N1;
        }
        else{
            Max = N2;
        }

        return Max;
    }

    public int dispMin() {

        if (N1 > N2) {
            Min = N2;
        } else {
            Min = N1;
        }

        return Min;
    }
}
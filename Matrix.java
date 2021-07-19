import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Matrix {

    int row, col, i, j;
    public Matrix() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the required matrix : ");
        row = scan.nextInt();
        col = scan.nextInt();

        int matrix[][] = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Enter the element at " + (i+1) + " and " + (j+1));
                matrix[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("You entered the matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }
        scan.close();
    }

    public static void main(String[] args) {
        Matrix Mat = new Matrix();
    }

}

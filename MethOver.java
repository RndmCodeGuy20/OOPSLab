/**
 * @author Shantanu Mane
 * @RndmCodeGuy20
 * @date 23 - 07 - 2021
 * @copyright
 */
public class MethOver {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(Adder.Add(11, 23));
        System.out.println(Adder.Add(23, 48));
    }
    public static void main(String args) {
        System.out.println("hello");
    }

}
class Adder {
    public static double Add(double num1, double num2) {
        return (num1 + num2);
    }

    public static int Add(int num1, int num2) {
        return (num1 + num2);
    }
}

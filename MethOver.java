/**
 * @author Shantanu Mane
 * @RndmCodeGuy20
 * @date 23 - 07 - 2021
 * @copyright
 */
public class MethOver {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(Adder.Add(11, 23.5));
        System.out.println(Adder.Add(23, 48));
    }
}
class Adder {
    public static float Add(int num1, int num2) {
        return (num1 + num2);
    }

    public static double Add(double num1, double num2) {
        return (num1 + num2);
    }
}

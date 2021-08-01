/**
 * @author Shantanu Mane
 * @RndmCodeGuy20 (Github)
 * @date 23 - 07 - 2021
 * @copyright  Copyright (c) 2021
 */
public class MethOver {
    public static void main(String[] args) {
        Arith adder = new Arith();
        System.out.println(Adder.Add(11, 23) + " 1 ");
        System.out.println(Adder.Add(23, 48) + " 2 ");
    }
}

class Adder {
    public static int Add(int num1, int num2) {
        return (num1 + num2);
    }
}

class Arith extends Adder {
    public static int Add(int num1, int num2) {
        return (num1 + num2);
    }
}
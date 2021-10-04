import java.io.IOException;
import java.util.Scanner;

public class TA6 {
    public static void main(String[] args) throws IOException {

        int numGlasses;
        String Choice;

        FruitFactory fFactory = new FruitFactory();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the type of juice you want? : \n 1] Banana \t 2] Apple \t 3] Orange");
        Choice = scan.nextLine();

        System.out.println("Enter the number of glasses you need : ");
        numGlasses = scan.nextInt();

        Fruit fruit = fFactory.provideFruit(Choice);
        fruit.juiceProd();

        System.out.println(
                "Cost for " + numGlasses + " glasses of " + Choice + " juice is : " + fruit.juiceCost(numGlasses));

        scan.close();
    }
}

abstract class Fruit {
    double Price;
    int totGlasses;

    abstract void juiceProd();

    public double juiceCost(int totGlass) {
        return Price * totGlass;
    }
}

class Apple extends Fruit {
    @Override
    void juiceProd() {
        // TODO: Auto-generated method stub

        Price = 30.00;
        System.out.println("Rate per glass of juice : " + Price);
    }
}

class Banana extends Fruit {
    @Override
    void juiceProd() {
        // TODO Auto-generated method stub

        Price = 15.00;
        System.out.println("Rate per glass of juice : " + Price);
    }
}

class Orange extends Fruit {
    @Override
    void juiceProd() {
        // TODO Auto-generated method stub

        Price = 15.00;
        System.out.println("Rate per glass of juice : " + Price);
    }
}

class FruitFactory {
    public Fruit provideFruit(String choice) {
        if (choice == null) {
            return null;
        } else if (choice.equalsIgnoreCase("Apple")) {
            return new Apple();
        } else if (choice.equalsIgnoreCase("Banana")) {
            return new Banana();
        } else if (choice.equalsIgnoreCase("Orange")) {
            return new Orange();
        } else {
            return null;
        }
    }
}

/**
 *      *OUTPUT
 * PS D:\OOPSLab> javac .\TA6.java 
 * PS D:\OOPSLab> java TA6
 * Enter the type of juice you want? : 
 *  1] Banana       2] Apple        3] Orange
 * Apple
 * Enter the number of glasses you need : 
 * 3
 * Rate per glass of juice : 30.0
 * Cost for 3 glasses of Apple juice is : 90.0
*/
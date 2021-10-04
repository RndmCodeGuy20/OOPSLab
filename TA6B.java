import java.io.IOException;
import java.util.Scanner;

public class TA6B {
    public static void main(String[] args) throws IOException {
        FactoryProducer FP = new FactoryProducer();
        FP.getFactory();
    }
}

class FactoryProducer {
    public void getFactory() {
        Scanner scan = new Scanner(System.in);
        ShapeFactory SF = new ShapeFactory();
        ColorFactory CF = new ColorFactory();

        String choice, col;

        System.out.println("\tWelcome to the world of shapes!!!");
        System.out.println("Enter the shape you want to create : \n 1] Circle \t 2] Rectangle \t 3] Square");
        choice = scan.nextLine();

        System.out.println("Enter the color you want to fill in the shape : \n 1] Red \t 2] Blue \t 3] Green");
        col = scan.nextLine();

        Shape sh1 = (Shape) SF.getShape(choice);
        sh1.Draw();

        Color sh2 = (Color) CF.getColor(col);
        sh2.Fill();

        scan.close();
    }
}

abstract class AbstractFactory {

    abstract Shape getShape(String choice);

    abstract Color getColor(String col);
}

class ShapeFactory extends AbstractFactory {
    public Shape getShape(String choice) {
        if (choice == null) {
            return null;
        } else if (choice.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (choice.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (choice.equalsIgnoreCase("Square")) {
            return new Square();
        } else {
            return null;
        }
    }

    Color getColor(String col) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {
    public Color getColor(String col) {
        if (col == null) {
            return null;
        } else if (col.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (col.equalsIgnoreCase("Blue")) {
            return new Blue();
        } else if (col.equalsIgnoreCase("Green")) {
            return new Green();
        } else {
            return null;
        }
    }

    public Shape getShape(String choice) {
        return null;
    }
}

interface Shape {
    public void Draw();
}

class Circle implements Shape {
    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        System.out.println("\nShape Created : Circle!");
    }
}

class Square implements Shape {
    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        System.out.println("\nShape Created : Square!");
    }
}

class Rectangle implements Shape {
    @Override
    public void Draw() {
        // TODO Auto-generated method stub
        System.out.println("\nShape Created : Rectangle!");
    }
}

interface Color {
    public void Fill();
}

class Red implements Color {
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        System.out.println("Color Filled : Red");
    }
}

class Green implements Color {
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        System.out.println("Color Filled : Green");
    }
}

class Blue implements Color {
    @Override
    public void Fill() {
        // TODO Auto-generated method stub
        System.out.println("Color Filled : Blue");
    }
}


/**
 *      *OUTPUT
 * PS D:\OOPSLab> javac .\TA6B.java
 * PS D:\OOPSLab> java TA6B
        Welcome to the world of shapes!!!
 * Enter the shape you want to create : 
 * 1] Circle       2] Rectangle    3] Square
 * Circle
 * Enter the color you want to fill in the shape : 
 * 1] Red          2] Blue         3] Green
 * Blue

 * Shape Created : Circle!
 * Color Filled : Blue 
 * */
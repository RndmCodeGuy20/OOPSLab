class Box {
    double width;
    double height;
    double breadth;
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myObj1 = new Box();
        myObj1.breadth = 20;
        myObj1.height = 20;
        myObj1.width = 20;

        double volume;
        volume = myObj1.breadth * myObj1.height * myObj1.width;

        System.out.println("Volume is " + volume);
    }
}

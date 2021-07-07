class BoxEx1 {
    double width;
    double height;
    double breadth;

    void Volume() {
        System.out.println("Volume is " + width * breadth * height);
    }
}

public class BoxDemo2 {
    public static void main(String[] args) {
        BoxEx1 myBox1 = new BoxEx1();
        BoxEx1 myBox2 = new BoxEx1();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.breadth = 30;

        myBox2.width = 20;
        myBox2.height = 30;
        myBox2.breadth = 40;

        myBox1.Volume();
        myBox2.Volume();
    }

}

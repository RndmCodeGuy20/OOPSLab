class BoxEx2{
    double width;
    double height;
    double breadth;

    double Volume(){
        return height*breadth*width;
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        BoxEx2 myBox1 = new BoxEx2();
        BoxEx2 myBox2 = new BoxEx2();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.breadth = 30;

        myBox2.width = 20;
        myBox2.height = 30;
        myBox2.breadth = 40;

        double Volume = myBox1.Volume();
        System.out.println("Volume is "+ Volume);

        Volume = myBox2.Volume();
        System.out.println("Volume is " + Volume);

    }
}

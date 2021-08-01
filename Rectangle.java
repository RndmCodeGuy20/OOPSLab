public class Rectangle {
    int Length;
    int Breadth;

    public static void main(String[] args) {
        Rectangle CompArea = new Rectangle(4,5);
        Cuboid CompVol = new Cuboid(2, 3, 4);

        System.out.println("Area of Rectangle : " + CompArea.Area() + "\n\n" + "Volume of Rectangle : " + CompVol.Volume());
    }

    public Rectangle(int Length, int Breadth){
        this.Length = Length;
        this.Breadth = Breadth;
    }

    public int Area() {
        return Length*Breadth;
    }

}

class Cuboid extends Rectangle{
    int Depth;
    public Cuboid(int L, int B, int D){
        super(L,B);
        Depth = D;
    }
    public int Volume() {
        return Length*Breadth*Depth;
    }
}
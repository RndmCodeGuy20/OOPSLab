public class Box {
    static int count = 0;

    Box() {
        count++;
    }

    public static float Area(int h, int w, int d) {
        float area = (h * d + d * w + h * w);
        return area;
    }

    public static void displayCount() {
        System.out.println("Number of Objects : " + count);
    }

    public void Display(float Area, int Count) {
        System.out.println("Area of Box = " + Area);
        System.out.println("No. of Objects = " + Count);
    }

    public static void main(String[] args) {
       
        Box bdis = new Box();
       
        Box.displayCount();
        float area = Box.Area(5, 4, 3);
        bdis.Display(area, count);
    }
}

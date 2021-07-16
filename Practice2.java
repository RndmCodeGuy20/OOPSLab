import java.lang.Math;

public class Practice2 {
    public static void main(String[] args) {
        
        Triangle sideobj = new Triangle();

        double Area;
        double p = (sideobj.a+sideobj.b+sideobj.c)/2;       
        Area = (p*(p-sideobj.a)*(p-sideobj.b)*(p-sideobj.c));
        double Perimeter;
        Perimeter = sideobj.a + sideobj.b + sideobj.c;

        System.out.println("Area of Triangle : " + Math.sqrt(Area) + "\n" +"Perimeter of Triangle : " + Perimeter);
    }   
}
/**
 * *class Triangle
 */
class Triangle {
    int a = 3;
    int b = 4;
    int c = 5; 
}
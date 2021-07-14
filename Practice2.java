import java.lang.Math;

public class Practice2 {
    public static void main(String[] args) {
        
        Triangle sideobj = new Triangle();

        sideobj.a = 3;
        sideobj.b = 4;
        sideobj.c = 5;

        double Areaf;
        double p = (sideobj.a+sideobj.b+sideobj.c)/2;       
        Areaf = (p*(p-sideobj.a)*(p-sideobj.b)*(p-sideobj.c));
        double Perimeter;
        Perimeter = sideobj.a + sideobj.b + sideobj.c;

        System.out.println(Math.sqrt(Areaf) + " " + Perimeter);
    }   
}
/**
 * Triangle
 */
class Triangle {
    int a;
    int b;
    int c; 
}
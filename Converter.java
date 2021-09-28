/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Write a program to implement distance converter
 * (meter to km, miles to km,and vice versa) using generic 
 * classes methods and wild card.
 * 
 * @copyright @RndmCodeGuy20
 */

public class Converter {

    public static void main(String[] args) {
        distanceConv<Double> distD = new distanceConv<Double>(3.6, "Miles");
        distanceConv<Integer> distI = new distanceConv<Integer>(2, "Km");

        distD.dispInfo(distD);
        distI.dispInfo(distI);
    }
}

class distanceConv<D extends Number> {

    Double Km, Miles, Meter;

    distanceConv(D distNum, String dist) {
        if (dist.equals("Km")) {
            fromKM(distNum);
        } else if (dist.equals("Miles")) {
            fromMiles(distNum);
        } else if (dist.equals("Meter")) {
            fromMeter(distNum);
        }
    }

    public void fromKM(D distNum) {
        Km = distNum.doubleValue();
        Miles = distNum.doubleValue() * 0.621371;
        Meter = distNum.doubleValue() * 1000;
    }

    public void fromMiles(D distNum) {
        Km = distNum.doubleValue() * 1.60934;
        Miles = distNum.doubleValue();
        Meter = distNum.doubleValue() * 1609.34;
    }

    public void fromMeter(D distNum) {
        Km = distNum.doubleValue() * 0.0001;
        Miles = distNum.doubleValue() * 0.000621371;
        Meter = distNum.doubleValue();
    }

    public void dispInfo(distanceConv<?> dConv) {
        System.out.println("\nIn KiloMetres : " + dConv.Km + " km");
        System.out.println("In Metres : " + dConv.Meter + " m");
        System.out.println("In Miles : " + dConv.Miles + " mi");
    }
}
/**
 *      *OUTPUT
 * PS D:\OOPSLab> javac .\Converter.java 
 * PS D:\OOPSLab> java Converter
 * 
 * In KiloMetres : 5.793624 km 
 * In Metres : 5793.624 m 
 * In Miles : 3.6 mi
 * 
 * In KiloMetres : 2.0 km 
 * In Metres : 2000.0 m 
 * In Miles : 1.242742 mi
 */
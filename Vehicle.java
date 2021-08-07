public class Vehicle {
    String vehName, regNum, lastServicing;
    double Price, Weight;
    int numWheels, engCap;

    Vehicle(String VehName, String RegNum, String LastServ, double Price, int NumWheels, double Weight, int engCap) {
        vehName = VehName;
        regNum = RegNum;
        lastServicing = LastServ;
        this.Price = Price;
        numWheels = NumWheels;
        this.Weight = Weight;
        this.engCap = engCap;
    }
    
    public static void main(String[] args) {
        
        TwoWheeler two = new TwoWheeler("Pulsar", "MH312020", "01 - 03 - 2020", 56000, 2, 250, 125, 3, "Black", "Private", 4, "Bike with Gears");
        two.dispInfo();

        FourWheeler four = new FourWheeler("Swift Dzire", "MH492019", "28 - 04 - 2019", 300000, 4, 3000, 400, 5, "Blue", "Commercial", 6, "Not Present!", "Car with Gears");
        four.dispInfo();

        Truck tr = new Truck("Eicher", "MH312018", "23 - 11 - 2021", 1000000, 6, 10000, 700, "7000", "Construction Material", 1, "Commercial Truck with Gears");
        tr.dispInfo();
    }

}

class LMV extends Vehicle{
    int seatingCap;
    String color, Use;

    LMV(String vehName, String regNum, String lastServicing, double Price, int numWheels, double Weight, int engCap, int SeatingCap, String Color, String Use){
        super(vehName, regNum, lastServicing, Price, numWheels, Weight, engCap);

        seatingCap = SeatingCap;
        color = Color;
        this.Use = Use;
    }
}

class TwoWheeler extends LMV{
    int gear;
    String typeofVeh;

    TwoWheeler(String vehName, String regNum, String lastServicing, double Price, int numWheels, double Weight, int engCap, int SeatingCap, String Color, String Use, int Gear, String typeofVeh){
    super(vehName, regNum, lastServicing, Price, numWheels, Weight, engCap, SeatingCap, Color, Use);
        gear = Gear;
        this.typeofVeh = typeofVeh;
    }

    public void dispInfo() {
        System.out.println("\nVehicle Name : " + vehName);
        System.out.println("Type of Vehicle : " + typeofVeh);
        System.out.println("Registration Number : " + regNum);
        System.out.println("Last Date of Servicing : " + lastServicing);
        System.out.println("Price : " + Price);
        System.out.println("Number of Wheels : " + numWheels);
        System.out.println("Weight : " + Weight);
        System.out.println("Engine Capacity : " + engCap);
        System.out.println("Seating Capacity : " + seatingCap);
        System.out.println("Color : " + color);
        System.out.println("Number of Gears : " + gear);
    }

}

class FourWheeler extends LMV{
    String typeofVeh;
    String powerSteering;

    FourWheeler(String vehName, String regNum, String lastServicing, double Price, int numWheels, double Weight, int engCap, int SeatingCap, String Color, String Use, int Gear, String PowerSt, String typeofVeh){
        super(vehName, regNum, lastServicing, Price, numWheels, Weight, engCap, SeatingCap, Color, Use);
        powerSteering = PowerSt;
        this.typeofVeh = typeofVeh;
    }

    public void dispInfo() {
        System.out.println("\nVehicle Name : " + vehName);
        System.out.println("Type of Vehicle : " + typeofVeh);
        System.out.println("Registration Number : " + regNum);
        System.out.println("Last Date of Servicing : " + lastServicing);
        System.out.println("Price : " + Price);
        System.out.println("Number of Wheels : " + numWheels);
        System.out.println("Weight : " + Weight);
        System.out.println("Engine Capacity : " + engCap);
        System.out.println("Seating Capacity : " + seatingCap);
        System.out.println("Color : " + color);
    }
}

class HMV extends Vehicle{
    String weightCap, loadingInfo;
    HMV(String vehName, String regNum, String lastServicing, double Price, int numWheels, double Weight, int engCap, String WeightCap, String LoadInfo){
        super(vehName, regNum, lastServicing, Price, numWheels, Weight, engCap);
        weightCap = WeightCap;
        loadingInfo = LoadInfo;
    }

}

class Truck extends HMV{
    int container;
    String typeofVeh;

    Truck(String vehName, String regNum, String lastServicing, double Price, int numWheels, double Weight, int engCap, String WeightCap, String LoadInfo, int Container, String typeOfVeh){
        super(vehName, regNum, lastServicing, Price, numWheels, Weight, engCap, WeightCap, LoadInfo);
        container = Container;
        typeofVeh = typeOfVeh;
    }
    
    public void dispInfo() {
        System.out.println("\nVehicle Name : " + vehName);
        System.out.println("Type of Vehicle : " + typeofVeh);
        System.out.println("Registration Number : " + regNum);
        System.out.println("Last Date of Servicing : " + lastServicing);
        System.out.println("Price : " + Price);
        System.out.println("Number of Wheels : " + numWheels);
        System.out.println("Weight : " + Weight);
        System.out.println("Engine Capacity : " + engCap);
        System.out.println("Weight Capacity : " + weightCap);
        System.out.println("Loading Information : " + loadingInfo);
    }

}
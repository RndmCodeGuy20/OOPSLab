/**
 * @author Shantanu Mane
 * @version 1
 * 
 * @brief Implement concept of Functional Interface. Demonstrate three ways of implementing abstract method of functional interface. Elaborate use of Lambda Expression 
 * 1. No parameter 
 * 2. one parameter 
 * 3. multiple parameter
 * 
 * @RndmCodeGuy20
 */
public class Ass7 {
    public static void main(String[] args) {

        // $ Separate class for Parrots that Party!🤘🤙
        Parrot partyParrot = new Parrot();
        partyParrot.dispInf();

        // $ Anonymous Class for parrots that are Pathetic!!!😑
        ParrotDet2 simpleParrot = new ParrotDet2() {
            public String dispParrot2(String Breed) {
                System.out.println("\nAnonymous class for the quietest parrots in town!!! Pathetic!");
                return ("Quietest Parrots : " + Breed);
            }
        };
        System.out.println(simpleParrot.dispParrot2("Parrotlets"));

        // $ Lambda without params
        ParrotDet bestParrots = () -> {
            System.out.println("\nLambda expression for the best parrots in town!!!");
            return "Cockatiels Party Hard!!!";
        };
        System.out.println(bestParrots.dispParrot());

        // $ Lambda with one param
        ParrotDet2 simpleParrot2 = (String Breed) -> {
            return "\nLamest Parrots : " + Breed;
        };
        System.out.println(simpleParrot2.dispParrot2("Parrotlets"));

        // $ Lambda with multiple params
        ParrotDet3 allaboutParrots = (Color, PetName, Legs, Wings, AvgWeight, AvgWingSpan) -> {
            String outString = "\nColor of Parrot : " + Color + "\nPetName : " + PetName + "\nNumber of Legs :"
                    + "\nNumber of Wings : " + Wings + "\nAverage Weight : " + AvgWeight + "\nAverage Wingspan : "
                    + AvgWingSpan;

            return outString;
        };
        System.out.println(allaboutParrots.dispParrot3("Green", "Mitthu", 2, 2, 1.7, 25.5));
    }
}

interface ParrotDet {
    public String dispParrot();
}

interface ParrotDet2 {
    public String dispParrot2(String Breed);
}

interface ParrotDet3 {
    public String dispParrot3(String Color, String PetName, int Legs, int wings, double AvgWeight, double AvgWingSpan);
}

class Parrot {
    public void dispInf() {
        System.out.println("\nParty Parrot : Party Hard!!!");
    }
}

//      * OUTPUT :
// PS C:\OOPSLab>javac.\Ass7.java
// PS C:\OOPSLab> java Ass7

// Party Parrot: Party Hard!!!

// Anonymous class for the quietest parrots in own!!!Pathetic!
// Quietest Parrots: Parrotlets

// Lambda expression for the best parrots in town!!!
// Cockatiels Party Hard!!!

// Lamest Parrots: Parrotlets

// Color of Parrot: Green
// PetName: Mitthu
// Number of Legs:
// Number of Wings:2
// Average Weight:1.7
// Average Wingspan:25.5
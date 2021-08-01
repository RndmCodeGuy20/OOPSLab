public class Human {
    String Name;
    String Gender;
    public static void main(String[] args) {
        
    Man AgeMan = new Man("Shantanu", "Male", 19);
    Woman AgeWoman = new Woman("Vaishali Mane", "Female", 45);

    Human displAge = new Human();
    displAge.find(AgeMan.RetAgeM(), AgeWoman.RetAgeW());
 
}

public void find(int AgeMan, int AgeWoman) {
        if (AgeMan > AgeWoman) {
            System.out.println("Age of MAN is MORE!");
        } else {
            System.out.println("Age of WOMAN is MORE!");
        }
    }

}

class Man extends Human{
    int AgeM;
    public Man(String Name, String Gend, int Age){
        AgeM = Age;
    }

    public int RetAgeM() {
        return AgeM;
    }
}

class Woman extends Human{
    int AgeW;
    public Woman(String Name, String Gend, int Age){
        AgeW = Age;
    }

    public int RetAgeW() {
        return AgeW;
    }
    

}
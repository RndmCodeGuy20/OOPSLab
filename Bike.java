// class Bike {
//     final int Age;

//     Bike(){
//         Age = 20;
//         System.out.println(Age);
//     }
//     public static void main(String[] args) {
//         Bike bikObject = new Bike();
//     }    
// }

public class Bike{

    
    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.run();
    }
}

class Honda extends Bike{
    public void run() {
        System.out.println("running...");
    }
}


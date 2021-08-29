/**
 * @author Shantanu Mane
 * @version 20.20
 * @brief Demonstrate use of run time polymorphism in the case of multilevel
 *        inheritance.
 * @RndmCodeGuy20
 */

public class RunTimePoly {
    public static void main(String[] args) {
        OS os = new OS("Operating Software");
        OS dos = new DOS("DOS");
        OS win = new Win("Windows OS");
        OS winMob = new WinMob("Windows OS for Mobile");

        os.feature();
        dos.feature();
        win.feature();
        winMob.feature();
    }
}

class OS {
    String Sys;

    OS(String Sys) {
        this.Sys = Sys;
    }
    
    public void feature() {
        System.out.println("Feature of " + Sys);
    }
}

class DOS extends OS {
    DOS(String Sys) {
        super(Sys);
        this.Sys = Sys;
    }
    @Override
    public void feature() {
        System.out.println("Feature of " + Sys);
    }
}

class Win extends DOS {
    Win(String Sys) {
        super(Sys);
    }
    @Override
    public void feature() {
        System.out.println("Feature of " + Sys);
    }
}

class WinMob extends Win {
    WinMob(String Sys) {
        super(Sys);
    }
    @Override
    public void feature() {
        System.out.println("Feature of " + Sys);
    }
}

// * OUTPUT
// PS C:\OOPSLab> javac .\RunTimePoly.java 
// PS C:\OOPSLab> java RunTimePoly
// Feature of Operating Software
// Feature of DOS
// Feature of Windows OS
// Feature of Windows OS for Mobile
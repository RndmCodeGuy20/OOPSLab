import java.lang.reflect.Method;

public class Play {
    public static void main(String[] args) {
        Play objParent = new Play();
        objParent.displayParent();
        
    }

    public void displayParent() {
        System.out.println("Parent Running");
    }
}

class PlayChild extends Play{
    /**
     * !Child class cannot access method of parent class.
     */
    // Play objChild = new Play(); 
    // objChild.displayParent();
    
    public void displayChild() {
        System.out.println("Child Running");
    }  
}
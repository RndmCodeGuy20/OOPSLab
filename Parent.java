public class Parent {
    public void DispP() {
        System.out.println("This is Parent Class!!!");
    }

    public static void main(String[] args) {
        Parent DispParent = new Parent();
        Child DispChild = new Child();

        System.out.println("1. Method of Parent Class by Object of Parent Class :- " + "\n" );
        DispParent.DispP();

        System.out.println("\n2. Method of Child Class by Object of Child Class :- " + "\n");
        DispChild.DispC();

        System.out.println("\n3. Method of Parent Class by Object of Child Class :- " + "\n");
        DispChild.DispP();
    }

    
}

class Child extends Parent {
    public void DispC() {
        System.out.println("This is Child Class!!!");
    }

}
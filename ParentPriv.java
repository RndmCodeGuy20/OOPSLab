public class ParentPriv {
    private void DispP() {
        System.out.println("This is Parent Class!!!");
    }

    public static void main(String[] args) {
        ParentPriv DispParent = new ParentPriv();
        ChildPriv DispChild = new ChildPriv();

        System.out.println("1. Method of Parent Class by Object of Parent Class :- " + "\n");
        DispParent.DispP();

        System.out.println("\n2. Method of Child Class by Object of Child Class :- " + "\n");
        DispChild.DispC();
    }

}

class ChildPriv extends ParentPriv {
    public void DispC() {
        System.out.println("This is Child Class!!!");
    }

}
public class SuperDemo {
    public static void main(String[] args) {
        //A11 objA = new A11();
        B11 objB = new B11();
        B11 objBparam = new B11(9);
    }   
}

class A11{
    public A11() {
        System.out.println("A11 Printed");
    }
    
    public A11(int i) {
        System.out.println("A11 Printed with param");
    }
}

class B11 extends A11{
    
    public B11() {
        super(1);
        System.out.println("B11 Printed");
    }
    public B11(int i){
        super(1);
        System.out.println("B11 with param");
    }
}
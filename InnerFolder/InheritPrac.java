package InnerFolder;
public class InheritPrac {
    public static void main(String[] args) {
        Child objChild = new Child();
        Child objChildPar = new Child(69); 
    }
}

class Parent {
    public Parent(){
        System.out.println("Parent Accessed!");
    }
    
    public Parent(int i){
        System.out.println("69 Madafacka! Parent Edition!");
    }
}

class Child extends Parent{
    public Child(){
        super(420);
        System.out.println("Child Accessed!");
    }

    public Child(int i) {
        super();
        System.out.println("69 Madafacka! Child Ed... Oh shit!");
    }
}
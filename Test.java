class Studentinfo {
    int Roll;
    String Name;
    float Fee;

    Studentinfo(int Roll, String Name, float Fee) {
        this.Roll = Roll;
        this.Name = Name;
        this.Fee = Fee;
    }

    void display() {
        System.out.println(Roll + " " + Name + " " + Fee);
    }
}

/**
 * *Test
 */
class Test {

    public static void main(String[] args) {
        Studentinfo S1 = new Studentinfo(1, "shantanu", 10000);
        S1.display();
    }
}
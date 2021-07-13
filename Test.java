class Student {
    int Roll;
    String Name;
    float Fee;

    Student(int Roll, String Name, float Fee) {
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
        Student S1 = new Student(1, "shantanu", 10000);
        S1.display();
    }
}
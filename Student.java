public class Student {

    String Name;
    int Roll;
    public static void main(String[] args) {
        Student info = new Student();
        info.Name = "John";
        info.Roll = 2;

        System.out.println("Name is " + info.Name + "\n" + "Roll no. is " + info.Roll);

    }
}

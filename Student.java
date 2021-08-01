public class Student {

    String Name;
    int Roll;
    double Marks;
    public static void main(String[] args) {
       MyRecord studObj = new MyRecord();
       studObj.display("Shantanu Mane", 85, 98.05);     

    }
}

class MyRecord extends Student{
    public void display(String Name, int Roll, double Marks) {
        System.out.println("Name of student : " + Name + "\n\n" + "Roll Number of Student : " + Roll + "\n\n" + "Marks obtained by the student : " + Marks + "\n\n");
    }
}
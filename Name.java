public class Name {
    public static void main(String[] args) {
        Student dispStud = new Student();
        dispStud.NamebyUser = "Shantanu";

        System.out.println("Name is Given : " + dispStud.NamebyUser);
        System.out.println("Name is NOT Given : " + dispStud.Name);
    }
}

class Student {
    String NamebyUser;
    String Name;

    public Student(){
        Name = "Unknown";
    }

    public Student(String InputName){
        Name = InputName;
    }
}
import java.util.Scanner;

class Posting {
    float Coursework_Test, Apitude_Test, Techcical_Test, Personal_Interview;

    float judge(float Coursework_Test, float Apitude_Test, float Technical_Test, float Personal_Interview) {
        this.Coursework_Test = Coursework_Test;
        this.Apitude_Test = Apitude_Test;
        this.Techcical_Test = Technical_Test;
        this.Personal_Interview = Personal_Interview;
        return this.Coursework_Test + this.Apitude_Test + this.Techcical_Test + this.Personal_Interview * 100 / 400;
    }

    float judge(float Technical_Test, float Personal_Interview) {
        this.Techcical_Test = Technical_Test;
        this.Personal_Interview = Personal_Interview;
        return this.Techcical_Test + this.Personal_Interview * 100 / 200;
    }

    float judge(float Personal_Interview) {
        this.Personal_Interview = Personal_Interview;
        return this.Personal_Interview;
    }
}

class Programmer extends Posting {
    void Display() {
        System.out.println("The programmer information is given as below");
        System.out.println("The result for Coursework is :" + super.Coursework_Test + " out of 100");
        System.out.println("The result for Apitude is :" + super.Apitude_Test + " out of 100");
        System.out.println("The result for Technical Test is :" + super.Techcical_Test + " out of 100");
        System.out.println("The result for Personal Interview is :" + super.Personal_Interview + " out of 100");
    }

    void Display(float result) {
        if (result >= 80) {
            System.out.println("Congratulations you have passed and selected for posting of programmer");
        } else {
            System.out.println("Sorry you are not selected as programmer");
        }
    }
}

class TeamLeader extends Posting {
    void Display() {
        System.out.println("The Team leader information is given as below");
        System.out.println("The result for Technical Test is :" + super.Techcical_Test + " out of 100");
        System.out.println("The result for Personal Interview is :" + super.Personal_Interview + " out of 100");
    }

    void Display(float result) {
        if (result >= 85) {
            System.out.println("Congratulations you have passed and selected for posting of Team Leader");
        } else {
            System.out.println("Sorry you are not selected as Team Leader");
        }
    }
}

class Manager extends Posting {
    void Display() {
        System.out.println("The Project Manager information is given as below");
        System.out.println("The result for Personal Interview is :" + super.Personal_Interview + " out of 100");
    }

    void Display(float result) {
        if (result >= 90) {
            System.out.println("Congratulations you have passed and selected for posting of Project Manager");
        } else {
            System.out.println("Sorry you are not selected as Team Leader");
        }
    }
}

public class PostingDemo {
    public static void main(String[] args) {
        int com;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for programmer 2 for Team Leader 3 For Manager");
        com = sc.nextInt();
        if (com == 1) {
            Programmer pro = new Programmer();
            float result;
            result = pro.judge(70, 80, 90, 60);
            pro.Display();
            pro.Display(result);
        } else if (com == 2) {
            TeamLeader tl = new TeamLeader();
            float result;
            result = tl.judge(92, 82);
            tl.Display();
            tl.Display(result);
        } else if (com == 3) {
            Manager man = new Manager();
            float result;
            result = man.judge(90);
            man.Display();
            man.Display(result);
        } else {
            System.out.println("Enter valid command");
        }

    }
}
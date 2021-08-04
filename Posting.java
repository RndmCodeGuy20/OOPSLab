public class Posting {

    int CourseWork;
    int Technical;
    int Aptitude;
    int PersonalInt;
    
    public static void main(String[] args) {
        Programmer Pro = new Programmer();
        TeamLead tLead = new TeamLead();
        ProjMan ProMan = new ProjMan();
        Calculation Calc = new Calculation();

        int TotalPro = Calc.Judge(24, 43, 23, 75);
        int TotalTeam = Calc.Judge(45, 80);
        int TotalMan = Calc.Judge(89);

        Pro.DispResP(TotalPro);
        tLead.DispRes(TotalTeam);
        ProMan.DispRes(TotalMan);
        
    }
}

class Programmer extends Posting{
    final int TotalMarks = 200;
    
    public void DispResP(int CandTotal) {
        if (CandTotal >= 80) {
            System.out.println("Congratulations You are eligible for the job as a Programmer!!!" + "\nYour Marks are : " + CandTotal);
        } else {
            System.out.println("Sorry You are not Eligible!!!" + "\nYour Marks are : " + CandTotal);
        }
    }
}

class TeamLead extends Posting{
    final int TotalMarks = 150;

    public void DispRes(int CandTotal) {
        if (CandTotal >= 85) {
            System.out.println("Congratulations You are eligible for the job as a Team Leader!!!" + "\nYour Marks are : " + CandTotal);
        } else {
            System.out.println("Sorry You are not Eligible!!!" + "\nYour Marks are : " + CandTotal);
        }
    }
}

class ProjMan extends Posting{
    final int TotalMarks = 100;
   
    public void DispRes(int CandTotal) {
        if (CandTotal >= 90) {
            System.out.println("Congratulations You are Eligible for the job as a Project Manager!!!" + "\nYour Marks are : " + CandTotal);
        } else {
            System.out.println("Sorry You are not Eligible!!!" + "\nYour Marks are : " + CandTotal);
        }   
    }
}

class Calculation extends Posting{
    public int Judge(int CourseWork, int Technical, int Aptitude, int Personal) {
        return (CourseWork + Technical + Aptitude + Personal);
    }
    
    public int Judge(int Technical, int Personal) {
        return (Technical + Personal);
    }
    
    public int Judge(int Personal) {
        return Personal;
    }
}
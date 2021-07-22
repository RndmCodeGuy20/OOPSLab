import java.lang.reflect.Method;

public class Play {
    public static void main(String[] args) {
        PlayChild objChild = new PlayChild();
        objChild.setdata(24);
        objChild.num2 = 23;
        objChild.disp();
    }
}

class PlayParent{
     private int num1;
     public void setdata(int n) {
         num1 = n;
     }

     public int getdata() {
         return num1;
     }
}

class PlayChild extends PlayParent{
    public Object disp;
    int num2;

    public void disp() {
        int num;
        num = getdata();
        System.out.println("Private num multiplication " + num*num2);
    }
}
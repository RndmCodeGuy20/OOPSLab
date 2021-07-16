public class InheritDemo {
    public static void main(String[] args) {
        CalcDivAdv arith = new CalcDivAdv();
        int resultadd = arith.add(23, 45);
        int resultsub = arith.sub(45, 32);
        int resultmul = arith.mul(56, 74);
        double resultdiv = arith.div(124.8475, 5.28756);
        System.out.println(resultadd + " " + resultsub + " " + resultmul + " " + resultdiv);
    }
}

class Calculator {
    public int add(int i, int j){
        return i + j;
    }
}

class CalcAdv extends Calculator{
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdv extends CalcAdv{
    public int mul(int i, int j) {
        return i * j;
    }
}

class CalcDivAdv extends CalcVeryAdv{
    public double div(double i, double j) {
        return i/j;
    }
}
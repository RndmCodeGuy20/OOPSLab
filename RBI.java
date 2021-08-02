public class RBI{
    public int getRateOfInterest(){
        return 0;
    }
    public static void main(String[] args) {
        SBI S = new SBI();
        ICICI I = new ICICI();
        Axis A = new Axis();

        System.out.println("Rate of Interest at SBI : " + S.getRateOfInterest());
        System.out.println("Rate of Interest at ICICI : " + I.getRateOfInterest());
        System.out.println("Rate of Interest at Axis : " + A.getRateOfInterest());

    }
}

class SBI extends RBI{
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends RBI {
    @Override
    public int getRateOfInterest() {
        return 9;
    }
}

class Axis extends RBI{
    @Override
    public int getRateOfInterest() {
        return 10;
    }
}
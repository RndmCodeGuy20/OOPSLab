public class Zoo {
    public static void main(String[] args) {
        Dog datadDog = new Dog();
        Bird databBird = new Bird();
        datadDog.setdata(4);
        databBird.setdata(2);
        databBird.printbird();
        datadDog.printdog();
    }
}

class Animal{
    private int numoflegs;
    public int numofeyes=2;

    public void setdata(int num) {
        numoflegs = num;
    }

    public int getdatalegs() {
        return numoflegs;
    }

    public int getdataeyes() {
        return numofeyes;
    }
}

class Bird extends Animal{
    int nleg,neye;
    public void printbird() {
        nleg = getdatalegs();
        neye = getdataeyes();

        System.out.println("Bird has "+ nleg + " legs " + neye + " eyes.");
    }
}

class Dog extends Bird{
    int nleg, neye;
    public void printdog() {
        nleg = getdatalegs();
        neye = getdataeyes();
        System.out.println("Dog has " + nleg + " legs " + neye + " eyes.");
    }
}
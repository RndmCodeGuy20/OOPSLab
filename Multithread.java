public class Multithread extends Thread {
    public void run() {
        System.out.println("Run1 is Running...");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    /**
     * - run() method is not user defined, rather it is an abstract method from Thread{} class
     * @param args
     */
    public static void main(String[] args) {
        Multithread m1 = new Multithread();
        m1.start();

        Multithread m2 = new Multithread();
        m2.start();
    }
}
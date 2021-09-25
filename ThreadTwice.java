public class ThreadTwice extends Thread {
    public void run() {
for (int i = 0; i < 10; i++) {
    System.out.println(i*10);
}    }

    public static void main(String args[]) {
        ThreadTwice t1 = new ThreadTwice();
        t1.start();
        t1.start();
        t1.run();
    }
}

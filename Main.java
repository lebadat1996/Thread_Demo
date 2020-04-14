package ThreadEasy;

public class Main {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo1 =new ThreadDemo();
        Thread t1 = new Thread(threadDemo);
        Thread t2 = new Thread(threadDemo1);
        t1.start();
        t1.setPriority(1);
        t2.start();
    }
}

package ThreadEasy;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.print(i+ " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
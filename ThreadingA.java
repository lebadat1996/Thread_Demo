package ThreadEasy;

public class ThreadingA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.print("A" + i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

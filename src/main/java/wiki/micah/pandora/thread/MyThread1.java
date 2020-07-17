package wiki.micah.pandora.thread;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-17
 */
public class MyThread1 extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread end");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}

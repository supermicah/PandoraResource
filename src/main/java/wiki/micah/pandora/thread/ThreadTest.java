package wiki.micah.pandora.thread;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-13
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new MyThread1();
        t.start();
        System.out.println("main is end");

        // myThread Test
//        Thread thread = new MyThread1();
//        Thread t1 = new Thread(thread);
//        Thread t2 = new Thread(thread);
//        Thread t3 = new Thread(thread);
//        Thread t4 = new Thread(thread);
//        Thread t5 = new Thread(thread);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
    }


}

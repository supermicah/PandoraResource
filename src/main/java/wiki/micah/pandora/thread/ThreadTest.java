package wiki.micah.pandora.thread;

/**
 * @author micah
 * @version 0.0.1
 * @since 2020-07-13
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        aaa();
    }

    private static void aaa(){
        System.out.println(Thread.currentThread().getName());
    }
}

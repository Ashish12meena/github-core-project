package Thread;

public class NewMain {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        });

        t.start();
        t.interrupt(); // Interrupt the thread
        System.out.println("hello");

        Thread t1 = new Thread(() -> System.out.println(" runnit1ng"));
        t1.start();
        System.out.println(t1.isAlive()); // True if the thread is still running

        Thread t3 = Thread.currentThread();
        System.out.println("Current thread: " + t3.getName());

    }

}

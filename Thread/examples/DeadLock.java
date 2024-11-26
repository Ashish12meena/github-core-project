package Thread.examples;

class DeadThread1 extends Thread {
    private String name3 = "Resource 1";
    private String name4 = "Resource 2";

    // private String name3 = new String("Resource 1"); // Different object
    // private String name4 = new String("Resource 2"); // Different object

    @Override
    public void run() {
        System.out.println("at run method thread1 start");
        // synchronized block
        synchronized (name3) {
            System.out.println("Thread 1 holding : " + name3);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
            // synchronized block
            synchronized (name4) {
                System.out.println("Thread 1 holding : " + name4);
                // end
            }
            // end
        }
        System.out.println("at run method thread1 end");
    }
}

class DeadThread2 extends Thread {
    private String name1 = "Resource 1";
    private String name2 = "Resource 2";
    // private String name1 = new String("Resource 1"); // Different object
    // private String name2 = new String("Resource 2"); // Different object

    public void run() {
        System.out.println("at run method thread2 start");
        // synchronized block
        synchronized (name2) { // name1
            System.out.println("Thread 2 holding : " + name2);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            // synchronized block
            synchronized (name1) { // name2
                System.out.println("Thread 2 holding : " + name1);
            }
        }
        System.out.println("at run method thread2 end");
    }
}

public class DeadLock {
    public static void main(String[] args) {
        DeadThread1 d1 = new DeadThread1();
        DeadThread2 d2 = new DeadThread2();
        d1.start();
        d2.start();

        System.out.println("d1: " + d1.getState());
        System.out.println("d2: " + d2.getState());

        try {
            Thread.sleep(1000);
            System.out.println("d1: " + d1.getState());
            System.out.println("d2: " + d2.getState());
            Thread.sleep(2000);
            System.out.println("d1: " + d1.getState());
            System.out.println("d2: " + d2.getState());
            d1.join();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

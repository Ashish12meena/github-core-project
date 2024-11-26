package Thread;

public class Blockedthread {
    synchronized void lockedMethod() {
        System.out.println(Thread.currentThread().getName() + " acquired the lock.");
        try {
            Thread.sleep(3000);  // Hold the lock for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " released the lock.");
    }
}

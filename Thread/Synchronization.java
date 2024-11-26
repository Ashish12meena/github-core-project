package Thread;
class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName()+" "+count);
    }

    public int getCount() {
        return count;
    }
}


public class Synchronization {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) 
            // System.out.println("Thread1 "+counter.getCount());
            counter.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) 
            // System.out.println("Thread2 "+counter.getCount());
            counter.increment();
        });

        t1.start();
        t2.start();

        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}
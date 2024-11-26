package Thread.examples;
class SharedResource
{
    public synchronized void accessResource()
    {
        System.out.println(Thread.currentThread().getName() + " has acquired the lock and is executing.");
        try
        {
            // sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has released the lock.");
    }
}
class Task implements Runnable {
    private final SharedResource sharedResource;

    public Task(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.accessResource();
    }
}
public class BlockedState {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Task task = new Task(sharedResource);
        Task task1 = new Task(sharedResource);

        Thread thread1 = new Thread(task,"thread-1");
        Thread thread2 = new Thread(task1,"thread-2");
        try {
            thread1.start();
            Thread.sleep(1000);
            System.out.println("thread 1 state = "+thread1.getState());
            thread2.start();
            //
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread 1 state = "+thread1.getState());
        System.out.println("thread 2 state = "+thread2.getState());

    }
}

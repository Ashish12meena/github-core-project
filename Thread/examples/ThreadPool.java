package Thread.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NewTask implements Runnable{
    private final int taskId;

    public NewTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate some work with a delay
        } catch (InterruptedException e) {
            System.err.println("Task " + taskId + " was interrupted");  
        }
        System.out.println("Task " + taskId + " completed "+Thread.currentThread().getName());
    }
}
public class ThreadPool {
    public static void main(String[] args) {
          // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);

        // Submit 5 tasks to the executor service
        for (int i = 1; i <= 10; i++) { 
            executorService.submit(new NewTask(i));
        }
        for (int i = 11; i <= 17; i++) {
            executorService2.submit(new NewTask(i));
        }
        // Shut down the executor service after tasks are completed
        executorService.shutdown();
        executorService2.shutdown();
    }
}

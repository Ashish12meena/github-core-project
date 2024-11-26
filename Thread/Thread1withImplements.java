package Thread;
public class Thread1withImplements extends ThreadTest {
    public static void main(String[] args) {
        //implementing Runnable 
       /*  Thread threadtest = new Thread(new ThreadTest());
        threadtest.start();*/

        //extending Thread
      /*Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        thread1.start();
        thread2.start();
        System.out.println(thread1.getState());
        System.out.println(thread2.getState()); */


        //Thread lifeCycle
        // New State
        // Thread t = new Thread(()->{System.out.println("Thread started");});
        // System.out.println(t.getState());

        //Runnable state
        // Thread t1 = new Thread(() -> {
        //     for (int i = 0; i < 3; i++) {
        //         System.out.println("Thread is running: " + i);
        //     }
        // });
        // t1.start();
        // System.out.println(t1.getState());


        //Blocked State
       /*  Blockedthread blockedthread = new Blockedthread();
        Thread t4 = new Thread(()->{blockedthread.lockedMethod();});
        Thread t5 = new Thread(()->{blockedthread.lockedMethod();});

        t4.start();
        t5.start(); 
        try {
            Thread.sleep(50);  // Ensure t5 has tried to acquire the lock
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t2 state: " + t5.getState());  // Expect BLOCKED state */

        // Waiting State
       /*  Thread t6 = new Thread(()->{
            try {
                synchronized (Thread.currentThread()){
                    Thread.currentThread().wait(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t6.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t6.getState());*/

        // Timed Waiting State
      /*   Thread t7 = new Thread(()->{
            try {
                synchronized (Thread.currentThread()){
                    Thread.currentThread().wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t7.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t7.getState());
        */

       

    }
}
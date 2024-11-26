package Thread.examples;

class DaemonThreadExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("user thread work");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        DaemonThreadExample t2 = new DaemonThreadExample();
        DaemonThreadExample t3 = new DaemonThreadExample();
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            
        }
         t2.start();
        t3.start();
    }
}
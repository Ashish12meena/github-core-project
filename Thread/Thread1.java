package Thread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("In thread 1");
       
        System.out.println("In thread 1 state "+Thread.currentThread().getState());
    }
}

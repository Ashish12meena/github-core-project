package Thread;

public class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("In thread2");
        System.out.println("In thread 2 state "+Thread.currentThread().getState());
    }
}

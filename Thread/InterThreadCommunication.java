package Thread;

class Q{
    int num;
    boolean valueSet = false;

    public synchronized void put(int num){
        while (valueSet) {
            try { wait();} catch (InterruptedException e) {e.printStackTrace();   }
        }
            System.out.println("put: "+  num);
            this.num = num;
            valueSet = true;
            notify();
    }
    public synchronized void get(){
        while (!valueSet) {
            try { wait();} catch (InterruptedException e) {e.printStackTrace();   }
        }
        System.out.println("Get: "+num); 
        valueSet= false;
        notify();
    }
}
class Producer implements Runnable{
    Q q;

    public  Producer(Q q){
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    @Override
    public void run() {
      int i =0; 
      while (i<20) {
        q.put(i++);
        try { Thread.sleep(1000); } catch (Exception e) {  }
      }
    }
}
class Consumer implements Runnable{
    Q q;

    public  Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run() { 
        int i=0;
      while (i<20) {
        q.get();
        i++;
        try { Thread.sleep(1000); } catch (Exception e) {  }
      }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
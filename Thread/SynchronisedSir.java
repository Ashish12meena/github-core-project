package Thread;
class Bus implements Runnable {
    int available = 1;
    int passenger;
    Bus(int pass){
        this.passenger = pass;
    }
    public synchronized void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        if(available >= passenger)
        {
            System.out.println(name+" Reserved seat");
            try
            {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            available = available - passenger;
        }
        else
        {
            System.out.println(name+" sorry not Reserved seat");
        }
    }
}  
public class SynchronisedSir {
    public static void main(String[] args) {
        Bus b =new Bus(1);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        t1.setName("vakul");
        t3.setName("vikash");
        t2.setName("manoj");  
        
        t2.start();
        t1.start();
        t3.start();
        try
        {
            Thread.sleep(200);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("vakul: "+t1.getState());
        System.out.println("manoj: "+t2.getState());
        System.out.println("vikash: "+t3.getState());   
    }
}

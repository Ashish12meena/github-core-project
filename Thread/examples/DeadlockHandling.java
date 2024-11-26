package Thread.examples;
 class resource1 {
    private int i = 10;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
 class resource2 {
    private int i = 20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
public class DeadlockHandling {
    public static void main(String ar[]) {
        // DeadlockHandling test = new DeadlockHandling();

        // final resource1 a = test.new  resource1();
        // final resource2 b = test.new resource2();

       final resource1 a = new resource1();
       final resource2 b = new resource2();

        // Thread-1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (b) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a) {
                        System.out.println("In block 1");
                    }
                }
            }
        };
        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (b) {
                    // Thread-2 have resource2 but need resource1 also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };
        new Thread(b1).start();
        new Thread(b2).start();
    }
    // private class resource1 {
    //     private int i = 10;

    //     public int getI() {
    //         return i;
    //     }

    //     public void setI(int i) {
    //         this.i = i;
    //     }
    // }
    // private class resource2 {
    //     private int i = 20;

    //     public int getI() {
    //         return i;
    //     }    

    //     public void setI(int i) {
    //         this.i = i;
    //     }
    // }
   
}

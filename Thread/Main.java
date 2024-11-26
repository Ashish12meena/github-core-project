// package Thread;

// class BlockedExample {
//     // Synchronized method - only one thread can access it at a time
//     synchronized void lockedMethod() {
//         System.out.println(Thread.currentThread().getName() + " acquired the lock.");
//         try {
//             Thread.sleep(3000);  // Hold the lock for 3 seconds
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         System.out.println(Thread.currentThread().getName() + " released the lock.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BlockedExample obj = new BlockedExample();  // Shared object

//         // Thread 1 will acquire the lock and sleep inside lockedMethod()
//         Thread t1 = new Thread(obj::lockedMethod, "Thread-1");

//         // Thread 2 will attempt to acquire the same lock and be blocked
//         Thread t2 = new Thread(obj::lockedMethod, "Thread-2");

//         t1.start();  // Start thread 1 - it will hold the lock first

//         // Add a slight delay to ensure t1 acquires the lock first
//         try {
//             Thread.sleep(100);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         t2.start();  // Start thread 2 - it will get blocked

//         // Print the state of t2 after it's likely blocked
//         try {
//             Thread.sleep(50);  // Ensure t2 has tried to acquire the lock
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("t2 state: " + t2.getState());  // Expect BLOCKED state
//     }
// }


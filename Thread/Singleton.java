package Thread;

public class Singleton {

    // Private constructor to prevent instantiation.
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Static inner class responsible for holding the Singleton instance.
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Global access point to the instance.
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
    // Main method to test the Singleton.
    public static void main(String[] args) {
        // Trying to access the Singleton instance.
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Showing a message using the Singleton instance.
        obj1.showMessage();

        // Checking if both references point to the same instance.
        System.out.println("Are both objects the same? " + (obj1 == obj2));
    }
}
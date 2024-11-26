
// PaymentProcessor.java
 interface PaymentProcessor {
    void processPayment(double amount);
    void refundPayment(double amount);
}
// CreditCardProcessor.java
 class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Actual implementation to process credit card payment
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding credit card payment of $" + amount);
        // Actual implementation to refund credit card payment
    }
}



public class Generic {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
       creditCardProcessor.processPayment(900);
       creditCardProcessor.refundPayment(933);
    }
}

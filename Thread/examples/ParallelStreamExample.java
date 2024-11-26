package Thread.examples;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Generate a list of random product prices
        List<Double> prices = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 1_000_000; i++) {
            prices.add(100 + (10_000 - 100) * random.nextDouble()); // Prices between 100 and 10,000
        }
        
        double priceThreshold = 1000.0; // Set a threshold
        double discountRate = 0.10;     // 10% discount
        
        // Using a parallel stream to process the data
        double totalDiscountedPrice = prices.parallelStream()
            .filter(price -> price > priceThreshold) // Step 1: Filter
            .map(price -> price * (1 - discountRate)) // Step 2: Apply discount
            .reduce(0.0, Double::sum);               // Step 3: Sum all discounted prices
        
        System.out.println("Total discounted price for products over $" + priceThreshold + ": $" + totalDiscountedPrice);
    }
}

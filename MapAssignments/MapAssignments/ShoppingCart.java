import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();
        // 1. Add products in order
        cart.put("Laptop", 45000.0);
        cart.put("Phone", 12000.0);
        cart.put("Headphones", 1500.0);

        // 2. Display products in insertion order
        System.out.println("Cart contents (in insertion order):");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 3. Calculate total
        double total = 0;
        for (double p : cart.values()) total += p;
        System.out.println("Total: " + total);

        // 4. Apply discount if total > 5000
        if (total > 5000) {
            total = total * 0.9;
            System.out.println("Discount applied. New total: " + total);
        }

        // 5. Remove item (simulate quantity 0)
        cart.remove("Headphones");
        System.out.println("After removal:");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

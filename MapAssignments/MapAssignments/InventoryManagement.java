import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        // 1. Add new products
        stock.put("Soap", 20);
        stock.put("Shampoo", 5);
        stock.put("Toothpaste", 0);
        stock.put("Chips", 12);

        // Customer buys 3 Shampoo
        sell(stock, "Shampoo", 3);
        // Customer buys 10 Chips
        sell(stock, "Chips", 10);
        // Shipment arrives for Toothpaste +15
        restock(stock, "Toothpaste", 15);
        // Query product
        query(stock, "Soap");
        query(stock, "Biscuits");

        // Print out of stock products
        System.out.println("\nOut of stock products:");
        for (Map.Entry<String, Integer> e : stock.entrySet()) {
            if (e.getValue() == null || e.getValue() <= 0) {
                System.out.println(e.getKey());
            }
        }
    }

    static void sell(Map<String, Integer> stock, String product, int qty) {
        if (!stock.containsKey(product)) {
            System.out.println(product + " is not stocked.");
            return;
        }
        int newQty = stock.get(product) - qty;
        if (newQty <= 0) {
            stock.put(product, 0);
            System.out.println(product + " is now out of stock.");
        } else {
            stock.put(product, newQty);
            System.out.println("Sold " + qty + " of " + product + ". Remaining: " + newQty);
        }
    }

    static void restock(Map<String, Integer> stock, String product, int qty) {
        int newQty = stock.containsKey(product) ? stock.get(product) + qty : qty;
        stock.put(product, newQty);
        System.out.println("Restocked " + product + ". New qty: " + newQty);
    }

    static void query(Map<String, Integer> stock, String product) {
        if (!stock.containsKey(product)) {
            System.out.println(product + ": not stocked");
        } else {
            System.out.println(product + ": " + stock.get(product) + " units");
        }
    }
}

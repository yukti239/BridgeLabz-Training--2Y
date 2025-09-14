import java.util.ArrayList;
import java.util.List;

class CartItem {
    String itemName;
    double price;
    int quantity;
    
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    double totalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    List<CartItem> cart = new ArrayList<>();
    
    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }
    
    void removeItem(CartItem item) {
        cart.remove(item);
        System.out.println(item.itemName + " removed from cart.");
    }

    void displayTotal() {
        double total = 0;
        for (CartItem item : cart) total += item.totalCost();
        System.out.println("Total cost: " + total);
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartItem item1 = new CartItem("Book", 200, 2);
        CartItem item2 = new CartItem("Pen", 10, 5);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayTotal();
        cart.removeItem(item2);
        cart.displayTotal();
    }
}
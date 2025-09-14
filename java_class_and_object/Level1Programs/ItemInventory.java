public class ItemInventory {
    String itemCode;
    String itemName;
    double price;
    
    ItemInventory(String code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }
    
    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost for " + quantity + " items: " + (price * quantity));
    }
    
    public static void main(String[] args) {
        ItemInventory item = new ItemInventory("I101", "Laptop", 45000);
        item.displayDetails(2);
    }
}
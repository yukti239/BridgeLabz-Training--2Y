public class GroceryMain {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Apples", 2, 3),
            new Product("Milk", 1, 2)
        };
        Customer customer = new Customer("Alice", products);
        BillGenerator bg = new BillGenerator();
        double total = bg.generateBill(customer);
        System.out.println("Customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            System.out.println(p.getName() + " (" + p.getQuantity() + " units at $" + p.getPricePerUnit() + " per unit): $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + total);
    }
}
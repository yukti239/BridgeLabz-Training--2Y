import java.util.*;

class Product {
    String name;
    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) {
        products.add(p);
    }
}

class CustomerE {
    String name;
    CustomerE(String name) {
        this.name = name;
    }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }
}

public class SelfProblem4_EcommercePlatform {
    public static void main(String[] args) {
        CustomerE c = new CustomerE("Eve");
        Order o = new Order();
        Product p1 = new Product("Laptop");
        o.addProduct(p1);
        c.placeOrder(o);
        System.out.println("E-commerce platform demo complete");
    }
}
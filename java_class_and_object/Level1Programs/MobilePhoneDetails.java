public class MobilePhoneDetails {
    String brand;
    String model;
    double price;
    
    MobilePhoneDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        MobilePhoneDetails phone = new MobilePhoneDetails("Samsung", "Galaxy S21", 70000);
        phone.displayDetails();
    }
}
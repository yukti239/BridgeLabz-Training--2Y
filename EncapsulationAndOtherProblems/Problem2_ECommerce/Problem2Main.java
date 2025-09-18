import java.util.*;
public class Problem2Main {
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        list.add(new Electronics("E001","Laptop",60000));
        list.add(new Clothing("C001","TShirt",800));
        list.add(new Groceries("G001","Rice",1200));
        for(Product p: list){
            double tax = (p instanceof Taxable)? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName()+" Final Price: "+finalPrice);
        }
    }
}

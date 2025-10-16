import java.util.*;
class Product{
 String name;
 double price;
 double rating;
 double discount;
 Product(String n,double p,double r,double d){name=n;price=p;rating=r;discount=d;}
 public String toString(){return name+" | price:"+price+" | rating:"+rating+" | disc:"+discount;}
}
public class CustomSortEcommerce{
 public static void main(String[] args){
  List<Product> products = new ArrayList<>();
  products.add(new Product("Phone",699.99,4.5,10));
  products.add(new Product("Headphone",199.99,4.7,25));
  products.add(new Product("Laptop",1299.50,4.3,15));
  System.out.println("Original:");
  products.forEach(System.out::println);
  products.sort(Comparator.comparingDouble(p->p.price));
  System.out.println("\nSorted by price:");
  products.forEach(System.out::println);
  products.sort(Comparator.comparingDouble(p->-p.rating));
  System.out.println("\nSorted by rating (desc):");
  products.forEach(System.out::println);
  products.sort(Comparator.comparingDouble(p->p.discount));
  System.out.println("\nSorted by discount:");
  products.forEach(System.out::println);
 }
}

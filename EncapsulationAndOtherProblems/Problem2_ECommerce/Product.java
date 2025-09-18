public abstract class Product {
    private String productId;
    private String name;
    private double price;
    public Product(String id,String name,double price){ this.productId=id; this.name=name; this.price=price; }
    public String getProductId(){ return productId; }
    public void setProductId(String id){ this.productId = id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getPrice(){ return price; }
    public void setPrice(double p){ this.price = p; }
    public abstract double calculateDiscount();
}

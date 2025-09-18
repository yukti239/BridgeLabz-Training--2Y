public class Clothing extends Product implements Taxable {
    public Clothing(String id,String name,double price){ super(id,name,price); }
    public double calculateDiscount(){ return getPrice()*0.2; }
    public double calculateTax(){ return getPrice()*0.05; }
    public String getTaxDetails(){ return "GST 5%"; }
}

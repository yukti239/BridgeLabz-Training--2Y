public class Electronics extends Product implements Taxable {
    public Electronics(String id,String name,double price){ super(id,name,pprice(price)); }
    private static double pprice(double price){ return price; }
    public double calculateDiscount(){ return getPrice()*0.1; }
    public double calculateTax(){ return getPrice()*0.18; }
    public String getTaxDetails(){ return "GST 18%"; }
}

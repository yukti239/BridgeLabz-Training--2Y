public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name,double price,int qty){ super(name,price,qty); }
    public double calculateTotalPrice(){ return getPrice()*getQuantity()+50; }
    public double applyDiscount(){ return getPrice()*0.05*getQuantity(); }
    public String getDiscountDetails(){ return "5% off per item"; }
}

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String name,double price,int qty){ super(name,price,qty); }
    public double calculateTotalPrice(){ return getPrice()*getQuantity(); }
    public double applyDiscount(){ return 0; }
    public String getDiscountDetails(){ return "No discount"; }
}

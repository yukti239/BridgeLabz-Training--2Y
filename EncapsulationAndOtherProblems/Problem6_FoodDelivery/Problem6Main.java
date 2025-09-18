public class Problem6Main {
    public static void main(String[] args){
        FoodItem v = new VegItem("Paneer Curry",200,2);
        FoodItem n = new NonVegItem("Chicken Fry",250,1);
        v.getItemDetails(); n.getItemDetails();
    }
}

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateCost(double dailyRate) {
        return rentalDays * dailyRate;
    }
}
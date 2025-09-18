public class Car extends Vehicle implements Insurable {
    public Car(String num,double rate){ super(num,"Car",rate); }
    public double calculateRentalCost(int days){ return getRentalRate()*days; }
    public double calculateInsurance(){ return 500; }
    public String getInsuranceDetails(){ return "Car Insurance"; }
}

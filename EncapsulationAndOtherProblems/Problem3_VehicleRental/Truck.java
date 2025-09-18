public class Truck extends Vehicle implements Insurable {
    public Truck(String num,double rate){ super(num,"Truck",rate); }
    public double calculateRentalCost(int days){ return getRentalRate()*days*1.5; }
    public double calculateInsurance(){ return 1000; }
    public String getInsuranceDetails(){ return "Truck Insurance"; }
}

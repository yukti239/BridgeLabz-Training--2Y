public class Bike extends Vehicle implements Insurable {
    public Bike(String num,double rate){ super(num,"Bike",rate); }
    public double calculateRentalCost(int days){ return getRentalRate()*days*0.6; }
    public double calculateInsurance(){ return 200; }
    public String getInsuranceDetails(){ return "Bike Insurance"; }
}

import java.util.*;
public class Problem3Main {
    public static void main(String[] args){
        List<Vehicle> vehicles = Arrays.asList(new Car("KA01-1234",2000), new Bike("KA02-5678",500), new Truck("KA03-9999",5000));
        for(Vehicle v: vehicles){
            System.out.println(v.getVehicleNumber()+" Rent for 3 days: "+v.calculateRentalCost(3));
            if(v instanceof Insurable) System.out.println(((Insurable)v).getInsuranceDetails()+" Cost: "+((Insurable)v).calculateInsurance());
        }
    }
}

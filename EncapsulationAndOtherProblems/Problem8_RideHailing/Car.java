public class Car extends Vehicle implements GPS {
    private String location = "Unknown";
    public Car(String id,String driver,double rate){ super(id,driver,rate); }
    public double calculateFare(double distance){ return getRatePerKm()*distance; }
    public String getCurrentLocation(){ return location; }
    public void updateLocation(String loc){ this.location = loc; }
}

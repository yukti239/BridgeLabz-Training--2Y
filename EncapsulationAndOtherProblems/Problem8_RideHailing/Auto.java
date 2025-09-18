public class Auto extends Vehicle implements GPS {
    private String location = "Unknown";
    public Auto(String id,String driver,double rate){ super(id,driver,rate); }
    public double calculateFare(double distance){ return getRatePerKm()*distance*0.8; }
    public String getCurrentLocation(){ return location; }
    public void updateLocation(String loc){ this.location = loc; }
}

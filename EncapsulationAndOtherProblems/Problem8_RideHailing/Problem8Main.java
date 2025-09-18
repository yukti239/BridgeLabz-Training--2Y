public class Problem8Main {
    public static void main(String[] args){
        Vehicle c = new Car("V001","Rahul",20);
        Vehicle b = new Bike("V002","Karan",10);
        Vehicle a = new Auto("V003","Suresh",12);
        System.out.println("Car fare 10km: "+c.calculateFare(10));
        System.out.println("Bike fare 10km: "+b.calculateFare(10));
        System.out.println("Auto fare 10km: "+a.calculateFare(10));
    }
}

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hours;
    public PartTimeEmployee(String id,String name,double baseSalary,double hourlyRate,int hours){
        super(id,name,baseSalary); this.hourlyRate = hourlyRate; this.hours = hours;
    }
    public double calculateSalary(){ return hourlyRate*hours; }
}

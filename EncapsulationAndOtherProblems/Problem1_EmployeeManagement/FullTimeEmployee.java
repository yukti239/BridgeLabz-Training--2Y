public class FullTimeEmployee extends Employee {
    private double fixedSalary;
    public FullTimeEmployee(String id,String name,double baseSalary,double fixedSalary){
        super(id,name,baseSalary); this.fixedSalary = fixedSalary;
    }
    public double calculateSalary(){ return fixedSalary; }
}

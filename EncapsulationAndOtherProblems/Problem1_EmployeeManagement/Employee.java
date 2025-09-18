public abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId; this.name = name; this.baseSalary = baseSalary;
    }
    public String getEmployeeId(){ return employeeId; }
    public void setEmployeeId(String id){ this.employeeId = id; }
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public double getBaseSalary(){ return baseSalary; }
    public void setBaseSalary(double s){ this.baseSalary = s; }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("ID: "+employeeId+" Name: "+name+" Salary: "+calculateSalary());
    }
}

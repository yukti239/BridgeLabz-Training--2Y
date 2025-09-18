import java.util.*;
public class Problem1Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("F001","Alice",0,50000));
        employees.add(new PartTimeEmployee("P001","Bob",0,200,80));
        for(Employee e: employees) e.displayDetails();
    }
}

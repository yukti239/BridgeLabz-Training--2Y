import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();
    Department(String name) {
        this.name = name;
    }
    void addEmployee(Employee e) {
        employees.add(e);
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();
    Company(String name) {
        this.name = name;
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
}

public class Problem3_CompanyAndDepartments {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("HR");
        Employee e1 = new Employee("John");
        d1.addEmployee(e1);
        c.addDepartment(d1);
        System.out.println("Company composition demo complete");
    }
}
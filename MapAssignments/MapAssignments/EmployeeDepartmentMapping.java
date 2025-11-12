import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        // 1. Add employees
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");

        // 2. Change department
        empDept.put(103, "IT"); // moved to IT

        // 3. Find all employees in a department (reverse lookup)
        System.out.println("Employees in IT:");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if ("IT".equals(e.getValue())) System.out.println(e.getKey());
        }

        // 4. Total employees per department (grouping)
        Map<String, Integer> count = new HashMap<>();
        for (String d : empDept.values()) {
            count.put(d, count.containsKey(d) ? count.get(d) + 1 : 1);
        }
        System.out.println("\nEmployees per department:");
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

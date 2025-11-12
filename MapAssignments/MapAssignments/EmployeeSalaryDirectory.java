import java.util.HashMap;
import java.util.Map;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 60000.0);
        salaries.put("Charlie", 75000.0);
        salaries.put("Dina", 45000.0);
        salaries.put("Ethan", 60000.0);
        salaries.put("Fiona", 80000.0);

        // Give raises
        giveRaise(salaries, "Alice", 10); // 10%
        giveRaise(salaries, "George", 5); // not found

        // Average salary
        double total = 0;
        for (double s : salaries.values()) total += s;
        double avg = total / salaries.size();
        System.out.println("Average salary: " + avg);

        // Highest-paid employee(s)
        double max = -1;
        for (double s : salaries.values()) if (s > max) max = s;
        System.out.println("Highest salary: " + max);
        System.out.println("Employee(s) with highest salary:");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            if (e.getValue() == max) System.out.println(e.getKey());
        }
    }

    static void giveRaise(Map<String, Double> salaries, String name, double percent) {
        if (!salaries.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        double old = salaries.get(name);
        double neu = old * (1 + percent/100.0);
        salaries.put(name, neu);
        System.out.println("Raised " + name + " from " + old + " to " + neu);
    }
}

import java.util.Map;
import java.util.TreeMap;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // keeps keys sorted
        // 1. Add students
        grades.put("Alice", 85.0);
        grades.put("Bob", 72.5);
        grades.put("Charlie", 90.0);
        grades.put("Diana", 68.0);

        // 2. Update grade (re-take)
        grades.put("Bob", 78.0); // update Bob

        // 3. Remove a student who dropped out
        grades.remove("Diana");

        // 4. Print students and grades in alphabetical order
        System.out.println("Student grades (alphabetical):");
        for (Map.Entry<String, Double> e : grades.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 12);
        courses.put("MA101", 52);
        courses.put("PH101", 3);
        courses.put("CS201", 49);

        // Add a student to CS102
        changeRegistration(courses, "CS102", +1);
        // Drop a student from MA101
        changeRegistration(courses, "MA101", -2);
        // Try to drop too many from PH101
        changeRegistration(courses, "PH101", -5);

        System.out.println("\nCourses near full (>=50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50) System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println("\nUnder-subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5) System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void changeRegistration(Map<String, Integer> courses, String code, int delta) {
        int current = courses.containsKey(code) ? courses.get(code) : 0;
        int updated = current + delta;
        if (updated < 0) updated = 0;
        courses.put(code, updated);
        System.out.println("Updated " + code + ": " + current + " -> " + updated);
    }
}

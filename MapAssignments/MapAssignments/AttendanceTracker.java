import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class AttendanceTracker {
    public static void main(String[] args) {
        String[] students = {"Alice","Bob","Charlie","Dina","Ethan"};
        Map<String, Integer> attendance = new HashMap<>();
        for (String s : students) attendance.put(s, 0);

        // Simulate 15 days; each day list of present students (random-ish)
        List<String>[] days = new List[15];
        days[0] = Arrays.asList("Alice","Bob","Charlie");
        days[1] = Arrays.asList("Alice","Dina","Ethan");
        days[2] = Arrays.asList("Bob","Charlie","Ethan");
        days[3] = Arrays.asList("Alice","Bob");
        days[4] = Arrays.asList("Alice","Charlie","Dina");
        days[5] = Arrays.asList("Bob","Ethan");
        days[6] = Arrays.asList("Alice","Charlie","Ethan");
        days[7] = Arrays.asList("Charlie","Dina");
        days[8] = Arrays.asList("Alice","Bob","Dina");
        days[9] = Arrays.asList("Alice","Ethan");
        days[10] = Arrays.asList("Bob","Charlie");
        days[11] = Arrays.asList("Alice","Charlie","Dina","Ethan");
        days[12] = Arrays.asList("Alice","Bob","Charlie");
        days[13] = Arrays.asList("Bob","Dina");
        days[14] = Arrays.asList("Alice","Ethan");

        for (List<String> present : days) {
            for (String name : present) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Attendance after 15 days:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nStudents present fewer than 10 days:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) System.out.println(e.getKey());
        }
    }
}

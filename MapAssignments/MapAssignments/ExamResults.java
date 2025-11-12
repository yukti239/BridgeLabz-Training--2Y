import java.util.HashMap;
import java.util.Map;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        // Add subjects and marks
        addScore(results, "Math", "Alice", 95);
        addScore(results, "Math", "Bob", 82);
        addScore(results, "Math", "Charlie", 88);

        addScore(results, "Physics", "Alice", 78);
        addScore(results, "Physics", "Bob", 91);
        addScore(results, "Physics", "Charlie", 85);

        addScore(results, "Chemistry", "Alice", 88);
        addScore(results, "Chemistry", "Bob", 72);
        addScore(results, "Chemistry", "Charlie", 93);

        // 2. Top scorer per subject
        System.out.println("Topper per subject:");
        for (Map.Entry<String, Map<String, Integer>> subj : results.entrySet()) {
            String topStudent = null;
            int topMark = -1;
            int total = 0;
            for (Map.Entry<String, Integer> e : subj.getValue().entrySet()) {
                total += e.getValue();
                if (e.getValue() > topMark) {
                    topMark = e.getValue();
                    topStudent = e.getKey();
                }
            }
            System.out.println(subj.getKey() + " -> " + topStudent + " (" + topMark + ")");
            // 3. average
            double avg = total / (double) subj.getValue().size();
            System.out.println("Average for " + subj.getKey() + ": " + avg);
        }

        // 4. Subjects with at least one student >90
        System.out.println("\nSubjects with a student scoring >90:");
        for (Map.Entry<String, Map<String, Integer>> subj : results.entrySet()) {
            boolean any = false;
            for (int mark : subj.getValue().values()) {
                if (mark > 90) { any = true; break; }
            }
            if (any) System.out.println(subj.getKey());
        }
    }

    static void addScore(Map<String, Map<String, Integer>> results, String subject, String student, int mark) {
        if (!results.containsKey(subject)) results.put(subject, new HashMap<String,Integer>());
        results.get(subject).put(student, mark);
    }
}

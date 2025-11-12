import java.util.HashMap;
import java.util.Map;

public class VotingCount {
    public static void main(String[] args) {
        String[] votes = {"Alice","Bob","Alice","Carlos","Bob","Alice","Bob","Carlos","Bob","Alice"}; // 10 votes
        Map<String, Integer> counts = new HashMap<>();
        for (String v : votes) {
            counts.put(v, counts.containsKey(v) ? counts.get(v) + 1 : 1);
        }
        System.out.println("Vote counts:");
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        // find highest
        String winner = null;
        int max = -1;
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + max + " votes.");
    }
}

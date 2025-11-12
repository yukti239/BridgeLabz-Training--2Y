import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        String[] visits = {"home","about","products","home","products","contact","home","products","about","home"};
        Map<String, Integer> counts = new HashMap<>();
        for (String p : visits) {
            counts.put(p, counts.containsKey(p) ? counts.get(p) + 1 : 1);
        }

        // Sorted by descending visit count
        List<Map.Entry<String,Integer>> list = new ArrayList<>(counts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> a, Map.Entry<String,Integer> b) {
                return b.getValue() - a.getValue();
            }
        });

        System.out.println("Pages by descending visits:");
        for (Map.Entry<String,Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Most visited page: " + list.get(0).getKey());
    }
}

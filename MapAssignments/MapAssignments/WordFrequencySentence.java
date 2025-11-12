import java.util.HashMap;
import java.util.Map;

public class WordFrequencySentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful.";
        Map<String, Integer> freq = new HashMap<>();
        String[] words = sentence.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase().split("\\s+");
        for (String w : words) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.containsKey(w) ? freq.get(w) + 1 : 1);
        }
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> cc = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        cc.put("India", "New Delhi");
        cc.put("France", "Paris");
        cc.put("Japan", "Tokyo");
        cc.put("Brazil", "Brasilia");
        cc.put("Canada", "Ottawa");
        cc.put("Australia", "Canberra");
        cc.put("Egypt", "Cairo");
        cc.put("Germany", "Berlin");

        // Example lookups
        lookup(cc, "India");
        lookup(cc, "Spain");

        // Print all countries alphabetically
        System.out.println("\nAll countries and capitals:");
        for (Map.Entry<String, String> e : cc.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void lookup(Map<String, String> map, String country) {
        if (map.containsKey(country)) {
            System.out.println(country + " -> " + map.get(country));
        } else {
            System.out.println(country + " -> Unknown country");
        }
    }
}

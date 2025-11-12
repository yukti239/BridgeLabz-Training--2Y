import java.util.Map;
import java.util.TreeMap;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>(); // sort by ISBN
        // 1. Add books
        catalog.put("978-1111111111", "Java Basics");
        catalog.put("978-2222222222", "Algorithms");
        catalog.put("978-3333333333", "Data Structures");

        // 2. Search by ISBN
        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-9999999999");

        // 3. Remove a book
        catalog.remove("978-1111111111");

        // 4. Print all ISBNs + titles sorted
        System.out.println("\nCatalog sorted by ISBN:");
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // Extend: search by title (simple contains match)
        searchByTitle(catalog, "Data");
    }

    static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("Found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    static void searchByTitle(Map<String, String> catalog, String titlePart) {
        System.out.println("\nSearching for title containing: " + titlePart);
        boolean found = false;
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            if (e.getValue().toLowerCase().contains(titlePart.toLowerCase())) {
                System.out.println(e.getKey() + " -> " + e.getValue());
                found = true;
            }
        }
        if (!found) System.out.println("No books found with title containing \"" + titlePart + "\"");
    }
}

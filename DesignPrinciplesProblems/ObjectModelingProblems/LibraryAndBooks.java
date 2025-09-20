import java.util.*;

class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    List<Book> books = new ArrayList<>();
    void addBook(Book b) {
        books.add(b);
    }
}

public class Problem1_LibraryAndBooks {
    public static void main(String[] args) {
        Book b1 = new Book("Book1", "Author1");
        Book b2 = new Book("Book2", "Author2");
        Library l1 = new Library();
        Library l2 = new Library();
        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b2);
        System.out.println("Library aggregation demo complete");
    }
}
public class LibraryBookSystem {
    public String ISBN;
    protected String title;
    private String author;
    public LibraryBookSystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class EBook extends LibraryBookSystem {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void display() {
        System.out.println(ISBN + " " + title);
    }
}
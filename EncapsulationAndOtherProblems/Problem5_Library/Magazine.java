public class Magazine extends LibraryItem {
    public Magazine(String id,String title,String author){ super(id,title,author); }
    public int getLoanDuration(){ return 7; }
}

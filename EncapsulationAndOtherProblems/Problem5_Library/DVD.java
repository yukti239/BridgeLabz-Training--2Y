public class DVD extends LibraryItem {
    public DVD(String id,String title,String author){ super(id,title,author); }
    public int getLoanDuration(){ return 3; }
}

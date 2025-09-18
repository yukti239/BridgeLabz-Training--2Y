public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String id,String title,String author){ this.itemId=id; this.title=title; this.author=author; }
    public String getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public abstract int getLoanDuration();
    public void getItemDetails(){ System.out.println(itemId+" "+title+" "+author); }
}

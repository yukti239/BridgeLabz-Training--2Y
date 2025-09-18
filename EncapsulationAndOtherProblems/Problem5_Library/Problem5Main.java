import java.util.*;
public class Problem5Main {
    public static void main(String[] args){
        LibraryItem b = new Book("B001","Java Programming","Author A");
        LibraryItem m = new Magazine("M001","Tech Monthly","Editor X");
        LibraryItem d = new DVD("D001","Movie","Director Y");
        for(LibraryItem li: new LibraryItem[]{b,m,d}) { li.getItemDetails(); System.out.println("Loan days: "+li.getLoanDuration()); }
    }
}

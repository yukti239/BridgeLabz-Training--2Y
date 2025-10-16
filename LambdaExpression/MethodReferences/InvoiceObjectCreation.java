import java.util.*;
import java.util.stream.*;
class Invoice{
 String transactionId;
 Invoice(String id){this.transactionId=id;}
 public String toString(){return "Invoice for "+transactionId;}
}
public class InvoiceObjectCreation{
 public static void main(String[] args){
  List<String> txnIds = Arrays.asList("TXN101","TXN102","TXN103");
  List<Invoice> invoices = txnIds.stream().map(Invoice::new).toList();
  invoices.forEach(System.out::println);
 }
}

import java.util.*;
public class HospitalPatientIDPrinting{
 public static void main(String[] args){
  List<String> patientIds = Arrays.asList("P1001","P1002","P1003","P1004");
  patientIds.forEach(System.out::println);
 }
}

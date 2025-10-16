import java.util.*;
import java.util.function.*;
class Alert{
 String type;
 String message;
 Alert(String t,String m){type=t;message=m;}
 public String toString(){return type+": "+message;}
}
public class NotificationFiltering{
 public static void main(String[] args){
  List<Alert> alerts = Arrays.asList(
    new Alert("CRITICAL","Heart rate abnormal"),
    new Alert("INFO","Daily summary ready"),
    new Alert("WARNING","High blood pressure detected")
  );
  Predicate<Alert> pref = a -> !a.type.equals("INFO");
  alerts.stream().filter(pref).forEach(System.out::println);
 }
}

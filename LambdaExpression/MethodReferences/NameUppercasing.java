import java.util.*;
import java.util.stream.*;
public class NameUppercasing{
 public static void main(String[] args){
  List<String> employees = Arrays.asList("Ravi","Neha","Amit","Priya");
  employees.stream().map(String::toUpperCase).forEach(System.out::println);
 }
}

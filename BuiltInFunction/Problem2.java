import java.time.*;
public class Problem2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original Date: " + date);
        System.out.println("Modified Date: " + result);
    }
}
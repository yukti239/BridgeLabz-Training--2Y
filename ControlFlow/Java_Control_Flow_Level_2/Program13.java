import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) System.out.println(counter);
                counter--;
            }
        } else System.out.println("Number should be positive and less than 100");
    }
}
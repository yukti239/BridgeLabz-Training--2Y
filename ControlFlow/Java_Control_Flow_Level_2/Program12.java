import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) result *= number;
            System.out.println(result);
        } else System.out.println("Invalid input");
    }
}
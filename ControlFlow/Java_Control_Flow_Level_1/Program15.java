import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial: " + fact);
        } else System.out.println("Not a natural number");
    }
}
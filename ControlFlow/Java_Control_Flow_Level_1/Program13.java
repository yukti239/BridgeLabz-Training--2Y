import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formula = n * (n + 1) / 2;
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            System.out.println("Formula result: " + formula);
            System.out.println("For loop result: " + sum);
        } else System.out.println("Not a natural number");
    }
}
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number, sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == original) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");
    }
}
import java.util.Scanner;
public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int result = 1, counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(result);
    }
}
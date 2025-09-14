import java.util.Scanner;
public class Program9 {
    public static boolean isPositive(int n) {
        return n > 0;
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                if (isEven(nums[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }
        int result = compare(nums[0], nums[4]);
        if (result == 0) System.out.println("Equal");
        else if (result > 0) System.out.println("First greater");
        else System.out.println("First smaller");
    }
}
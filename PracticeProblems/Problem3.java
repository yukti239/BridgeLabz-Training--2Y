import java.util.*;
public class Problem3 {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
    }
}
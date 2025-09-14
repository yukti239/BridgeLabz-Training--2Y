import java.util.*;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
    }
}
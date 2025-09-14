import java.util.*;

public class PalindromeCheck {
    public static boolean check1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static boolean check2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return check2(s, start+1, end-1);
    }
    public static boolean check3(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = s.charAt(arr.length-1-i);
        return Arrays.equals(arr, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check1(s));
        System.out.println(check2(s,0,s.length()-1));
        System.out.println(check3(s));
    }
}

import java.util.*;
public class NumberCheckerPalindrome {
    public static int[] toDigits(int n){String s=String.valueOf(n);int[] d=new int[s.length()];for(int i=0;i<s.length();i++)d[i]=s.charAt(i)-'0';return d;}
    public static int[] reverse(int[] d){int[] r=new int[d.length];for(int i=0;i<d.length;i++)r[i]=d[d.length-1-i];return r;}
    public static boolean equals(int[] a,int[] b){return Arrays.equals(a,b);}
    public static boolean isPalindrome(int n){int[] d=toDigits(n);return equals(d,reverse(d));}
    public static boolean isDuck(int[] d){for(int x:d)if(x==0)return true;return false;}
    public static void main(String[] args){System.out.println(isPalindrome(121));}
}

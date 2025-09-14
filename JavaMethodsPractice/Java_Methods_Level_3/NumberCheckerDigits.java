
import java.util.*;
public class NumberCheckerDigits {
    public static int countDigits(int n){return String.valueOf(n).length();}
    public static int[] toDigits(int n){
        String s = String.valueOf(n);
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static boolean isDuck(int[] d){for(int x:d) if(x==0) return true; return false;}
    public static boolean isArmstrong(int n){
        int[] d=toDigits(n);int sum=0;int k=d.length;
        for(int x:d) sum+=Math.pow(x,k);
        return sum==n;
    }
    public static void main(String[] args){
        int n=153;
        int[] d=toDigits(n);
        System.out.println(countDigits(n));
        System.out.println(Arrays.toString(d));
        System.out.println(isDuck(d));
        System.out.println(isArmstrong(n));
    }
}

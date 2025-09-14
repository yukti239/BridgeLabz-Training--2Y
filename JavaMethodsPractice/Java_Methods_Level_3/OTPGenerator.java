
import java.util.*;
public class OTPGenerator {
    public static int generateOTP(){return 100000+(int)(Math.random()*900000);}
    public static boolean unique(int[] arr){Set<Integer> s=new HashSet<>();for(int x:arr)s.add(x);return s.size()==arr.length;}
    public static void main(String[] args){int[] arr=new int[10];for(int i=0;i<10;i++)arr[i]=generateOTP();System.out.println(unique(arr));}
}

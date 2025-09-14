
import java.util.*;
public class FactorsTasks {
    public static int[] factors(int n){int c=0;for(int i=1;i<=n;i++)if(n%i==0)c++;int[] f=new int[c];int j=0;for(int i=1;i<=n;i++)if(n%i==0)f[j++]=i;return f;}
    public static int greatest(int[] f){int m=0;for(int x:f)if(x>m)m=x;return m;}
    public static int sum(int[] f){int s=0;for(int x:f)s+=x;return s;}
    public static int product(int[] f){int p=1;for(int x:f)p*=x;return p;}
    public static int cubeProduct(int[] f){int p=1;for(int x:f)p*=Math.pow(x,3);return p;}
    public static void main(String[] args){System.out.println(Arrays.toString(factors(12)));}
}

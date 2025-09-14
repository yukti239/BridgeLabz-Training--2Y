
public class NumberCheckerVarious {
    public static boolean isPrime(int n){if(n<=1)return false;for(int i=2;i<=Math.sqrt(n);i++)if(n%i==0)return false;return true;}
    public static boolean isNeon(int n){int sq=n*n;int sum=0;while(sq>0){sum+=sq%10;sq/=10;}return sum==n;}
    public static boolean isSpy(int n){int sum=0,prod=1;while(n>0){int d=n%10;sum+=d;prod*=d;n/=10;}return sum==prod;}
    public static boolean isAutomorphic(int n){return String.valueOf(n*n).endsWith(String.valueOf(n));}
    public static boolean isBuzz(int n){return n%7==0||n%10==7;}
    public static void main(String[] args){System.out.println(isPrime(7));}
}

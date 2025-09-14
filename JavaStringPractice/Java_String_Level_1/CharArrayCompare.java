import java.util.Scanner;
class CharArrayCompare {
    static char[] toCharArrayCustom(String s) {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++) arr[i]=s.charAt(i);
        return arr;
    }
    static boolean compareArrays(char[] a,char[] b) {
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        char[] arr1=toCharArrayCustom(text);
        char[] arr2=text.toCharArray();
        boolean res=compareArrays(arr1,arr2);
        System.out.println("Compare Result: "+res);
    }
}
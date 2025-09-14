import java.util.Scanner;
class TrimSpaces {
    static int[] trimIndexes(String s) {
        int start=0,end=s.length()-1;
        while(start<s.length() && s.charAt(start)==' ') start++;
        while(end>=0 && s.charAt(end)==' ') end--;
        return new int[]{start,end+1};
    }
    static String substringCustom(String s,int start,int end) {
        String res="";
        for(int i=start;i<end;i++) res+=s.charAt(i);
        return res;
    }
    static boolean compareUsingCharAt(String s1,String s2) {
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndexes(s);
        String custom=substringCustom(s,idx[0],idx[1]);
        String builtin=s.trim();
        boolean res=compareUsingCharAt(custom,builtin);
        System.out.println("Compare Result: "+res);
    }
}
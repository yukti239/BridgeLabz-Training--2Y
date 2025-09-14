import java.util.Scanner;
class SplitWordsCompare {
    static int customLength(String s) {
        int count=0;
        try { while(true){ s.charAt(count); count++; } } catch(Exception e) {}
        return count;
    }
    static String[] splitWords(String s) {
        int len=customLength(s);
        int spaceCount=1;
        for(int i=0;i<len;i++) if(s.charAt(i)==' ') spaceCount++;
        String[] words=new String[spaceCount];
        int start=0, index=0;
        for(int i=0;i<len;i++) {
            if(s.charAt(i)==' ') {
                words[index++]=s.substring(start,i);
                start=i+1;
            }
        }
        words[index]=s.substring(start,len);
        return words;
    }
    static boolean compareArrays(String[] a,String[] b) {
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] custom=splitWords(text);
        String[] builtin=text.split(" ");
        boolean res=compareArrays(custom,builtin);
        System.out.println("Compare Result: "+res);
    }
}
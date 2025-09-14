import java.util.Scanner;
class StringLength {
    static int customLength(String s) {
        int count=0;
        try {
            while(true) {
                s.charAt(count);
                count++;
            }
        } catch(Exception e) {}
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int custom=customLength(s);
        int builtin=s.length();
        System.out.println("Custom Length: "+custom);
        System.out.println("Built-in Length: "+builtin);
    }
}
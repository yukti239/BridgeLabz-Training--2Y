import java.util.*;
public class Problem4 {
    static void generateFibonacci(int terms) {
        int a=0,b=1;
        for(int i=0;i<terms;i++) {
            System.out.print(a + " ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        generateFibonacci(terms);
    }
}
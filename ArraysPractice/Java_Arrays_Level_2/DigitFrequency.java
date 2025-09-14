import java.util.Scanner;
class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        String numStr=Integer.toString(number);
        int[] freq=new int[10];
        for(int i=0;i<numStr.length();i++){
            int d=numStr.charAt(i)-'0';
            freq[d]++;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0)System.out.println("Digit "+i+" frequency:"+freq[i]);
        }
    }
}
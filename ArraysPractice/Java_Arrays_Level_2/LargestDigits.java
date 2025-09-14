import java.util.Scanner;
class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }
        int largest=0,second=0;
        for (int i=0;i<index;i++){
            if(digits[i]>largest){
                second=largest;
                largest=digits[i];
            }else if(digits[i]>second && digits[i]!=largest){
                second=digits[i];
            }
        }
        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+second);
    }
}
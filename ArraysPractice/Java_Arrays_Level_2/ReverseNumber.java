import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number/=10;
        }
        System.out.print("Reversed number: ");
        for(int i=0;i<count;i++){
            System.out.print(digits[i]);
        }
    }
}
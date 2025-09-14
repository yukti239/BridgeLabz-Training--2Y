import java.util.Scanner;
class BMIProgram2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData=new double[n][3];
        String[] status=new String[n];
        for(int i=0;i<n;i++){
            double w,h;
            do{
                System.out.print("Enter weight of person "+(i+1)+": ");
                w=sc.nextDouble();
            }while(w<=0);
            do{
                System.out.print("Enter height of person "+(i+1)+": ");
                h=sc.nextDouble();
            }while(h<=0);
            personData[i][0]=w;
            personData[i][1]=h;
            personData[i][2]=w/(h*h);
            if(personData[i][2]<18.5)status[i]="Underweight";
            else if(personData[i][2]<24.9)status[i]="Normal";
            else if(personData[i][2]<29.9)status[i]="Overweight";
            else status[i]="Obese";
        }
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+" H:"+personData[i][1]+" W:"+personData[i][0]+" BMI:"+personData[i][2]+" Status:"+status[i]);
        }
    }
}
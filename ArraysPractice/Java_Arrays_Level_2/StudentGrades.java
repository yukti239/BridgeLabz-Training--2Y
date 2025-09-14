import java.util.Scanner;
class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[] physics=new int[n];
        int[] chemistry=new int[n];
        int[] maths=new int[n];
        double[] percent=new double[n];
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter physics marks for student "+(i+1)+": ");
            int p=sc.nextInt();
            System.out.print("Enter chemistry marks: ");
            int c=sc.nextInt();
            System.out.print("Enter maths marks: ");
            int m=sc.nextInt();
            if(p<0||c<0||m<0){System.out.println("Invalid input");i--;continue;}
            physics[i]=p;chemistry[i]=c;maths[i]=m;
            percent[i]=(p+c+m)/3.0;
            if(percent[i]>=90)grade[i]="A";
            else if(percent[i]>=75)grade[i]="B";
            else if(percent[i]>=50)grade[i]="C";
            else grade[i]="F";
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" P:"+physics[i]+" C:"+chemistry[i]+" M:"+maths[i]+" %:"+percent[i]+" Grade:"+grade[i]);
        }
    }
}
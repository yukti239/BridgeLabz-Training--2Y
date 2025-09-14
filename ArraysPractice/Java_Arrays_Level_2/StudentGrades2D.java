import java.util.Scanner;
class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] marks=new int[n][3];
        double[] percent=new double[n];
        String[] grade=new String[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                int val;
                do{
                    if(j==0)System.out.print("Enter physics marks for student "+(i+1)+": ");
                    else if(j==1)System.out.print("Enter chemistry marks: ");
                    else System.out.print("Enter maths marks: ");
                    val=sc.nextInt();
                }while(val<0);
                marks[i][j]=val;
            }
            percent[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            if(percent[i]>=90)grade[i]="A";
            else if(percent[i]>=75)grade[i]="B";
            else if(percent[i]>=50)grade[i]="C";
            else grade[i]="F";
        }
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+" P:"+marks[i][0]+" C:"+marks[i][1]+" M:"+marks[i][2]+" %:"+percent[i]+" Grade:"+grade[i]);
        }
    }
}
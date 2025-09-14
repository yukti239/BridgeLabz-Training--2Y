
import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args){
        int[][] arr=new int[10][3];
        Random r=new Random();
        int oldSum=0,newSum=0,bonusSum=0;
        for(int i=0;i<10;i++){
            int sal=10000+r.nextInt(90000);
            int yrs=r.nextInt(11);
            double bonus=yrs>5?0.05*sal:0.02*sal;
            arr[i][0]=sal;arr[i][1]=yrs;arr[i][2]=(int)bonus;
            oldSum+=sal;newSum+=sal+bonus;bonusSum+=bonus;
        }
        System.out.println("Old:"+oldSum+" New:"+newSum+" Bonus:"+bonusSum);
    }
}

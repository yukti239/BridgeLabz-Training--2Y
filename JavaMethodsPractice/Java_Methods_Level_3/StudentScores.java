
import java.util.*;
public class StudentScores {
    public static int[][] generate(int n){Random r=new Random();int[][] arr=new int[n][3];for(int i=0;i<n;i++){arr[i][0]=10+r.nextInt(90);arr[i][1]=10+r.nextInt(90);arr[i][2]=10+r.nextInt(90);}return arr;}
    public static double[][] calc(int[][] scores){int n=scores.length;double[][] res=new double[n][3];for(int i=0;i<n;i++){int total=scores[i][0]+scores[i][1]+scores[i][2];double avg=total/3.0;double perc=total/300.0*100;res[i][0]=total;res[i][1]=Math.round(avg*100.0)/100.0;res[i][2]=Math.round(perc*100.0)/100.0;}return res;}
    public static void main(String[] args){int[][] scores=generate(5);double[][] res=calc(scores);for(int i=0;i<5;i++)System.out.println(Arrays.toString(scores[i])+" "+Arrays.toString(res[i]));}
}

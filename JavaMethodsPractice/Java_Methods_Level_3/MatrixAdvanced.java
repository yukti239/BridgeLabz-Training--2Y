
import java.util.*;
public class MatrixAdvanced {
    public static int[][] randomMatrix(int r,int c){Random rand=new Random();int[][] m=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)m[i][j]=rand.nextInt(10);return m;}
    public static int[][] transpose(int[][] a){int r=a.length,c=a[0].length;int[][] t=new int[c][r];for(int i=0;i<r;i++)for(int j=0;j<c;j++)t[j][i]=a[i][j];return t;}
    public static int det2(int[][] a){return a[0][0]*a[1][1]-a[0][1]*a[1][0];}
    public static int det3(int[][] a){return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);}
    public static double[][] inv2(int[][] a){int d=det2(a);return new double[][]{{a[1][1]/(double)d,-a[0][1]/(double)d},{-a[1][0]/(double)d,a[0][0]/(double)d}};}
    public static void main(String[] args){int[][] a={{1,2},{3,4}};System.out.println(Arrays.deepToString(inv2(a)));}
}

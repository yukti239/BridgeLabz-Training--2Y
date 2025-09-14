
import java.util.*;
public class MatrixOperations {
    public static int[][] randomMatrix(int r,int c){Random rand=new Random();int[][] m=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)m[i][j]=rand.nextInt(10);return m;}
    public static int[][] add(int[][] a,int[][] b){int r=a.length,c=a[0].length;int[][] m=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)m[i][j]=a[i][j]+b[i][j];return m;}
    public static int[][] sub(int[][] a,int[][] b){int r=a.length,c=a[0].length;int[][] m=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)m[i][j]=a[i][j]-b[i][j];return m;}
    public static int[][] mul(int[][] a,int[][] b){int r=a.length,c=b[0].length;int[][] m=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++){int sum=0;for(int k=0;k<b.length;k++)sum+=a[i][k]*b[k][j];m[i][j]=sum;}return m;}
    public static void main(String[] args){int[][] a=randomMatrix(2,2);int[][] b=randomMatrix(2,2);System.out.println(Arrays.deepToString(add(a,b)));}
}


import java.util.*;
public class CalendarDisplay {
    static String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean leap(int y){return (y%4==0&&y%100!=0)||y%400==0;}
    public static int firstDay(int m,int y){int d=1;int c=y/100;int k=y%100;int f=d+(13*(m+1))/5+k+k/4+c/4+5*c;return f%7;}
    public static void main(String[] args){int m=7,y=2005;if(leap(y))days[2]=29;int fd=firstDay(m,y);System.out.println(months[m]+" "+y);System.out.println("Sun Mon Tue Wed Thu Fri Sat");for(int i=0;i<fd;i++)System.out.print("    ");for(int d=1;d<=days[m];d++){System.out.printf("%3d ",d);if((d+fd)%7==0)System.out.println();}}
}

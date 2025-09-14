import java.util.Scanner;
class VotingEligibility {
    static int[] generateAges(int n) {
        int[] ages=new int[n];
        for(int i=0;i<n;i++) ages[i]=(int)(Math.random()*90+10);
        return ages;
    }
    static String[][] eligibility(int[] ages) {
        String[][] table=new String[ages.length][2];
        for(int i=0;i<ages.length;i++) {
            table[i][0]=String.valueOf(ages[i]);
            if(ages[i]>=18) table[i][1]="true";
            else table[i][1]="false";
        }
        return table;
    }
    static void display(String[][] table) {
        System.out.println("Age\tCanVote");
        for(int i=0;i<table.length;i++) System.out.println(table[i][0]+"\t"+table[i][1]);
    }
    public static void main(String[] args) {
        int[] ages=generateAges(10);
        String[][] table=eligibility(ages);
        display(table);
    }
}
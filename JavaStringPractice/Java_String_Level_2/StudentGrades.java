class StudentGrades {
    static int[][] generateScores(int n) {
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) scores[i][j]=(int)(Math.random()*90+10);
        }
        return scores;
    }
    static double[][] calculate(int[][] scores) {
        double[][] res=new double[scores.length][3];
        for(int i=0;i<scores.length;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double perc=Math.round((total/3.0)*100.0/100.0);
            res[i][0]=total;
            res[i][1]=avg;
            res[i][2]=perc;
        }
        return res;
    }
    static String grade(double perc) {
        if(perc>=90) return "A";
        if(perc>=75) return "B";
        if(perc>=60) return "C";
        if(perc>=40) return "D";
        return "F";
    }
    static void display(int[][] scores,double[][] calc) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for(int i=0;i<scores.length;i++) {
            String g=grade(calc[i][2]);
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(int)calc[i][0]+"\t"+calc[i][1]+"\t"+calc[i][2]+"\t"+g);
        }
    }
    public static void main(String[] args) {
        int[][] scores=generateScores(5);
        double[][] calc=calculate(scores);
        display(scores,calc);
    }
}
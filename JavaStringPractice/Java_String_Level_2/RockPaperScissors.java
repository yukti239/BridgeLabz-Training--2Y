import java.util.Scanner;
class RockPaperScissors {
    static String computerChoice() {
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        if(r==1) return "paper";
        return "scissors";
    }
    static int winner(String user,String comp) {
        if(user.equals(comp)) return 0;
        if(user.equals("rock") && comp.equals("scissors")) return 1;
        if(user.equals("scissors") && comp.equals("paper")) return 1;
        if(user.equals("paper") && comp.equals("rock")) return 1;
        return -1;
    }
    static void displayResults(int userWins,int compWins,int games) {
        double userPerc=(userWins*100.0)/games;
        double compPerc=(compWins*100.0)/games;
        System.out.println("Games: "+games+" User Wins: "+userWins+" Computer Wins: "+compWins);
        System.out.println("User %: "+userPerc+" Computer %: "+compPerc);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<games;i++) {
            String user=sc.next();
            String comp=computerChoice();
            int res=winner(user,comp);
            if(res==1) userWins++; else if(res==-1) compWins++;
            System.out.println("User: "+user+" Comp: "+comp+" Result: "+res);
        }
        displayResults(userWins,compWins,games);
    }
}
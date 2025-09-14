import java.util.Scanner;
class VowelConsonantTable {
    static String charType(char c) {
        if(c>='A' && c<='Z') c=(char)(c+32);
        if(c>='a' && c<='z') {
            if("aeiou".indexOf(c)!=-1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] analyze(String s) {
        String[][] table=new String[s.length()][2];
        for(int i=0;i<s.length();i++) {
            table[i][0]=String.valueOf(s.charAt(i));
            table[i][1]=charType(s.charAt(i));
        }
        return table;
    }
    static void display(String[][] table) {
        System.out.println("Char\tType");
        for(int i=0;i<table.length;i++) System.out.println(table[i][0]+"\t"+table[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] table=analyze(s);
        display(table);
    }
}
import java.util.Scanner;
class WordsLengthTable {
    static int customLength(String s) {
        int count=0;
        try { while(true){ s.charAt(count); count++; } } catch(Exception e) {}
        return count;
    }
    static String[] splitWords(String s) {
        int len=customLength(s);
        int spaceCount=1;
        for(int i=0;i<len;i++) if(s.charAt(i)==' ') spaceCount++;
        String[] words=new String[spaceCount];
        int start=0,index=0;
        for(int i=0;i<len;i++) {
            if(s.charAt(i)==' ') {
                words[index++]=s.substring(start,i);
                start=i+1;
            }
        }
        words[index]=s.substring(start,len);
        return words;
    }
    static String[][] wordsWithLength(String[] words) {
        String[][] table=new String[words.length][2];
        for(int i=0;i<words.length;i++) {
            table[i][0]=words[i];
            table[i][1]=String.valueOf(customLength(words[i]));
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words=splitWords(text);
        String[][] table=wordsWithLength(words);
        System.out.println("Word\tLength");
        for(int i=0;i<table.length;i++) System.out.println(table[i][0]+"\t"+Integer.parseInt(table[i][1]));
    }
}
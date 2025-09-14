import java.util.Scanner;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String result = sentence.replaceAll(word1, word2);
        System.out.println("Modified Sentence: " + result);
    }
}
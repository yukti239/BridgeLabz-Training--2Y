public class PalindromeChecker {
    String text;
    
    PalindromeChecker(String text) {
        this.text = text;
    }
    
    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
    
    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) System.out.println("It is a palindrome.");
        else System.out.println("It is not a palindrome.");
    }
    
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("racecar");
        p.displayResult();
    }
}
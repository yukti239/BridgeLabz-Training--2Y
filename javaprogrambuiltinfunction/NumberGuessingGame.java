import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String feedback = "";
        while (!feedback.equals("correct")) {
            guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = sc.next();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Guessed correctly!");
    }
}
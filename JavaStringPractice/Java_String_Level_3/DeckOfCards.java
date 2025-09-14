import java.util.*;

public class DeckOfCards {
    static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random()*(deck.length-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
    public static String[][] distribute(String[] deck,int n,int players){
        if (n % players != 0) return new String[0][0];
        int cardsPerPlayer = n/players;
        String[][] result = new String[players][cardsPerPlayer];
        int index=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cardsPerPlayer;j++){
                result[i][j]=deck[index++];
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int players=sc.nextInt();
        String[] deck=initializeDeck();
        shuffle(deck);
        String[][] distributed=distribute(deck,n,players);
        for(int i=0;i<distributed.length;i++){
            System.out.println("Player "+(i+1)+": "+Arrays.toString(distributed[i]));
        }
    }
}
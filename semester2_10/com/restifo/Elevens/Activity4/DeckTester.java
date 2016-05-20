package com.restifo.Elevens.Activity4;
import static java.lang.System.out;
public class DeckTester {

    public static void main(String[] args) {
        out.println("Deck of shuffled cards");
        String[] ranks = new String[52];
        String[] suits = new String[52];
        int[] pointValues = new int[52];
        for (int i = 0; i < 52; i++)
        {
            String rank = "";
            String suit = "";
            if ((i + 1) % 13 == 11)      rank = "Jack";
            else if ((i + 1) % 13 == 12) rank = "Queen";
            else if ((i + 1) % 13 == 0)  rank = "King";
            else if ((i + 1) % 13 == 1)  rank = "Ace";
            else                         rank = Integer.toString((i + 1) % 13);
            
            if (i < 13)      suit = "Hearts";
            else if (i < 26) suit = "Diamonds";
            else if (i < 39) suit = "Clubs";
            else             suit = "Spades";
            
            ranks[i] = rank;
            suits[i] = suit;
            pointValues[i] = ((i + 1) % 13);
        }
        
        Deck e = new Deck(ranks, suits, pointValues);
        out.println(e);
    }
}
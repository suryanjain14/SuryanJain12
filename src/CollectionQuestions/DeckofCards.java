//Q.33
package CollectionQuestions;

import java.util.ArrayList;


public class DeckofCards {
    private ArrayList<javaint> deck = new ArrayList<>();// declare List that will store Cards

    // set up deck of Cards and shuffle
    public DeckofCards() {

        // number of cards

        // populate deck with Card objects
        for (javaint.Suit suit : javaint.Suit.values()) {
            for (javaint.Face face : javaint.Face.values()) {
                deck.add(new javaint(face, suit));
            } // end for
        } // end for
// get List
        // shuffle deck
    } // end DeckOfCards constructor

    // output deck
    public void printCards() {
// display 52 cards in two columns
        for (int i = 0; i < deck.size(); i++)
            System.out.println(deck.get(i).getSuit() + " " + deck.get(i).getFace());
    } // end method printCards

    public static void main(String args[]) {
        DeckofCards cards = new DeckofCards();
        cards.printCards();
    } // end main
} // end class DeckOfCards

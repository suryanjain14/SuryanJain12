//Q.16
package CollectionQuestions;
public class Q5 {
    public static enum Face {
        Ace, Deuce, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    ;

    public static enum Suit {Clubs, Diamonds, Hearts, Spades}

    ;

    private final Face face; // face of card
    private final Suit suit; // suit of card

    // two-argument constructor
    public Q5(Face cardFace, Suit cardSuit) {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    } // end two-argument Card constructor

    // return face of the card
    public Face getFace() {
        return face;
    } // end method getFace


    // return suit of Card
    public Suit getSuit() {
        return suit;
    } // end method getSuit

    // return String representation of Card
    public String returnit() {
        String str = face + " " + suit;
        return str;
    }

    public static void main(String[] args) {
        Q5 j1 = new Q5(Face.Ace, Suit.Clubs);
        System.out.println(j1.getFace());
        System.out.println(j1.getSuit());

        System.out.println(j1.returnit());
    }
}

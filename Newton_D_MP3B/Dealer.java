
/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3A: Cards
 */

// important import statement.
import java.util.LinkedList;

/**
 * Public class representing a Dealer object.
 */
public class Dealer {
    // Declaring member variable for the dealer's deck of cards.
    private Deck m_deck;

    /**
     * Default constructor creating a new deck of cards for the dealer.
     */
    public Dealer() {
        this.m_deck = new Deck();
    }

    /**
     * A method that deals "n" number of cards from the dealer's deck.
     * @param n an integer representing the number of cards to be dealt.
     * @return a LinkedList of the dealt cards.
     */
    public LinkedList<Card> deals(int n) {
        LinkedList<Card> newDeck = new LinkedList<Card>();
        for(int i = 0; i < n; i++) {
            if(m_deck.getCards().isEmpty()) {
                break;
            }
            Card card = m_deck.deal();
            newDeck.add(card);
        }
        return newDeck;
    }

    /**
     * A method used to get the size of a deck of cards.
     * @return an integer representing the number of cards in the deck.
     */
    public int size() {
        return m_deck.getCards().size();
    }

    /**
     * A method to print the deck as a string.
     */
    public String toString() {
        return m_deck.toString();
    }
}
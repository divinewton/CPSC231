
/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3A: Cards
 */

// important import statements.
import java.util.LinkedList;
import java.util.Random;

 /**
  * Public class representing a Deck object.
  */
public class Deck {
    // Declaring member variable for the deck of cards.
    private LinkedList<Card> m_cards = new LinkedList<Card>();

    /**
     * Default constructor creating a deck of 52 cards.
     */
    public Deck() {
        for(int suit = 0; suit < 4; suit++) {
            for(int value = 1; value < 14; value++) {
                this.m_cards.add(new Card(value, suit));
            }
        }
    }

    /**
     * Overloaded constructor creating a deck coppying another deck of cards.
     * @param deck a deck of cards used to copy.
     */
    public Deck (Deck deck) {
        this.m_cards = deck.getCards();
    }

    /**
     * A method to print the deck of cards as a string.
     */
    public String toString() {
        return m_cards.toString();
    }

    /**
     * A method to get the amount of cards in a deck.
     * @return an integer of the size of the deck.
     */
    public int size() {
        return m_cards.size();
    }

    /**
     * A method that deals a random card from the deck by removing and returning that card.
     * @return a card type object that was removed from the deck.
     */
    public Card deal() {
        Random randInt = new Random();
        int position = randInt.nextInt(m_cards.size());
        return m_cards.remove(position);
    }

    /**
     * An accessor of the cards variable.
     * @return a LinkedList of cards from the deck.
     */
    public LinkedList<Card> getCards() {
        return m_cards;
    }
}

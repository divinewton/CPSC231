package Newton_D_MP3A;

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
 * Public class for testing the Card, Deck, and Dealer classes and methods.
 */
public class TestCards {
    public static void main(String[] args) {
        // testing creating and printing new cards.
        System.out.println("Testing card creation:");
        Card newCard = new Card();
        Card otherCard = new Card(5, 2);
        System.out.println("New card: " + newCard);
        System.out.println("New card: " + otherCard);

        // testing creating and printing a new deck and dealing a card from it.
        System.out.println("\nTesting deck creation:");
        Deck newDeck = new Deck();
        System.out.println("New deck with " + newDeck.getCards().size() + " cards created.");
        System.out.println("Dealt one card from the deck: " + newDeck.deal());
    
        // testing creating and modifying a dealer deck.
        System.out.println("\nTesting dealer actions:");
        Dealer dealer = new Dealer();
        System.out.println("New dealer deck with " + dealer.size() + " cards created.");
        LinkedList<Card> dealt = dealer.deals(6);
        System.out.println("Dealt " + dealt.size() + " cards from dealer: " + dealt);
        System.out.println("Dealer's deck has " + dealer.size() + " cards left after dealing.");
    }
}

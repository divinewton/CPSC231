package Newton_D_MP3A;

/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP3A: Cards
 */

 /**
  * Public class representing a Card object.
  */
public class Card {
    // Declaring member variables for card.
    private int value;
    private int suit;

    // Setting suit identifiers
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    // Setting value identifiers
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    /**
     * Default constructor creating an ace of spades.
     * No parrameters.
     */
    public Card() {
        this.value = ACE;
        this.suit = SPADES;
    }

    /**
     * Overloaded constructor setting member variables from given parrameters.
     * @param newValue an integer representing the card's value.
     * @param newSuit an integer representing the card's suit. 
     */
    public Card(int newValue, int newSuit) {
        this.value = newValue;
        this.suit = newSuit;
    }

    /**
     * An overloaded copy constructor making a card from another card object.
     * @param card a card object to be coppied.
     */
    public Card( Card card) {
        this.value = card.getValue();
        this.suit = card.getSuit();
    }

    /**
     * A method to print the card object as a string with it's value and suit.
     */
    public String toString() {
        String suitString;
        // sets name of suit from corrosponding integer representation.
        if (suit == 0) {
            suitString = "Hearts";
        } 
        else if (suit == 1) {
            suitString = "Spades";
        }
        else if (suit == 2) {
            suitString = "Clubs";
        }
        else if (suit == 3) {
            suitString = "Diamonds";
        }
        else {
            suitString = "SUIT UNKNOWN";
        }
        String valueString;
        // sets name of card's value from corrosponding integer representation.
        if (value > 10) {
            if (value == 11) {
                valueString = "Jack";
            }
            else if (value == 12) {
                valueString = "Queen";
            }
            else if (value == 13) {
                valueString = "King";
            }
            else if (value == 14) {
                valueString = "Ace";
            }
            else {
                valueString = "UNKNOWN VALUE";
            }
        }
        else if (value == 1) {
            valueString = "Ace";
        }
        else {
            valueString = Integer.toString(value);
        }
    return (valueString + " of " + suitString);
    }

    /**
     * A method used to compare two card objects to see if they are equal. 
     * @param equalsCard a card type object to be compared with the original card.
     * @return either true or false depending if the cards are equal or not.
     */
    public boolean equals(Card equalsCard) {
        if(value == equalsCard.getValue()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * A mutator of the value variable.
     * @param newValue an integer representing the card's value.
     */
    public void setValue(int newValue) {
        value = newValue;
    }

    /**
     * A mutator of the suit variable.
     * @param newSuit an integer representing the card's suit.
     */
    public void setSuit(int newSuit) {
        suit = newSuit;
    }

    /**
     * An accessor of the value variable.
     * @return an integer representing the card's value.
     */
    public int getValue() {
        return value;
    }

    /**
     * An accessor of the suit variable.
     * @return an integer representing the card's suit.
     */
    public int getSuit() {
        return suit;
    }
}

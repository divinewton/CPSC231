import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private int playerNum;
    private LinkedList<Card> hand = new LinkedList<Card>();
    private String pattern;

    public Player(int playerNum, LinkedList<Card> hand, String pattern) {
        this.playerNum = playerNum;
        this.hand = hand;
        this.pattern = pattern;
    } 

    public Card playCard() {
        return hand.remove();
    }

    public boolean slaps(LinkedList<Card> pile) {
        if (pattern.equals("doubles")) {
            if getGamePlay {
                return true;
            } 
            else {
                return false;
            }
        }
        else if (pattern.equals("top bottom")) {
            if getGamePlay {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if getGamePlay {
                return true
            }
            else {
                return false;
            }
        }
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public LinkedList<Card> getHand() {
        return hand;
    }

    public String getPattern() {
        return pattern;
    }

    public String toString() {
        return "Player number: " + playerNum + ". Pattern: " + pattern + ".";
    }
}

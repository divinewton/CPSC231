import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Game {
    private LinkedList<Player> players = new LinkedList<Player>();
    private LinkedList<Card> pile = new LinkedList<Card>();
    private Dealer dealer = new Dealer();
    private String[] patterns = {"doubles", "top bottom", "sandwich"};

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public LinkedList<Card> getPile() {
        return pile;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public String[] getPatterns() {
        return patterns;
    }

    public Game() {
        Random rand = new Random();
        for (int i = 0; i < 2; i++) {
            players.add(new Player(i + 1, dealer.deals(26), patterns[rand.nextInt(patterns.length)]));
        }
    }

    public Game(int numPlayers) {
        Random rand = new Random();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(i + 1, dealer.deals(52 / numPlayers), patterns[rand.nextInt(patterns.length)]));
        }
    }

    public int play() {
        Player currentPlayer = players.get(0);

        while (players.size() )
    }

    public Player nextPlayer(Player currentPlayer) {
        if ((players.indexOf(currentPlayer) + 1) >= players.size()) {
            return players.get(0);
        }
        else {
            return players.get((players.indexOf(currentPlayer) + 1)); 
        }
    }

    private int checkForPattern() {
        if (topBottom(pile)) {
            return 1;
        }
        else if (doubles(pile)) {
            return 2;
        }
        else if (sandwich(pile)) {
            return 3;
        }
        else {
            return 0;
        }
    }
    
    private static boolean topBottom(LinkedList<Card> thePile) {
        if (thePile.getFirst().equals(thePile.getLast())) {
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean doubles(LinkedList<Card> thePile) {
        if (thePile.get(thePile.size() - 2).equals(thePile.getLast())) {
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean sandwich(LinkedList<Card> thePile) {
        if (thePile.get(thePile.size() - 3).equals(thePile.getLast())) {
            if (thePile.get(thePile.size() -2).equals(thePile.getLast())) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public String toString() {
        // FIX THIS
        return players.toString();
    }
}
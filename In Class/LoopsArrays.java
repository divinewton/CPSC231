import java.util.Scanner;
import java.util.Random;

public class LoopsArrays {
    public static void main(String[] args) {
        //write a random number guessing game
        //generate random number between 1 and 10
        // get a guess from the user
        //keep asking them to guess until they get it right
        Scanner in = new Scanner(System.in);
        Random randy = new Random();
        // range of numbers between 1 and 10
        int generated = randy.nextInt(10) + 1;
        System.out.println("Generated: " + generated);
        System.out.print("Guess a number: ");
        int guess = in.nextInt();

        // WHILE LOOPS
        while (guess != generated) {
            System.out.println("Nope!");
            // over-write the value of guess to the user's next guess
            System.out.print("Guess again: ");
            guess = in.nextInt();
        }

        // FOR LOOPS
        // declares ad initializes your contrilling variable
        // running condition
        // updates the controlling variable on every iteration

        String message = "hey";
        int flirtLevel = 5;
        for (int i=0; i < flirtLevel; ++i) {
            message += "y";
       }
        System.out.println("New Message: " + message);

        // ARRAYS
        // fixed in size (cannot add or remove elements)
        // homogenous (everything must be the same type)
        // creating an array of strings with a size of 5:
        String[] movies = new String[5];
        movies[0] = "Whiplash";
        movies[1] = "Little Miss Sunshine";
        movies[2] = "Talladega Nights";

        // reference to where the array is stored (memory location)
        System.out.println(movies);
        // loop through every value in array
        for (int i=0; i < movies.length; ++i) {
            if (movies[i] == null) {
                System.out.println("TO BE ANNOUNCED...");
                continue;
            }
            System.out.println(movies[i]);
        }

        // declaring an array with initial values
        int[] votes = {8, 10, 12, 0, 0};
        int totalVotes = 0;
        // loop through every value in votes to calculate the sum of all votes
        // FOR EACH LOOP
        // declare a variable for each value : what you want to loop through
        for (int v : votes) {
            totalVotes += v;
        }
        System.out.println(totalVotes + " votes were cast. ");

        String winner = movies[2];
        char hint = 'A';
        for (char letter : winner.toUpperCase().toCharArray()) {
            if (letter == hint) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }

        // COMMAND LINE ARGUMENTS
        // when you run your program, you can pass in space seperated values as arguements
        System.out.println("Recieved " + args.length + " CLI arguements");
        if (args.length > 0) {
            String mode = args[0];
            System.out.println("You are playing on " + mode + " mode.");
        }
    }
}
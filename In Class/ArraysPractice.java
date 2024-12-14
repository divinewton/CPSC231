// Write a program that takes in a minimum and maximum bound as command line arguments. 
//Then randomly generate 5 unique numbers between those bounds and display them to the user.
import java.util.Random;

public class ArraysPractice {
    public static void main(String[] args) {
        Random randy = new Random();

        if (args.length == 2) {
            int lowerBound = Integer.parseInt(args[0]);
            int upperBound = Integer.parseInt(args[1]);

            int generated1 = randy.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int generated2 = randy.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int generated3 = randy.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int generated4 = randy.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int generated5 = randy.nextInt(upperBound - lowerBound + 1) + lowerBound;

            System.out.println("Your numbers are: " + generated1 + ", " + generated2 + ", " + generated3 + ", " + generated4 + ", " + generated5);

        } else {
            System.out.println("You did not pass in the correct args. Please try again!");
            System.out.println("Try with two args that are both integers.");
        }

    }
}
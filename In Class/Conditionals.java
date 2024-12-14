import java.util.Random;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        String favoriteDog = "Golden Retriever";
        String guess = "Corgi";
        
        // If - Else If - Else Statement

        if (guess.equals(favoriteDog)) {
            System.out.println("You guessed it!");
        } else if (guess.equals("Australian Shephered")) {
            System.out.println("No but close!");
        } else {
            System.out.println("Nope!");
        }

        // Switch Statement
        
        switch (guess) {
            case "Golden Retriever":
                System.out.println("You guessed it!");
                break;
            case "Australian Shephered":
                System.out.println("No but close!");
                break;
            case "Corgi":
                System.out.println("No but I like their football half-time shows!");
                break;
            default:
                System.out.println("Nope!");
        }

        // Random number generation

        // Need a random object (import random class)
        Random randy = new Random();
        // we want to generate a whole number between 1 and 10
        // nextInt accepts ONLY ONE PARAMETER that is the non-inclusive MAX (default minimum bound is 0)
        // you can add a whole number to shift over the minimum bound
        int randomNumber = randy.nextInt(10) + 1;
        System.out.println(randomNumber);

        // create a program that responds "yes" 80% of the time and "no" 20% of the time
        if (randomNumber <= 8) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

        // PRACTICE QUESTION #1
        // Ask the user to enter two integers. 
        // Then ask the user if they want to add or multiply the numbers together. 
        // Print out the result of their selected operation.

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstNum = userInput.nextInt();
        System.out.print("Enter a second integer: ");
        int secondNum = userInput.nextInt();

        System.out.println("Do you want to add or multiply your numbers? ");
        String userChoice = userInput.next();

        if (userChoice.equals("add")) {
            System.out.println(firstNum + secondNum);
        } else if (userChoice.equals("multiply")) {
            System.out.println(firstNum * secondNum);
        } else {
            System.out.println("Oops! Please try again.");
        }

        // PRACTICE QUESTION #2
        // Write a multiple choice quiz program that prints out a question to the user and all of the potential answers, labeled A→D. 
        // Ask the user for their selected answer. Print out if the user chose the correct answer or not.

        String question = "What is Chapman University's school color?";
        String answerA = "Blue";
        String answerB = "Red";
        String answerC = "Green";
        String answerD = "Purple";

        System.out.println(question);
        System.out.println("A " + answerA);
        System.out.println("B " + answerB);
        System.out.println("C " + answerC);
        System.out.println("D " + answerD);

        System.out.println("Enter your answer (type full answer): ");
        String userAnswer = userInput.next();
        
        if (userAnswer.equals(answerA)) {
            System.out.println("Incorrect. The answer was (B) Red.");
        } else if (userAnswer.equals(answerB)) {
            System.out.println("CORRECT! The answer was (B) Red.");
        } else if (userAnswer.equals(answerC)) {
            System.out.println("Incorrect. The answer was (B) Red.");
        } else if (userAnswer.equals(answerD)) {
            System.out.println("Incorrect. The answer was (B) Red.");
        } else {
            System.out.println("Error! Try again.");
        }
        }

    }

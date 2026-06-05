import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int lower = 1;
        int upper = 100;

        int numberToGuess = random.nextInt(upper - lower + 1) + lower;

        int guess = 0;
        int attempts = 0;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("Guess a number between " + lower + " and " + upper);

        while (guess != numberToGuess) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too LOW! Try again.");
            } 
            else if (guess > numberToGuess) {
                System.out.println("Too HIGH! Try again.");
            } 
            else {
                System.out.println("Correct! You guessed it.");
                System.out.println("Attempts: " + attempts);
            }
        }

        input.close();
    }
}
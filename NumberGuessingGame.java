
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // Initialize variables
        int userNumber = 0;
        int numberOfGuesses = 0;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Start the game
        while (userNumber != randomNumber) {
            System.out.print("Enter your guess: ");
            userNumber = scanner.nextInt();

            numberOfGuesses++;

            if (userNumber < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userNumber > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        }

        // Display the result
        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");

        // Close the Scanner object
        scanner.close();
    }

}
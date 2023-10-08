import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int targetNumber = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (userGuess != targetNumber);

        scanner.close();
    }
}
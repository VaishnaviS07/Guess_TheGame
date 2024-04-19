import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You've guessed the secret number " + secretNumber + " in " + attempts + " attempts!");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
}

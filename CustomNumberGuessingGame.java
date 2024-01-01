import java.util.Scanner;
import java.util.Random;

public class CustomNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        displayGameHeader();

        System.out.println("Welcome to the Custom Guessing Game!");

        while (true) {
            int targetNumber = random.nextInt(50) + 50; // Altered range for a new challenge
            int maxAttempts = 5; // Altered attempts for a quicker game
            int attempts = 0;

            System.out.println("I've picked a number between 50 and 100. Can you figure it out?");

            while (attempts < maxAttempts) {
                System.out.print("Take a guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Well done! You got it right!");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Aim for a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                attempts++;
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }

            if (attempts < maxAttempts) {
                System.out.println("You found the number in " + attempts + " attempts. Great work!\n");
            } else {
                System.out.println("Oops, no more attempts left. The correct number was " + targetNumber + "\n");
            }

            System.out.print("Want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }
    }

    private static void displayGameHeader() {
        System.out.println("********************************************");
        System.out.println("*        CUSTOM NUMBER GUESSING GAME       *");
        System.out.println("********************************************");
    }
}

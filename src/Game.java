import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner scanner;
    private final Random random;

    public Game() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void start() {

        boolean playAgain = true;

        while (playAgain) {
            displayWelcome();

            Difficulty difficulty = selectDifficulty();

            System.out.println("You selected " + difficulty + " with " + difficulty.getChances() + " chances.");

            playRound(difficulty);

            System.out.println("Do you want o play Again? (y/n)");
            String choice = scanner.next();

            playAgain= choice.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing!");
    }

    private void displayWelcome() {
        System.out.println("Welcome to the Number Guessing game!!");
        System.out.println("I'm thinking of a number between 1 and 100.");
    }

    private Difficulty selectDifficulty() {
        System.out.println("\n Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                return Difficulty.EASY;
            case 2:
                return Difficulty.MEDIUM;
            case 3:
                return Difficulty.HARD;
            default:
                System.out.println("Invalid choice. Defaulting to Medium.");
                return Difficulty.MEDIUM; // default
        }
    }

    public int generateRandomNumber() {
        return random.nextInt(100) + 1;
    }

    private void playRound(Difficulty difficulty) {
        long startTime=  System.currentTimeMillis();
        int secretNumber = generateRandomNumber();

        int remainingChances = difficulty.getChances();
        int attempts = 0;
        while (remainingChances > 0) {
            System.out.println("You have " + remainingChances + " chances left. Enter Your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number!" + attempts + " attempts.");
                long endTime = System.currentTimeMillis();
                long seconds = (endTime-startTime)/1000;
                System.out.println("Time taken: " + seconds + " seconds."); 
                return;
            }
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too Low! try again.");
            }

            remainingChances--;

            System.out.println("Remaining chances: " + remainingChances);
        }
        System.out.println("Game Over!");
        System.out.println("the number was: " + secretNumber);
    }

}

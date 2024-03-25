import java.util.Random;
import java.util.Scanner;

public class Todo2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---Random Number Guessing Game---");
        System.out.println("Guess a number between 1 and 100.\n");

        while (true) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNum) {
                System.out.println("Higher!");
            } else if (guess > randomNum) {
                System.out.println("Lower!");
            } else {
                System.out.println("Nice, " + randomNum + " is the right number.");
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) Math.floor(Math.random() * 10) + 1;
        int guess;

        do {
            System.out.println("Guess the random number (must be from 1 to 10):");
            guess = scanner.nextInt();
        } while (guess < 1 || guess > 10);

        System.out.println("\nThe random number was: " + randomNumber);

        if (guess < randomNumber) {
            System.out.println("Your guess was too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("You are right on the money!");
        }
    }
}

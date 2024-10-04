
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number: ");
        int userInput = scanner.nextInt();

        int guesses = 1;

        while (randomNum != userInput) {
            if (randomNum > userInput) {
                System.out.println("My number is bigger.");
            } else if (randomNum < userInput) {
                System.out.println("Your number is bigger.");
            }
            guesses++;

            System.out.println("What's your next guess?");
            userInput = scanner.nextInt();
        }

        System.out.println("You win!");
        System.out.println("You guessed the number in " + guesses + " attempts.");

        scanner.close();
    }
}

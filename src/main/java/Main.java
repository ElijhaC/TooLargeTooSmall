import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        //Make a scanner to get user guesses
        Scanner scan = new Scanner(System.in);

        Random ranNum = new Random();
        int highNum = 20;

        int selectedNum = ranNum.nextInt(highNum) + 1;
        boolean correct = false;
        int guessCount = 0;

        int previousGuess = 0;

        while (correct == false) {

            System.out.println("Pick a number between 1 and 20");
            int playerGuess = scan.nextInt();


            if (previousGuess != playerGuess) {
                guessCount++;
            }

            if (playerGuess == selectedNum) {
                System.out.println("Correct! It's " + selectedNum);
                System.out.println("It took you " + guessCount + " guesses!");
                correct = true;
            } else if (playerGuess < selectedNum) {
                System.out.println("Too low. Guess again");
                previousGuess = playerGuess;
            } else if (playerGuess > selectedNum) {
                System.out.println("Too high. Guess again");
                previousGuess = playerGuess;
            }
        }
    }
}
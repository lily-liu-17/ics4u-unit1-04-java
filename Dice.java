/*
 * This program generates a random number between one and six,
 * then gets the user to guess it.
 *
 * @author  Lily Liu
 * @version 1.0
 * @since   2022-09-27
 */

import java.util.Scanner;
/**
* Dice guessing game.
*/

final class Dice {
    /**
    * Max number.
    */
    static final int MAX = 6;
    /**
    * Min number.
    */
    static final int MIN = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * If this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Dice() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        int tries = 0;
        int guess = 0;
        final int random = (int)
            Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
        final Scanner attempt = new Scanner(System.in);
        while (true) {
            System.out.print("\nGuess a number between 1 and 6: ");
            try {
                guess = attempt.nextInt();
            } catch (java.util.InputMismatchException errorCode) {
                System.out.print("Invaild Input");
                break;
            }
            tries = tries + 1;
            if (guess > random) {
                System.out.print("Too high, try again.");
            } else if (guess < random) {
                System.out.print("Too low, try again.");
            } else {
                System.out.print("You got it right in " + tries + " guesses.");
                break;
            }
        }
        System.out.print("\nDone.");
    }
}

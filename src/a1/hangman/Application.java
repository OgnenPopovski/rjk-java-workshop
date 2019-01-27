package a1.hangman;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the word to play (can be sentence with blank spaces)");
        String word = in.nextLine();

        System.out.println("Enter how many tries are allowed before hanging the player:");
        int numberOfTriesAllowed = readPositiveInteger();

        for (int i = 0; i < 30; i++) {
            System.out.println();
        }

        Hangman game = new Hangman(word, numberOfTriesAllowed);
        while(!game.isGameOver()) {
            System.out.println("----------------------------------------------");
            game.printGameProgress();
            System.out.println("enter letter: ");
            String input = in.next();
            char letter = input.charAt(0);
            game.checkLetter(letter);
        }

        System.out.println(game.score());
    }

    private static int readPositiveInteger() {
        int number = 0;
        while (true) {
            number = retryUntilReadInteger();
            if (number <= 0) {
                System.out.println("You must enter positive integer. Try again");
            } else {
                break;
            }
        }
        return number;
    }

    private static int retryUntilReadInteger() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            String next = in.next();
            System.out.println("'" + next + "' is not an integer. Try again");
        }
        return in.nextInt();
    }

}

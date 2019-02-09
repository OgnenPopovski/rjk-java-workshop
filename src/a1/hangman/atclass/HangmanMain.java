package a1.hangman.atclass;

import java.util.Scanner;

public class HangmanMain {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("vnesi zbor");
    String word = retryUntilNoEmptyWord();

    System.out.println("vnesi obidi");
    int tries = retryUntilReadPositiveInteger();

    for (int i = 0; i < 50; i++) {
      System.out.println();
    }

    Hangman game = new Hangman(tries, word);

    while (!game.isGameOver()) {
      game.printDetails();
      char letter = in.nextLine().charAt(0);

      game.checkLetter(letter);
    }

    game.printResult();
  }

  public static String retryUntilNoEmptyWord() {
    Scanner in = new Scanner(System.in);
    boolean foundNonEmptyWord = false;
    String word = "";
    while (!foundNonEmptyWord) {
      word = in.nextLine().trim();
      if (word.length() > 0) {
        foundNonEmptyWord = true;
      } else {
        System.out.println("You must enter non empty word.");
      }
    }
    return word;
  }

  public static int retryUntilReadPositiveInteger() {
    Scanner in = new Scanner(System.in);
    boolean foundPositiveInteger = false;
    int intResult = 0;

    while (!foundPositiveInteger) {
      String input = in.nextLine();
      if (isInteger(input)) {
        intResult = Integer.parseInt(input);
        if (intResult > 0) {
          foundPositiveInteger = true;
        } else {
          System.out.println("'" + intResult + "' is not positive integer. Try again");
        }
      } else {
        System.out.println("'" + input + "' is not integer. Try again");
      }
    }
    return intResult;
  }

  public static boolean isInteger(String value) {
    boolean isInteger = true;
    try {
      Integer.parseInt(value);
    } catch (NumberFormatException e) {
      isInteger = false;
    }
    return isInteger;
  }
}
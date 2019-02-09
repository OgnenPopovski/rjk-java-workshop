package a1.hangman.atclass;

import java.util.ArrayList;
import java.util.List;


public class Hangman {

  private int tries;
  private List<Character> letters;
  private List<Character> maskedWord;
  private List<Character> lettersSoFar;

  public Hangman(int tries, String word) {
    letters = new ArrayList<>();
    maskedWord = new ArrayList<>();
    lettersSoFar = new ArrayList<>();
    this.tries = tries;
    word = word.trim();
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      char currentCharacter = word.charAt(i);
      letters.add(currentCharacter);
      if (currentCharacter == ' ') {
        maskedWord.add(' ');
      } else {
        maskedWord.add('*');
      }
    }

  }

  public boolean isGameOver() {
    return tries == 0 || isWin();
  }

  public boolean isWin() {
    return !maskedWord.contains('*');
  }

  public void checkLetter(char letter) {
    char lowercaseLetter = Character.toLowerCase(letter);

    if (lettersSoFar.contains(lowercaseLetter)){
      return;
    }

    lettersSoFar.add(lowercaseLetter);
    boolean containsLetter = false;
    for (int i = 0; i < letters.size(); i++) {
      if (lowercaseLetter == letters.get(i)) {
        maskedWord.set(i, lowercaseLetter);
        containsLetter = true;
      }
    }

    if (!containsLetter) {
      tries--;
    }
  }

  public void printDetails() {
    String maskedString = listToString(maskedWord);
    System.out.println(maskedString + ", tries left: " + tries);
    System.out.println("Letters so far: " + lettersSoFar);
  }

  private String listToString(List<Character> list) {
    String maskedString = "";
    for (int i = 0; i < list.size(); i++) {
      maskedString += list.get(i);
    }
    return maskedString;
  }

  public void printResult() {
    if (isWin()) {
      System.out.println("You won!");
    } else {
      String word = listToString(letters);
      System.out.println("You lost!, the word was: " + word);
    }
  }

}

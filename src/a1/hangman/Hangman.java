package a1.hangman;

import java.util.ArrayList;
import java.util.List;

public class Hangman {

    private char[] word;
    private char[] currentProgress;
    private List<Character> lettersTried = new ArrayList<>();
    private int tries;
    private int lettersScored = 0;

    public Hangman(String wordToPlay, int numberOfTriesAllowed) {
        word = wordToPlay.trim().toCharArray();
        tries = numberOfTriesAllowed;
        currentProgress = new char[word.length];
        for (int i = 0; i < currentProgress.length; i++) {
            if (word[i] == ' ') {
                currentProgress[i] = ' ';
                lettersScored++;
                continue;
            }
            word[i] = Character.toLowerCase(word[i]);
            currentProgress[i] = '*';
        }
    }

    public void checkLetter(char letter) {
        letter = Character.toLowerCase(letter);

        if (!lettersTried.contains(letter)) {
            lettersTried.add(letter);
            boolean letterPresent = false;
            for (int i = 0; i < word.length; i++) {
                char currentLetter = word[i];
                if (currentLetter == ' ') {
                    continue;
                }
                if (letter == currentLetter) {
                    currentProgress[i] = letter;
                    lettersScored++;
                    letterPresent = true;
                }
            }
            if (!letterPresent) {
                tries--;
            }
        }
    }

    public boolean isGameOver() {
        return tries == 0 || lettersScored == word.length;
    }

    public void printGameProgress() {
        System.out.println(getCurrentProgress() + ", you have " + tries + " tries left");
        System.out.println("Letters tried so far: " + lettersTried);
    }

    public String score() {
        String score;
        if (lettersScored == word.length) {
            score = "You WON!";
        } else {
            score = "You LOST :( the word was: '" + new String(word) + "'";
        }
        return "'" + getCurrentProgress() + "' " + score;
    }
    private String getCurrentProgress() {
        return new String(currentProgress);
    }
}

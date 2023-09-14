package game;

import java.util.Scanner;

public class GuessTheWord {

    private boolean play = true;
    private Words randomWords = new Words();
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
            // play = false;
        } while (play);

    }

    private void showWord() {
        System.out.println(randomWords);
    }

    private void getInput() {
        char letter;
        System.out.println("Enter a letter to guess the word: ");
        String userGuess = this.scanner.next();
        letter = (char) userGuess.charAt(0);
        randomWords.guess(letter);
    }

    private void checkInput() {
        // boolean reuslt = this.randomWords.isGuessedRight();
        if (this.randomWords.isGuessedRight()) {
            System.out.println("congrats, you won!");
            System.out.println("The word is: " + randomWords);
            play = false;

        }
    }

    public void end() {
        scanner.close();
    }
}

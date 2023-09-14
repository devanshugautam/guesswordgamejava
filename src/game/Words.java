package game;

import java.util.Random;

public class Words {
    private String[] randonwords = { "animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights",
            "properties", "ceremony", "independence", "beneath", "information", "students", "employee" };
    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Words() {
        this.selectedWord = randonwords[this.random.nextInt(randonwords.length)];
        this.letters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder word = new StringBuilder();
        // letters[3] = 'a';
        for (char letter : letters) {
            word.append(letter == '\u0000' ? '-' : letter);
            word.append(' ');
        }
        return word.toString();
    }

    public boolean isGuessedRight() {
        for (char letter : letters) {
            System.out.println(letter);
            if (letter == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public void guess(char letter) {
        for (int i = 0; i < this.selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i))
                this.letters[i] = letter;
        }
    }
}

package game;

import java.util.ArrayList;

public class Game {

  private String word;
  private Integer attempts = 10;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();

  public Game(WordChooser wordChooser) {
    this.word = wordChooser.getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    StringBuilder hiddenWord = new StringBuilder(this.word);
    
    for(int i = 0; i < hiddenWord.length(); i++) {
      Character currentLetter = this.word.charAt(i);
      if (i != 0 && letterNotGuessed(currentLetter)) {
        hiddenWord.replace(i, i + 1, "_");
      }
    }
    return hiddenWord.toString();
  }

  public Integer getRemainingAttempts() {
    return this.attempts;
  }

  public Boolean guessLetter(Character letter) {
    if(this.word.indexOf(letter) == -1) {
      this.attempts--;
      return false;
    }
    guessedLetters.add(letter);
    return true;
  }

  private Boolean letterNotGuessed(Character letter) {
    return guessedLetters.indexOf(letter) == -1;

  }
}

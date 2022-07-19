package game;

import java.util.Random;

public class Game {

  private String word;
  private Integer attempts = 10;
  private static final String[] DICTIONARY = {
 "MAKERS",
 "CANDIES",
 "DEVELOPER",
 "LONDON"
  };

  public Game(String word) {
    this.word = getRandomWordFromDictionary();
  }

  public static void main(String[] args) {
    
  }

  public String getRandomWordFromDictionary(){

    return DICTIONARY[new Random().nextInt(DICTIONARY.length)];

  }

  public String getWordToGuess() {
    StringBuilder hiddenWord = new StringBuilder(this.word);
    
    for(int i = 0; i < hiddenWord.length(); i++) {
      if (i != 0) {
        hiddenWord.replace(i, i + 1, "_");
      }
    }
    return hiddenWord.toString();
  }

  public Integer getRemainingAttempts(){
    return this.attempts;

  }
}

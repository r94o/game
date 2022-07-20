package game;

public class Game {

  private String word;
  private Integer attempts = 10;

  public Game(WordChooser wordChooser) {
    this.word = wordChooser.getRandomWordFromDictionary();
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

  public Integer getRemainingAttempts() {
    return this.attempts;
  }
}

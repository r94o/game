package game;

public class Game {

  private String word;

  public Game(String word) {
    this.word = word;
  }

  public static void main(String[] args) {
    
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
}

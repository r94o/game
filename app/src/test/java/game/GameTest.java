package game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GameTest {

  Game game;

  @Before
  public void setup() {
    WordChooser mockedWordChooser = mock(WordChooser.class);
    when(mockedWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    game = new Game(mockedWordChooser);
  }
  @Test public void testGetsWordToGuess() {
    assertEquals("M_____", game.getWordToGuess());
  }

  @Test public void testGetsWordToGuessAfterCorrectGuess() {
    game.guessLetter('K');
    assertEquals("M_K___", game.getWordToGuess());
  }

  @Test public void testNumberOfAttempts() {
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test public void testGuessLetterIncorrectReducesAttempts() {
    game.guessLetter('Y');
    assertEquals("Remaining attempts decrements with incorrect guess", Integer.valueOf(9), game.getRemainingAttempts());
  }

  @Test public void testGuessLetterReturnValueIncorrect() {
    assertFalse("Returns false if letter is not in the word", game.guessLetter('Y'));
  }

  @Test public void testGuessLetterReturnValueCorrect() {
    assertTrue("Returns true if letter is in the word", game.guessLetter('R'));
  }
}
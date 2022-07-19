package game;

import java.util.Random;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class WordChooserTest {
    @Test public void testRandomWord(){
        Random mockedRandom = mock(Random.class);
        when(mockedRandom.nextInt()).thenReturn(0);
        WordChooser wordChooser = new WordChooser(mockedRandom);
        assertEquals(String.valueOf("MAKERS"), wordChooser.getRandomWordFromDictionary());
    }
}

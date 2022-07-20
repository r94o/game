package game;

import java.util.Random;

public class WordChooser {

    private static final String[] DICTIONARY = {
        "MAKERS",
        "CANDIES",
        "DEVELOPER",
        "LONDON"
         };

    public String getRandomWordFromDictionary() {
      return DICTIONARY[new Random().nextInt(DICTIONARY.length)];
    }


}

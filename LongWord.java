import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LongWord {
        public static String findLongWord(String file) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                String longWord = "";
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (word.length() > longWord.length()) {
                            longWord = word;
                        }
                    }
                }
                return longWord;
            }
        }
    }




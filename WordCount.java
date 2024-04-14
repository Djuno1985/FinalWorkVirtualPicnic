import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
        public static int wordCount(String file) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                int count = 0;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    count += words.length;
                }
                return count;
            }
        }
    }



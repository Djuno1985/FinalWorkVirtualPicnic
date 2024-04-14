import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class WordFrequency {
        public static Map<String, Integer> wordFrequency(String file) throws IOException {
            Map<String, Integer> wordFreq = new HashMap<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
                    }
                }
            }
            return wordFreq;
        }

        public static void printWordFrequency(String file) throws IOException {
            Map<String, Integer> wordFreq = wordFrequency(file);
            System.out.println("Частота слов в файле:");
            for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }





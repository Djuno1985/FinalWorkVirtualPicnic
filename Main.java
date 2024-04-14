import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "input.txt";

        try {
            int wordCount = WordCount.wordCount(file);
            System.out.println("Количество слов: " + wordCount);

            String longWord = LongWord.findLongWord(file);
            System.out.println("Самое длинное слово: " + longWord);

            WordFrequency.printWordFrequency(file);


    } catch (IOException e) {
        System.err.println("Ошибка чтения файла: " + e.getMessage());
    }

    }

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Demo {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pineapple");

        // Example of using map to convert each word to uppercase
        List<String> upperCaseWords = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase words: " + upperCaseWords);

        // Example of using filter to get words starting with 'a'
        List<String> wordsStartingWithA = words.stream()
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Words starting with 'a': " + wordsStartingWithA);

        // Example of using sorted to sort words in ascending order
        List<String> sortedWords = words.stream()
                .sorted((word1, word2) -> word1.compareTo(word2))
                .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords);

        // Example of using forEach to print each word
        System.out.print("Words: ");
        words.forEach(word -> System.out.print(word + " "));
        System.out.println();

        // Example of using reduce to concatenate all words
        String concatenatedWords = words.stream()
                .reduce("", (partialResult, word) -> partialResult + word);
        System.out.println("Concatenated words: " + concatenatedWords);
    }
}
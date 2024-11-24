import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        String text = "This is a test. This test is only a test.";

        Map<String, Integer> wordCounts = countWordFrequency(text);

        displayWordFrequencies(wordCounts);
    }


    public static Map<String, Integer> countWordFrequency(String text) {

        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
           wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }


    public static void displayWordFrequencies(Map<String, Integer> wordCounts) {

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCounts.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Word frequencies (sorted):");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
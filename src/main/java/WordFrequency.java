import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Hello Everyone! Welcome to the DCI. Start to your Career.";
        countWordFrequency(text);

    }
    public static void countWordFrequency(String text) {
        // Remove punctuation and convert the text to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store the word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for(String word: words){
            //update the word count and retrieve the current count of the word from the map, defaulting to 0 if the word is not found.
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Display the word frequencies in descending order
        System.out.println("Word frequencies (in descending order):");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

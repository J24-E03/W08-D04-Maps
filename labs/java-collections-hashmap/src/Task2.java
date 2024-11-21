import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "Given a sentence (or multiple sentences from a text), create a HashMap where the key is the word, and the value is the number of times the word appears.";

        String[] words = Pattern.compile("\\W+", Pattern.CASE_INSENSITIVE).split(sentence);
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : words) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 1);
            } else {
                hashMap.put(s, hashMap.get(s) + 1);
            }
        }

        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}

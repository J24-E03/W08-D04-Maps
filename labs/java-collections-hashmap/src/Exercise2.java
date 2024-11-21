import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        String text = "Learning Java is fun. Java is versatile and powerful. Learning new skills improves your knowledge.";
        Map<String, Integer> words = new HashMap<>();

        System.out.println(text);
        String[] splitText = text.toLowerCase().replaceAll("[,.?!]", " ").split("\\s+");
        for (String word : splitText) {
            if (!words.containsKey(word)) {
                words.put(word, 1);
            } else {
                words.put(word, words.get(word) + 1);
            }
        }

        System.out.println(words);
    }
}

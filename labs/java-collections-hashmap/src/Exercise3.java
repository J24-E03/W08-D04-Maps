import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        String text = "programming";
        System.out.println("Character Frequency in " + text + ":");
        System.out.println(createMap(text.toLowerCase()));
    }

    public static Map<Character, Integer> createMap(String text) {
        Map<Character, Integer> charsMap = new HashMap<>();
        for (int index = 0; index < text.length(); index++) {
            if (!charsMap.containsKey(text.charAt(index))) {
                charsMap.put(text.charAt(index), 1);
            } else {
                charsMap.put(text.charAt(index), charsMap.get(text.charAt(index)) + 1);
            }
        }
        return charsMap;
    }
}

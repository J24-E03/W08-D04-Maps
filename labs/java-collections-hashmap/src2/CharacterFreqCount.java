import java.util.HashMap;
import java.util.Map;

public class CharacterFreqCount {
    public static void main(String[] args) {

        String input = "Programming";

            Map<Character, Integer> charCounts = countCharacterFrequency(input);

           displayCharacterFrequencies(charCounts);
    }

        public static Map<Character, Integer> countCharacterFrequency(String input) {

            input = input.toLowerCase();


            HashMap<Character, Integer> charCounts = new HashMap<>();


            for (char c : input.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
            return charCounts; }


        public static void displayCharacterFrequencies(Map<Character, Integer> charCounts){ System.out.println("Character frequencies:");
         for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) { System.out.println(entry.getKey() + " -> " + entry.getValue());
}
}
}




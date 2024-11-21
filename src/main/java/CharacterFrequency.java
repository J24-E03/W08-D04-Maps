import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "Programming";
        HashMap<Character, Integer> characterCount = new HashMap<>();

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (Character character : text.toLowerCase().toCharArray()) {
            characterCount.put(character, characterCount.getOrDefault(character, 0) + 1);
        }

        System.out.println("Character count: " + characterCount);
        System.out.println(" ");

    }
}

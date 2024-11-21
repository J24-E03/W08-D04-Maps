import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String word = "programming";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (!hashMap.containsKey(word.charAt(i))) {
                hashMap.put(word.charAt(i), 1);
            } else {
                hashMap.put(word.charAt(i), hashMap.get(word.charAt(i)) + 1);
            }
        }
        System.out.println(hashMap);
    }
}

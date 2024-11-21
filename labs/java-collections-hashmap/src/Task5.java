import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 13, 14));

        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i : first) {
            if (!second.contains(i)) {
                hashMap.put(i, "first");
            }
        }

        for (int i : second) {
            if (!first.contains(i)) {
                hashMap.put(i, "second");
            }
        }
        System.out.println(hashMap);
    }
}

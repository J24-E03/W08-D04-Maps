import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 7, 8, 9, 14, 15));

        Map<Integer, String> uniqueNumbers = new HashMap<>();
        for (int num : list1) {
            if (!uniqueNumbers.containsKey(num)) {
                uniqueNumbers.put(num, "List1");
            } else {
                uniqueNumbers.remove(num);
            }
        }

        for (int num : list2) {
            if (!uniqueNumbers.containsKey(num)) {
                uniqueNumbers.put(num, "List2");
            } else {
                uniqueNumbers.remove(num);
            }
        }

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Unique elements:" + uniqueNumbers);
    }
}

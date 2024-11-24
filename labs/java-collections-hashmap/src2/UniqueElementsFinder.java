import java.util.*;

public class UniqueElementsFinder {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

         HashMap<Integer, String> uniqueElements = findUniqueElements(list1, list2);


        System.out.println("Unique elements from both lists:");
        uniqueElements.forEach((key, value) ->
                System.out.println("Element: " + key + ", Found in: " + value)
        );
    }

    public static HashMap<Integer, String> findUniqueElements(List<Integer> list1, List<Integer> list2) {
        HashMap<Integer, String> uniqueMap = new HashMap<>();


        for (int num : list1) {
            if (!list2.contains(num)) {
                uniqueMap.put(num, "List 1");
            }
        }

         for (int num : list2) {
            if (!list1.contains(num)) {
                uniqueMap.put(num, "List 2");
            }
        }

        return uniqueMap;
    }
}
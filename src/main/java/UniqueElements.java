import java.util.HashMap;
import java.util.List;

public class UniqueElements {
        public static void main(String[] args) {
            // Example lists
            List<Integer> list1 = List.of(1, 2, 3, 4, 5);
            List<Integer> list2 = List.of(4, 5, 6, 7, 8);

            // Call the method to find unique elements
            HashMap<Integer, String> uniqueElements = findUniqueElements(list1, list2);

            // Display the unique elements
            System.out.println(uniqueElements);
        }

        public static HashMap<Integer, String> findUniqueElements(List<Integer> list1, List<Integer> list2) {
            HashMap<Integer, String> uniqueMap = new HashMap<>();

            // Add elements of list1 to the map with "List 1" as the value
            for (Integer element : list1) {
                if (!list2.contains(element)) {
                    uniqueMap.put(element, "List 1");
                }
            }

            // Add elements of list2 to the map with "List 2" as the value
            for (Integer element : list2) {
                if (!list1.contains(element)) {
                    uniqueMap.put(element, "List 2");
                }
            }

            return uniqueMap;
        }
    }


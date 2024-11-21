package HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValuesExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Lion");

        List<String> uniqueAnimals = animals.stream().distinct().collect(Collectors.toList());
        List<String> uniqueFruits = fruits.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique fruits: " + uniqueFruits + ", Unique animals: " + uniqueAnimals);
    }
}
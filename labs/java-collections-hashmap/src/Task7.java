import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task7 {
    private static final HashMap<String, Double> HASH_MAP = new HashMap<>();

    public static void main(String[] args) {
        addGrade("Patrick", 8.0);
        addGrade("Oliver", 3.0);
        addGrade("George", 6.0);
        addGrade("Hans", 10.0);
        addGrade("Wolfgang", 4.0);
        System.out.println(HASH_MAP);
        System.out.println(getGrade("Wolfgang"));
        averageGrade();
        System.out.println(highestGrade());
        System.out.println(studentsAboveThreshold(4));
    }

    private static void addGrade(String studentName, double grade) {
        HASH_MAP.put(studentName, grade);
    }

    private static double getGrade(String studentName) {
        return HASH_MAP.get(studentName);
    }

    private static void averageGrade() {
        double sum = 0;
        for (double d : HASH_MAP.values()) {
            sum += d;
        }
        System.out.println(sum / HASH_MAP.size());
    }

    private static Map.Entry<String, Double> highestGrade() {
        return Collections.max(HASH_MAP.entrySet(), Map.Entry.comparingByValue());
    }

    private static List<Map.Entry<String, Double>> studentsAboveThreshold(double threshold) {
        return HASH_MAP.entrySet().stream().filter(entry -> entry.getValue() > threshold).toList();
    }
}

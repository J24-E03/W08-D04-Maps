import model.Employee;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jackie", 3000.0);
        Employee employee2 = new Employee("Tom", 6000.0);
        Employee employee3 = new Employee("William", 2000.0);
        Employee employee4 = new Employee("Christian", 7000.0);
        Employee employee5 = new Employee("Johnie", 4000.0);

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put(employee1.getName(), employee1.getSalary());
        hashMap.put(employee2.getName(), employee2.getSalary());
        hashMap.put(employee3.getName(), employee3.getSalary());
        hashMap.put(employee4.getName(), employee4.getSalary());
        hashMap.put(employee5.getName(), employee5.getSalary());

        System.out.println("Highest salary:");
        System.out.println(Collections.max(hashMap.entrySet(), Map.Entry.comparingByValue()));
        System.out.println("\nLowest salary:");
        System.out.println(Collections.min(hashMap.entrySet(), Map.Entry.comparingByValue()));

        System.out.println("\nAverage salary");
        double sum = 0;
        for (double d : hashMap.values()) {
            sum += d;
        }
        System.out.println(sum / hashMap.size());

        System.out.println("\nThreshold Task");
        hashMap.entrySet().stream().filter(entry -> entry.getValue() > 3000.0).forEach(System.out::println);
    }
}

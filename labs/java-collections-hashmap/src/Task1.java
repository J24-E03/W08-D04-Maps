import model.Employee;

import java.util.HashMap;

public class Task1 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ben", 10);
        Employee employee2 = new Employee("Robert", 11);
        Employee employee3 = new Employee("Frank", 12);

        HashMap<String, Integer> map = new HashMap<>();
        map.put(employee1.getName(), employee1.getId());
        map.put(employee2.getName(), employee2.getId());
        map.put(employee3.getName(), employee3.getId());

        System.out.println(employee1.getName() + ": " + map.get(employee1.getName()));
        System.out.println(employee2.getName() + ": " + map.get(employee2.getName()));
        System.out.println(employee3.getName() + ": " + map.get(employee3.getName()));

        System.out.println("\nBefore removal: " + map);
        map.remove(employee2.getName());
        System.out.println("After removal: " + map);

        System.out.println(map);
    }
}

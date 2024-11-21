import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();

        employees.put("Maryam Ghayoomi Mohammadi", 1364);
        employees.put("Sumayya Safoora", 1350);
        employees.put("Marcel John Sägebarth", 1300);
        employees.put("Aron Turowski", 1390);
        employees.put("Kathrin Zirbes", 1385);

        System.out.println("Employees:");
        System.out.println(employees);

        // Retrieve employees' ID using their name
        System.out.println("\nRetrieving employees' ID using their name:");
        for (String name : employees.keySet()) {
            System.out.println(name + "ID = " + employees.get(name));
        }


        // Remove an employee from the HashMap by name.
        System.out.println("\nRemoving Aron Turowski with ID " +  employees.get("Aron Turowski") + " from the map ...");
        employees.remove("Aron Turowski");

        // Display all employees in the HashMap
        System.out.println("\nEmployees:");
        System.out.println(employees);
    }
}

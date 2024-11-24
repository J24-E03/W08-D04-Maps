import java.util.HashMap;
import java.util.Scanner;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Retrieve Employee ID");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    employees.put(name, id);
                    System.out.println("Employee added.");
                }
                case 2 -> {
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    if (employees.containsKey(name)) {
                        System.out.println("Employee ID: " + employees.get(name));
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    if (employees.remove(name) != null) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                }
                case 4 -> {
                    if (employees.isEmpty()) {
                        System.out.println("No employees in the system.");
                    } else {
                        System.out.println("Employees: " + employees);
                    }
                }
                case 5 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        //Create a HashMap to store employee names (as keys) and their corresponding employee IDs (as values).
        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("John", 1);
        employee.put("Jane", 2);
        employee.put("Jack", 3);
        Scanner scanner = new Scanner(System.in);

        // Add new employees
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee ID: ");
        int id = scanner.nextInt();
        employee.put(name, id);
        scanner.nextLine();

        //Retrieve an employee's ID using their name.
        System.out.println("Enter employee name to retrieve ID: ");
        String retrieveName = scanner.nextLine();
        if(employee.containsKey(retrieveName)){
            System.out.println("Employee ID : " + employee.get(retrieveName));
        } else {
            System.out.println("Employee not found.");
        }
        //Remove an employee from the HashMap by name.
        System.out.println("Enter employee name to remove: ");
        String removeName = scanner.nextLine();
        if(employee.containsKey(removeName)){
            employee.remove(removeName);
            System.out.println("Employee"  +  removeName +  "removed");
        } else {
            System.out.println("Employee not found");
        }

        //Display all employees in the HashMap.
        System.out.println("All Employees: ");
        for(String allEmployee : employee.keySet()){
            System.out.println("Name: " + employee + ", ID: " + employee.get(name));
        }
        scanner.close();





    }
}

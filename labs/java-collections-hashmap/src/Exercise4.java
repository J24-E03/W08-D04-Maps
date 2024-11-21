import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise4 {
    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        employees.put("employee1", 80010.00);
        employees.put("employee2", 86000.00);
        employees.put("employee3", 80020.00);
        employees.put("employee4", 80200.00);
        employees.put("employee5", 85050.00);

        System.out.println(employees);
        addOrUpdateSalary("employee6", 80000, employees);
        System.out.println("employee6 added through the addOrUpdateSalary method, with a salary of: " + employees.get("employee6"));
        addOrUpdateSalary("employee2",  employees.get("employee2") * 1.1, employees);
        System.out.println("New Salary for employee2: " + employees.get("employee2"));

        highestSalary(employees);
        lowestSalary(employees);
        System.out.println("Average Salary of Employees: " + averageSalary(employees));

        System.out.println("Lucky employees with a salary above $85000.00:");
        System.out.println(findLuckyEmployees(employees, 85000.00));


    }

    public static void addOrUpdateSalary(String name, double salary, Map<String, Double> employeses) {
        employeses.put(name, salary);
    }

    public static double highestSalary(Map<String, Double> employeses) {
        double maxSalary = 0.0;
        String name = "";
        for (String employee : employeses.keySet()) {
            if (employeses.get(employee) > maxSalary) {
                maxSalary = employeses.get(employee);
                name = employee;
            }
        }

        System.out.println("Highest Salary with the amount of $" + maxSalary + " belongs to " + name);
        return maxSalary;
    }

    public static void lowestSalary(Map<String, Double> employeses) {

        double minSalary = highestSalary(employeses);
        String name = "";
        for (String employee : employeses.keySet()) {
            if (employeses.get(employee) < minSalary) {
                minSalary = employeses.get(employee);
                name = employee;
            }
        }

        System.out.println("Lowest Salary with the amount of $" + minSalary + " belongs to " + name);

    }

    public static double averageSalary(Map<String, Double> employeses) {
        double sum = 0.0;
        for (double salary : employeses.values()) {
            sum += salary;
        }
        return Math.round((sum / employeses.size()) * 100.0) / 100.0;
    }

    public static List<String> findLuckyEmployees(Map<String, Double> employeses, double threshold) {
        List<String> luckyEmployees = new ArrayList<>();
        for (String employee : employeses.keySet()) {
            if (employeses.get(employee) > threshold) {
                luckyEmployees.add(employee);
            }
        }
        return luckyEmployees;
    }
}

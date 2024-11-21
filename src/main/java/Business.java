import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Business {

        // HashMap to store the employee name as key and their salary as value
        private Map<String, Double> employees;

        // Constructor to initialize the HashMap
    public Business() {
            employees = new HashMap<>();
        }

        // Method to add or update an employee's salary
        public void addOrUpdateEmployeeSalary(String name, double salary) {
            employees.put(name, salary);
        }

        // Method to find the employee with the highest salary
        public String findEmployeeWithHighestSalary() {
            if (employees.isEmpty()) {
                return "No employees available.";
            }

            String highestPaidEmployee = null;
            double highestSalary = Double.MIN_VALUE;

            for (Map.Entry<String, Double> entry : employees.entrySet()) {
                if (entry.getValue() > highestSalary) {
                    highestSalary = entry.getValue();
                    highestPaidEmployee = entry.getKey();
                }
            }

            return highestPaidEmployee + " with a salary of " + highestSalary;
        }

        // Method to find the employee with the lowest salary
        public String findEmployeeWithLowestSalary() {
            if (employees.isEmpty()) {
                return "No employees available.";
            }

            String lowestPaidEmployee = null;
            double lowestSalary = Double.MAX_VALUE;

            for (Map.Entry<String, Double> entry : employees.entrySet()) {
                if (entry.getValue() < lowestSalary) {
                    lowestSalary = entry.getValue();
                    lowestPaidEmployee = entry.getKey();
                }
            }

            return lowestPaidEmployee + " with a salary of " + lowestSalary;
        }

        // Method to calculate the average salary of all employees
        public double calculateAverageSalary() {
            if (employees.isEmpty()) {
                return 0.0;
            }

            double totalSalary = 0;

            for (double salary : employees.values()) {
                totalSalary += salary;
            }

            return totalSalary / employees.size();
        }

        // Method to provide a list of employees whose salary is above a certain threshold
        public List<String> findEmployeesAboveSalaryThreshold(double threshold) {
            List<String> result = new ArrayList<>();

            for (Map.Entry<String, Double> entry : employees.entrySet()) {
                if (entry.getValue() > threshold) {
                    result.add(entry.getKey());
                }
            }

            return result;
        }
    public static void main(String[] args) {
        Business business = new Business();


            business.addOrUpdateEmployeeSalary("Alice", 50000);
            business.addOrUpdateEmployeeSalary("Bob", 75000);
            business.addOrUpdateEmployeeSalary("Charlie", 40000);
            business.addOrUpdateEmployeeSalary("Diana", 95000);

            System.out.println("Employee with the highest salary: " + business.findEmployeeWithHighestSalary());
            System.out.println("Employee with the lowest salary: " + business.findEmployeeWithLowestSalary());
            System.out.println("Average salary: " + business.calculateAverageSalary());
            System.out.println("Employees with salary above 60000: " + business.findEmployeesAboveSalaryThreshold(60000));
        }
    }


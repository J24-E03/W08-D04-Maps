import java.util.*;
import java.util.stream.Collectors;
import java.util.List;

public class Salary {
    public static void main(String[] args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);


        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        employeeSalary.keySet().forEach(employee -> {
            System.out.println(employee + " => " + employeeSalary.get(employee));
        });

        DoubleSummaryStatistics empSalary = employeeSalary.stream().collect(Collectors
                .summarizingDouble(employeeSalary::getSalary));

        System.out.println("Average Salary in the organisation = " + empSalary.getAverage());
        System.out.println("Highest Salary in the organisation  = " + empSalary.getMax());
        System.out.println("Lowest Salary in the organisation = " + empSalary.getMin());
    }
}
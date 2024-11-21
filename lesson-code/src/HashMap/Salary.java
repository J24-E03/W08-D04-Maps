import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
    }


}
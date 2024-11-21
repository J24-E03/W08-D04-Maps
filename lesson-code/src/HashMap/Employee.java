package HashMap;

import java.util.Map;
import java.util.HashMap;

public class Employee {
    Integer empId;
    String name;

    @Override
    public String toString() {
        return "Employee Id: " + empId + " Employee name: " + name;
    }


    public static void main(String[] args) {
        Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
        Employee emp1 = new Employee();
        emp1.name = "Moore";
        emp1.empId = 3;

        Employee emp2 = new Employee();

        emp2.name = "Thawn";
        emp2.empId = 2;


        Employee emp3 = new Employee();
        emp3.name = "Core";
        emp3.empId = 1;


        empMap.put(emp1.empId, emp1);
        empMap.put(emp2.empId, emp2);
        empMap.put(emp3.empId, emp3);

        System.out.println(empMap.get(2));

        //Iterate over each element in map
        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


    }
}
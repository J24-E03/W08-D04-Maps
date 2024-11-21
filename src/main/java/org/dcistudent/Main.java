package org.dcistudent;

import org.dcistudent.models.Employee;
import org.dcistudent.models.inventory.Inventory;
import org.dcistudent.models.inventory.Product;
import org.dcistudent.models.university.Management;
import org.dcistudent.models.university.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String TEXT = "This is a test. This test is only a test. In the event of an actual emergency, the test would " +
            "be followed by additional instructions. This is only a test.";

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this
                .exercise1()
                .exercise2(TEXT)
                .exercise3(TEXT)
                .exercise4()
                .exercise5()
                .exercise6()
                .exercise7()
        ;
    }

    private Main exercise1 () {
        Map<String, Integer> employees = new HashMap<>();

        employees.put("John", 1);
        employees.put("Jane", 2);
        employees.put("Jack", 3);

        System.out.println("Employees: " + employees);

        // receive id
        System.out.printf("Employee id: %d%n", employees.get("John"));

        // remove employee
        employees.remove("Jane");

        // display rest of employees
        System.out.println("Employees: " + employees);

        return this;
    }

    public Main exercise2(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        text = text.replaceAll("[^a-zA-Z\s+]", "").toLowerCase();
        for (String word : text.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 1) + 1);
        }

        // @todo: sorting
        System.out.println("Word count: " + wordCount);
        System.out.println("----------");

        return this;
    }

    public Main exercise3(String text) {
        Map<Character, Integer> charCount = new HashMap<>();

        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (Character character : text.toLowerCase().toCharArray()) {
            charCount.put(character, charCount.getOrDefault(character, 1) + 1);
        }

        System.out.println("Character count: " + charCount);
        System.out.println("----------");

        return this;
    }

    public Main exercise4() {
        Double salaryLowest = Employee.SALARY_MAX;
        Double salaryHighest = 0.0;
        Double salaryTotal = 0.0;
        Double salaryThreshold = 2600.0;
        Map<Integer, Employee> employees = new HashMap<>();
        List<String> employeesAboveThreshold = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setId(1); employee1.setName("John"); employee1.setSalary(2500.0);

        Employee employee2 = new Employee();
        employee2.setId(2); employee2.setName("Jane"); employee2.setSalary(3000.0);

        Employee employee3 = new Employee();
        employee3.setId(3); employee3.setName("Jack"); employee3.setSalary(2750.0);

        employees.putAll(
                Map.of(employee1.getId(), employee1, employee2.getId(), employee2, employee3.getId(), employee3)
        );

        for (Employee employee : employees.values()) {
            salaryTotal += employee.getSalary();

            if (employee.getSalary() > salaryHighest) {
                salaryHighest = employee.getSalary();
            }

            if (employee.getSalary() < salaryLowest) {
                salaryLowest = employee.getSalary();
            }

            if (employee.getSalary() > salaryThreshold) {
                employeesAboveThreshold.add(employee.getName());
            }
        }

        System.out.printf("Salary lowest: %.2f%n", salaryLowest);
        System.out.printf("Salary highest: %.2f%n", salaryHighest);
        System.out.printf("Salary average: %.2f%n", salaryTotal / employees.size());
        System.out.printf("Employees above %.2f: %s%n", salaryThreshold, employeesAboveThreshold);
        System.out.println("----------");

        return this;
    }

    public Main exercise5() {
        Map<Integer, String> unique = new HashMap<>();
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        for (Integer i : list1) {
            if (unique.containsKey(i)) {
                continue;
            }

            unique.put(i, "List 1");
        }

        for (Integer i : list2) {
            if (unique.containsKey(i)) {
                unique.remove(i);
                continue;
            }

            unique.put(i, "List 2");
        }

        System.out.println("Unique elements: " + unique);
        System.out.println("----------");

        return this;
    }

    public Main exercise6() {
        Inventory inventory = new Inventory();

        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setQuantity(10);
        inventory.addProduct(product1);

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setQuantity(20);
        inventory.addProduct(product2);

        Product product3 = new Product();
        product3.setName("Product 3");
        product3.setQuantity(30);
        inventory.addProduct(product3);

        System.out.println("Inventory: " + inventory.getAll());
        System.out.println("Product 2 quantity: " + inventory.getQuantity("Product 2"));
        inventory.removeProduct("Product 2");
        System.out.println("Inventory: " + inventory.getAll());
        System.out.println("----------");

        return this;
    }

    public Main exercise7() {
        Student student1 = new Student();
        student1.setName("John");
        student1.setGrade(66.0);
        Student student2 = new Student();
        student2.setName("Jane");
        student2.setGrade(80.0);
        Student student3 = new Student();
        student3.setName("Jack");
        student3.setGrade(90.0);

        Management management = new Management();
        management
                .addStudent(student1)
                .addStudent(student2)
                .addStudent(student3)
        ;

        System.out.printf("Grade for %s: %.2f%n", student1.getName(), management.getGrade(student1.getName()));
        System.out.printf("Average grade: %.2f%n", management.getAverageGrade());
        System.out.printf("Highest grade: %.2f%n", management.getHighestGrade());
        System.out.printf(
                "Students above threshold: %s%n",
                management.getAboveGradeThreshold(management.getStudentGradeTreshold())
        );

        return this;
    }
}
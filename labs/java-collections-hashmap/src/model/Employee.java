package model;

public class Employee {
    private final String name;
    private int id;
    private double salary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void updateSalary(char operation, double amount) {
        switch (operation) {
            case '+':
                this.salary += amount;
                break;
            case '-':
                this.salary -= amount;
                break;
            case '*':
                this.salary *= amount;
                break;
            case '/':
                this.salary /= amount;
                break;
            default:
                System.out.println("Invalid operator entered!");
        }
    }
}

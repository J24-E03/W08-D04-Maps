import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
   private final HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();
        // Add some grades
        studentGrades.addGrade("Alice", 85.5);
        studentGrades.addGrade("Bob", 92.0);
        studentGrades.addGrade("Charlie", 76.0);
        studentGrades.addGrade("David", 88.5);

        // Get a student's grade
        studentGrades.getGrade("Alice");

        // Get the average grade
        studentGrades.averageGrade();

        // Get the student with the highest grade
        studentGrades.highestGrade();

        // List students with grades above 80
        studentGrades.studentsAboveThreshold(80.0);
    }

    // Method to add or update a student's grade
    public void addGrade(String studentName, double grade) {
        grades.put(studentName, grade);
        System.out.println("Grade of " + studentName + " has been set to " + grade);
    }

    // Method to retrieve a student's grade
    public void getGrade(String studentName) {
        if (grades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade: " + grades.get(studentName));
        } else {
            System.out.println(studentName + " is not in the system.");
        }
    }

    // Method to calculate the average grade of all students
    public void averageGrade() {
        if (grades.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }

        double total = 0;
        for (double grade : grades.values()) {
            total += grade;
        }

        double average = total / grades.size();
        System.out.println("Average grade: " + average);
    }

    // Method to find the student with the highest grade
    public void highestGrade() {
        if (grades.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }

        double maxGrade = Double.MIN_VALUE;
        String topStudent = "";

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }

        System.out.println("Student with the highest grade: " + topStudent + " with grade: " + maxGrade);
    }

    // Method to list all students with grades above a certain threshold
    public void studentsAboveThreshold(double threshold) {
        List<String> studentsAboveThreshold = new ArrayList<>();

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if (entry.getValue() > threshold) {
                studentsAboveThreshold.add(entry.getKey());
            }
        }

        if (studentsAboveThreshold.isEmpty()) {
            System.out.println("No students have grades above " + threshold);
        } else {
            System.out.println("Students with grades above " + threshold + ": " + studentsAboveThreshold);
        }
    }

}

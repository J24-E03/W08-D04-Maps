import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
    private HashMap<String, Double> grades;

    public StudentGrades() {
        grades = new HashMap<>();
    }

    public void addGrade(String studentName, double grade) {
        grades.put(studentName, grade);
        System.out.println(studentName + " added/updated with grade: " + grade);
    }

    public Double getGrade(String studentName) {
        return grades.getOrDefault(studentName, null);
    }

    public double averageGrade() {
        if (grades.isEmpty()) return 0.0;

        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String highestGrade() {
        if (grades.isEmpty()) return "No students available.";

        String topStudent = "";
        double highestGrade = Double.MIN_VALUE;

        for (String student : grades.keySet()) {
            if (grades.get(student) > highestGrade) {
                highestGrade = grades.get(student);
                topStudent = student;
            }
        }
        return topStudent + " with grade: " + highestGrade;
    }

    public List<String> studentsAboveThreshold(double threshold) {
        List<String> aboveThreshold = new ArrayList<>();

        for (String student : grades.keySet()) {
            if (grades.get(student) > threshold) {
                aboveThreshold.add(student);
            }
        }
        return aboveThreshold;
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Testing methods
        studentGrades.addGrade("Alice", 89.5);
        studentGrades.addGrade("Bob", 76.0);
        studentGrades.addGrade("Charlie", 92.0);
        studentGrades.addGrade("Diana", 68.5);

        System.out.println("Grade of Bob: " + studentGrades.getGrade("Bob"));
        System.out.println("Average grade: " + studentGrades.averageGrade());
        System.out.println("Top student: " + studentGrades.highestGrade());
        System.out.println("Students above 80: " + studentGrades.studentsAboveThreshold(80));
    }
}

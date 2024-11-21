import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise7 {
    public static Map<String, Double> students = new HashMap<>();
    public static void main(String[] args) {

        students.put("Student1", 20.0);
        students.put("Student2", 17.0);
        students.put("Student3", 19.5);
        students.put("Student4", 19.0);
        students.put("Student5", 18.0);
        students.put("Student6", 12.0);
        students.put("Student7", 15.0);
        students.put("Student8", 14.5);
        students.put("Student9", 10.5);
        students.put("Student10", 7.0);
        students.put("Student11", 18.0);
        students.put("Student12", 19.0);

        System.out.println("My Students: ");
        System.out.println(students);

        // add or update grades
        System.out.println("\nAdding Student13 with grade 17.5");
        addGrade("Student13", 17.5);
        System.out.println(students);

        System.out.println("\nUpdating grade of Student9 to 9.5");
        addGrade("Student9", 9.5);
        System.out.println(students);

        // average grade
        System.out.println("Average Grade: " + averageGrade());

        // Top Student
        String topStudent = highestGrade();
        System.out.println("Top Student " + topStudent + " with Grade:" + students.get(topStudent));

        // students above a threshold
        System.out.println("Students with grade above 15.0:");
        System.out.println(studentsAboveThreshold(15.0));

    }

    public static void addGrade(String studentName, double grade) {
        students.put(studentName, grade);
    }

    public static double averageGrade() {
        double sum = 0.0;
        for (double grade : students.values()) {
            sum += grade;
        }

        return Math.round((sum / students.size()) * 100.0) / 100.0;
    }

    public static String highestGrade() {
        double maxGrade = 0.0;
        String name = "";

        for (String student : students.keySet()) {
            if (students.get(student) > maxGrade) {
                maxGrade = students.get(student);
                name = student;

            }
        }
        return name;
    }

    public static List<String> studentsAboveThreshold(double threshold){
        List<String> goodStudents = new ArrayList<>();
        for (String student : students.keySet()) {
            if (students.get(student) > threshold) {
                goodStudents.add(student);
            }
        }
        return goodStudents;
    }
}

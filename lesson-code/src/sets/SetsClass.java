package sets;

import java.util.*;

public class SetsClass {
    public static void main(String[] args) {
        hashset();
    }

    public static void hashset(){

//        set of unique unordered values
        ArrayList<String> studentsArrayList = new ArrayList<>(Arrays.asList("Paul","Marcel","Sumayya","Mihai","Sumayya"));

        HashSet<String> students = new HashSet<>(studentsArrayList);

        System.out.println(studentsArrayList);

        System.out.println(students);

        students.add("Hasan");
        students.add("Martine");
        students.add("Kathrin");
        students.add("Martine");

        students.remove("Martine");

        System.out.println(students.contains("Kathrin"));

        System.out.println(students.size());
        students.clear();
        System.out.println(students);

        students.add("Hasan");
        students.add("Martine");
        students.add("Kathrin");
        System.out.println(students);


        HashSet<String> students2 = new HashSet<>(studentsArrayList);

        HashSet<String> students3 = new HashSet<>(Arrays.asList("John","Steve","Sumayya"));

        System.out.println("---------------");
        System.out.println(students2);
        System.out.println(students3);


//        adds all elements from both sets
        students2.addAll(students3);

        System.out.println(students2);

        students2.removeAll(students3);

        System.out.println(students2);

        System.out.println(students2);


//        next class lesson:
        LinkedHashSet<String> students4 = new LinkedHashSet<>();


        TreeSet<String> studentsTree = new TreeSet<>(Collections.reverseOrder());



        ArrayList<String> studentAL = new ArrayList<>(Arrays.asList("Mihai","Paul"));

        LinkedList<String> studentLL = new LinkedList<>(Arrays.asList("Mihai","Paul"));

        studentLL.add("Mihai");



    }


}

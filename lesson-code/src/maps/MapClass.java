package maps;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {

//        mapsImplementation();
//        linkedHashMap();
        treeMap();
    }

    public static void mapsImplementation(){

//        takes key and value pair
//        keys have to be unique
//        Hashamp is Unordered
        HashMap<Integer, String> students = new HashMap<>();

        ArrayList<String> something = new ArrayList<>();

        System.out.println(students);

//        adding values to hashmap if it is not present
//        if it is present it overwrites the value

        students.put(1,"Paul");
        students.put(2,"Martine");
        students.put(1,"Kathrin");


        System.out.println(students);


//        getting values from hashmap

        System.out.println(students.get(1));

//        returns null if value is not present
        System.out.println(students.get(4));


//        checking if value is in hashmap
        System.out.println(students.containsKey(5));

        System.out.println(students.containsValue("Martine"));


//        removing an element from hashmap

        students.remove(1);
        students.remove(2);

        System.out.println(students);


//        iterate through a hashmap

        students.put(20,"Aron");
        students.put(1,"Paul");
        students.put(2,"Martine");
        students.put(3,"Hasan");
        students.put(4,"Marcel");
        students.put(5,"Kai");
        students.put(6,"Maryam");

        System.out.println(students);

//        returns all the keys in a list
        System.out.println(students.keySet());
//        returns all the values in a list
        System.out.println(students.values());

//        iterating through a hashmap

        for(int id : students.keySet()){
            if(students.get(id).equals("Hasan")  || students.get(id).equals("Martine")){
//                students.remove(id);
                System.out.println(students.get(id));

            }
        }
        System.out.println(students);

//        size of hashmap

        System.out.println(students.size());


//        check if hashmap is empty:

        System.out.println(!students.isEmpty());






        /*
            1. Given the following ArrayList of grades = {'A','B','B','C','B','B','D','C','C'}
            2. add these to a hashmap as the key and the value should be how many times the grade appears in the arraylist
        */

        ArrayList<Character> gradesList = new ArrayList<>(Arrays.asList('A','B','B','C','B','B','D','C','C'));

        System.out.println(gradesList);

        HashMap<Character,Integer> gradesMap = new HashMap<>();

//        1. Loop through the arrayList
//        2. if the grade is already in the hashmap: increment the value by 1
//        3. if the grade is not in the hashmap I should add it to the hash map with value of: 1

        for(char grade : gradesList){
            if(!gradesMap.containsKey(grade)){
                gradesMap.put(grade,1);
            }
            else{
                gradesMap.put(grade,gradesMap.get(grade) + 1);
            }
        }

        System.out.println(gradesMap);

    }

    public static void linkedHashMap(){
//        linkedhashmap maintains the order of insertion
        LinkedHashMap<Integer,String> students = new LinkedHashMap<>();

        students.put(20,"Aron");
        students.put(2,"Martine");
        students.put(1,"Paul");
        students.put(3,"Hasan");
        students.put(4,"Marcel");
        students.put(5,"Kai");
        students.put(6,"Maryam");

        students.remove(4);

        System.out.println(students);

    }



    public static void treeMap(){

        TreeMap<Integer, String> students = new TreeMap<>();

//        TreeMap<Integer, String> students = new TreeMap<>(Collections.reverseOrder());

        students.put(1,"Marcel");
        students.put(300,"Aron");
        students.put(3,"Martine");
        students.put(2,"Paul");


        System.out.println(students);

        System.out.println(students.get(300));

        System.out.println(students.firstEntry());

        System.out.println(students.get(students.firstKey()));

//        System.out.println(students.f());

//        gets values between two keys
        System.out.println(students.subMap(1,301));

        System.out.println(students.headMap(4));

        System.out.println(students.tailMap(2));






    }
}

package class29.Assignments;

import java.util.HashMap;


public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
          Display name of each student.
         */

        HashMap<Integer, String> students=new HashMap<>();
        students.put(123,"Leo");
        students.put(125,"Nala");
        students.put(202,"Tomas");
        students.put(323,"John");
        students.put(111,"Mathew");
        students.put(188,"John");

        System.out.println(students.keySet());

        for(Object v:students.keySet()){
            System.out.println(students.get(v));
        }
    }
}

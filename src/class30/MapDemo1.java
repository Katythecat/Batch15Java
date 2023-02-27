package class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String>students=new HashMap<>();
        students.put(1,"Leo");
        students.put(2,"Tami");
        students.put(3,"Sam");
        students.put(4,"Abeera");
        //students.put(1,"Leo"); do not allowed duplicate key the latest key will be replace the first value

        System.out.println(students);
        System.out.println(students.get(3));//Sam work base on the key
        System.out.println(students.size());//4
        System.out.println(students.containsKey(4));//true
        System.out.println(students.containsValue("Sam"));//true
        System.out.println(students.remove(1));
        System.out.println(students);
        students.replace(2,"Asli");
        System.out.println(students);


        }
    }


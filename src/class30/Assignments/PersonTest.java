package class30.Assignments;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {
        TreeMap<Integer,Person> person=new TreeMap<>();
        person.put(1547,new Person("Leo","Thecat",28,75000));
        person.put(2587,new Person("Nala","Gray",32,150000));
        person.put(3688,new Person("Jakson","Wang",35,135000));
        person.put(1254,new Person("Taylor","Swiff",32,250000));


        var entrySet=person.entrySet();
        for(var entry:entrySet){
            System.out.println("User ID "+entry.getKey());
            entry.getValue().print();
        }
    }
}

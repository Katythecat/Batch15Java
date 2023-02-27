package class30.Assignments;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format John Smith=$100000
     */
    public static void main(String[] args) {
        Map<String, Integer> employees=new HashMap<>();
        employees.put("Sam Smith",135000);
        employees.put("Taylor Swiff",110000);
        employees.put("Lisa Blackpink",250000);
        employees.put("Miley Cyrus",135000);
        employees.put("Doja Cat",175000);

        var employee=employees.entrySet();
        String name="";
        int highestSal=0;
        for(var entry:employee){
            if(entry.getValue()>highestSal){
                highestSal=entry.getValue();
                name=entry.getKey();
            }
        }
        System.out.println(name+"=$"+highestSal);

    }
}

package class31;

import java.util.*;

public class ExcelReaderDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("Name","Leo");
        row1.put("age","8");
        row1.put("city","Miami");
        row1.put("salary","150000");

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("Name","Sam");
        row2.put("age","60");
        row2.put("city","Houston");
        row2.put("salary","125000");

        LinkedHashMap<String,String> row3=new LinkedHashMap<>();
        row3.put("Name","Fayed");
        row3.put("age","45");
        row3.put("city","Alexandria");
        row3.put("salary","129000");

        List<Map<String,String >> allRows=new ArrayList<>();
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);
        System.out.println(allRows);


    }
}

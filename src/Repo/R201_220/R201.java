package Repo.R201_220;

import java.util.*;
import java.util.Map;

public class R201 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22810");
        map.put("Country","United State");

        System.out.println("Size before remove "+map.size());
        map.clear();
        System.out.println("Size after remove "+map.size());
    }
}

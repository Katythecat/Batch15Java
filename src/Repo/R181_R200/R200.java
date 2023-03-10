package Repo.R181_R200;

import java.util.*;

public class R200 {
    public static void main(String[] args) {
        Map<String,String>map=new LinkedHashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22810");
        map.put("Country","United State");

        Collection<String> value=map.values();
        for(String values:value){
            System.out.println(values);
        }
    }
}

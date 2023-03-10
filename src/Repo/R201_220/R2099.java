package Repo.R201_220;

import java.util.*;

public class R2099 {
    public static void main(String[] args) {

        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10.0);

        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Apple");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);

        dataList.add(orangeMap);

        double totalPurchase=0;
        for(Map<String,Object> list:dataList){
            String items=(String)list.get("Items");//use .get() retrieve values from each key
            double price=(double) list.get("Price");
            double quantity=(double) list.get("Quantity");

            double subTotal=price*quantity;

            System.out.println("Items: "+items+" Price: "+price+" Quantity: "+quantity+" Subtotal: "+subTotal);

            totalPurchase+=subTotal;

        }
        System.out.println("Your purchase total "+totalPurchase);
    }
}

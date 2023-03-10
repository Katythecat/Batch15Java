package Repo.R201_220;

import java.util.*;

public class R209 {
    public static void main(String[] args) {
        List<Map<String,Object>> datalist=new ArrayList<>();
        
        Map<String,Object> apple=new HashMap<>();
        apple.put("Items","Apple");
        apple.put("Price",20.00);
        apple.put("Quantity",10.0);

        datalist.add(apple);

        Map<String,Object> orange=new HashMap<>();
        orange.put("Items","Orange");
        orange.put("Price",21.99);
        orange.put("Quantity",10.0);

        datalist.add(orange);

        double totalPurchase=0;
        for(Map<String,Object> data:datalist){
            String items=(String)data.get("Items");
            double price=(double) data.get("Price");
            double quantity=(double) data.get("Quantity");

            double subTotal=price*quantity;

            System.out.println("Items: "+items+" Price: "+price+" Quantity: "+quantity+" SubTotal: "+subTotal);
            System.out.println();
            totalPurchase+=subTotal;

        }
        System.out.println("Your Purchase total : "+totalPurchase);
    }
}


package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);
        fruit.put(null,null);
        System.out.println(fruit);


        HashMap<String , Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("Mascara",50.0);
        makeup.put("Eyeliner",12.2);
        makeup.put("Blush-on",12.2);
        System.out.println(makeup);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);





    }
}

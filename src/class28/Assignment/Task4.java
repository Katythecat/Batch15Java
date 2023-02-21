package class28.Assignment;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Orange juice");
        drinks.add("B 52");
        drinks.add("Long Iceland");
        drinks.add("Fireball");

        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
                if(drink.contains("a")||drink.contains("e")){
                    drinks.set(i,"water");
                }
            }
            System.out.println(drinks);
        }
    }


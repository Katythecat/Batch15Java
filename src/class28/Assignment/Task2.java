package class28.Assignment;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Hyundai");
        cars.add("BMW");

        for( String car:cars){
            System.out.println(car);
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println(cars);
    }
}

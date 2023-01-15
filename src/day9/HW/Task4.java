package day9.HW;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an array that can store names of cars and store 6 elements into it.
         Print all values from the array.
         */
        String[] cars = {"Honda", "Toyota", "BMW", "Porche", "Hyundai", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
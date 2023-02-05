package class19.Assignments;

public class Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.price = 3.5;
        apple.store = "Amazon Fresh";
        System.out.println(apple.price);
        System.out.println(apple.store);
        Apple.print();

        Banana banana = new Banana();
        banana.price = 1.5;
        banana.store = "QFC";
        banana.color = "Yellow";
        banana.lbs = 2.2;

        banana.show();
        Apple.print();

    }
}

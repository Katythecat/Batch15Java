package class21;

public class Animal {
    String name;
    String color="Black";
}
class Cat extends Animal {
    String color = "White";
    int age = 10;
    double weight;

    void print() {
        String color="Blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}



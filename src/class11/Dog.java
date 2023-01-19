package class11;

public class Dog {
    //attributes / properties/ fields
    String name;
    String breed;
    int age;
    double weight;
    String color;

    void display(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }

    //behaviours / methods /functions
    void bark(){
        System.out.println("Woof woof");
    }
    void sleep(){
        System.out.println("Zzzzzzzzzzzzzzzzz");
    }
    void eat(){
        System.out.println("Dog is eating...");
    }

}

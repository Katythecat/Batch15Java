package class19;

public class Donkey {
    String name;
    int age;
    double weigth;

    /*Donkey(){
        System.out.println("This is non argument constructor");
    }*/

    Donkey(String name, int age ){
        this.name=name;
        this.age=age;

    }

    void print() {
        System.out.println("Donkey's name is " + name + " age is " + age+
                " and weigth "+weigth);
    }
}
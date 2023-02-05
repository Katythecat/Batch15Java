package class19.Assignments;

public class Apple {

    double price;
    String store;

    static void print(){

        System.out.println("Let's eat fruit");
    }
}

class Banana extends Apple{
    String color;
    double lbs;

    void show(){
        System.out.println("I have "+color+" color "+"and "+lbs+" lbs."+" My cost "+
                price +" $ can buy me from "+store);
        System.out.println("Can you guess who am I?");
    }
    }


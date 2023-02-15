package class24;

public class AnimalTester {
    public static void main(String[] args) {
        /* Animal animal=new Animal();
         Animal animal1=new Cat(); //polymorphism
         Animal animal2=new Dog();
         animal.speak();*/

        Animal [] arr={new Cat(),new Dog()};
        for (Animal animal:arr){
            animal.speak();
            animal.eat();
        }
    }
}

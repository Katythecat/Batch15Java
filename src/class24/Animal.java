package class24;

public abstract class Animal {
    /*
    define speak eat methods and create 3 subclasses and override the
    speak eat methods
     */
    abstract void eat();

    abstract void speak();

}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog eat meat");
    }

    @Override
    void speak() {
        System.out.println("Dog woof woof");
    }
}

 class Cat extends Animal{
    @Override
     void eat(){
        System.out.println("Cat eat fish");
    }

    @Override
    void speak() {
        System.out.println("Cat meow meow");
    }
}
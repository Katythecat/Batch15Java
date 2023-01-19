package class11;

public class CatTester {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.name="Nala";
        cat1.color="Orange";
        cat1.age=3;
        cat1.weight=8;
        cat1.breed="Kaligo";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Leo";
        cat2.color="Black";
        cat2.age=8;
        cat2.weight=16;
        cat2.breed="Domestic";
        cat2.attitude=false;

        System.out.println(cat2.name);
        cat2.speak();

    }
}

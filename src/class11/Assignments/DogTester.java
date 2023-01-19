package class11.Assignments;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.name="Jenny";
        dog1.color="Brown";
        dog1.age=3;
        dog1.weight="35 Lbs";
        dog1.gender="Female";

        dog1.eat();
        dog1.behavior();
        dog1.logic();

        Dog dog2=new Dog();
        dog2.breed="Bulldog";
        dog2.name="Tyson";
        dog2.color="Black";
        dog2.age=2;
        dog2.weight="40 Lbs";
        dog2.gender="Male";

        dog2.eat();
        dog2.play();

        Dog dog3=new Dog();
        dog3.breed="Labrador";
        dog3.name="Elile";
        dog3.color="Brown";
        dog3.age=2;
        dog3.weight="30 Lbs";
        dog3.gender="Male";

        dog3.eat();
        dog3.behavior();


    }
}

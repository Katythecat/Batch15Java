package class17;

public class Dog {
    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dog(String dogName, String dogBreed, String dogColor,
        int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        breed = dogBreed;
        weight = dogWeight;
    }

    void printInfo() {
        System.out.println("Name "+name+" Breed "+breed
        +" Color "+color+" Age "+age+" Weight "+weight);


    }
}
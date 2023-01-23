package class12;

public class CarTester {
    public static void main(String[] args) {

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Gray";
        bmw.moveForward();
        bmw.applyBrakes();

        Car audi=new Car();
        audi.make="Audi";
        audi.model="E-tron";
        audi.year=2022;
        audi.color="Black";
        audi.moveForward();


    }
}

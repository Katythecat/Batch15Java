package class23.Assignments;

public class Computer {
    int RAM;
    int storage;
    String OS;
     void listenToMusic(){
        System.out.println("Computer can listen to music");
    }
    void wifi(){
        System.out.println("Computer can connect to wifi");
    }

    void blutooth(){
        System.out.println("Every computer has blutooth");
    }
}

class Apple extends Computer{
    @Override
    void listenToMusic() {
        System.out.println("Apple can listen to music ");
    }

    @Override
    void blutooth() {
        System.out.println("Apple has blutooth");
    }
}

class Lenovo extends Computer{
    @Override
    void wifi() {
        System.out.println("Lenovo can connect wifi");
    }
}

class Hp extends Computer{
    @Override
    void listenToMusic() {
        System.out.println("Hp can listen to music");
    }
}

class Dell extends Computer{
    @Override
    void blutooth() {
        System.out.println("Dell has blutooth");
    }
}


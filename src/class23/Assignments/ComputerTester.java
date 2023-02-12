package class23.Assignments;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple(),new Lenovo(),new Hp(),new Dell()};
        for(Computer c: computers){
            c.listenToMusic();
            c.wifi();
            c.blutooth();
        }
    }
}

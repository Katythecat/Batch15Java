package class19;

public class BookTest {
    public static void main(String[] args) {
        Book magicpig=new Book("Magic Pig", 4);

        Book cathabit=new Book("Cat Habit",8,"George");
        System.out.println("I hope this is the right thing to do");
        magicpig.info();
        cathabit.info();
    }
}

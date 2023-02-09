package class21;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cl=new Calculator();
        cl.add(10,20);
        cl.add(10,20,30);
        cl.add(10,20.50);
        cl.add(15.50,20);
    }
}

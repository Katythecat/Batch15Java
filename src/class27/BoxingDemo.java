package class27;

public class BoxingDemo {
    public static void main(String[] args) {
        int number=15;//auto boxing convert data from primitive data type to wrapper class automatically
        printData(number);

        Integer a=10;// autoBoxing
        int number2=a;
    }
    //there was one thing that java is 99.9 % OOP and this 0.1 is due to these primitive  datatype...
    public static void printData(Integer number){
        System.out.println(number);

    }
}

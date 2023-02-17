package class25;
interface ExampleInterface {

    //this example to use private method in interface, and we should use with default method
    default void doSomething() {
        int a = 10;
        int b = 20;
        int sum = add(a, b); // calling private method
        System.out.println("Sum: " + sum);
    }
    default int add(int a, int b) {
        return a + b;
    }
}
public  class ExampleClass implements ExampleInterface {
        // if we want to implement interface by using its private method we should to make class to public
        public void doSomething() {
            int a = 5;
            int b = 15;
            int sum = add(a, b); // calling private method through default method from interface
            System.out.println("Sum: " + sum);
        }
        public static void main(String[] args) {
            ExampleClass exampleClass = new ExampleClass();
            exampleClass.doSomething();
        }
    }



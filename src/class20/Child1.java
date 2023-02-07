package class20;

public class Child1 extends Parent{
    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        //c1.bye();can access but not the right way

        Parent.bye();//accessing static method in a static way by using class name
        Child1.bye();//accessing static method from the parent class using child class name

        //static belong to the class that's why we can
        //access through the class name
        //c1.money(); has private access

        c1.name="Nala";
        Parent.lastName="Thecat";
        //Child1.lastName="Thecat";//bc child class
        //inheritance
    }


}

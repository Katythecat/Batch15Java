package class25;

interface WashAble{
     void wash();//by default method in interface are implicitly public abstract
     //public static int number=12; //in interface implicitly add public static in data members
    //public final String name="Pizza"; //in interface implicitly add public final in data members
}
//interface contain interface method(by default)
//and we also can create default method and static method as well

public class SmartWatch implements WashAble{
    public void wash(){
        System.out.println("You can wash this smartwatch with out any issues");
    }
}
class Phone implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}

class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
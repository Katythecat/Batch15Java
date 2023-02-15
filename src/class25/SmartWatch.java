package class25;

interface WashAble{
    void wash();//by default method in interface are abstract
}


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
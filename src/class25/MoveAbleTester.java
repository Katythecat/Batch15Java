package class25;

public class MoveAbleTester {
    public static void main(String[] args) {
        WashAble[] washables={new SmartWatch(),new Phone(),new Inverter()};

        for(WashAble w:washables){
            w.wash();
        }

    }

}

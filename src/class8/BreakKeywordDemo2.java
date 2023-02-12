package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {


        /*  boolean summer = true;
       int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("I love summer because temperature is " + temp);
            } else {
                System.out.println("Its too hot "+temp);
                summer = false;
            }
            temp += 5;
        }*/

        int tem;
        for(tem=75; tem<=100; tem+=5) {
            System.out.println("I love summer because temperature is "+tem);
        }
        System.out.println("Its very hot "+tem);

    }

    }


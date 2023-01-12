package day5;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        String sum;
        int day = 4;
        switch (day) {
            case 1:
                //System.out.println("Monday");
                sum="Monday";
               //break;
            case 2:
                //System.out.println("Tuesday");
                sum="Tuesday";
               //break;
            case 3:
                //System.out.println("Wednesday");
                sum="Wednesday";
               //break;
            case 4:
                //
                sum="Thursday";
              //break;
            case 5:
               // System.out.println("Friday");
                sum="Friday";
               //break;
            case 6:
                //
                sum="Saturday";
              //break;
            case 7:
               // System.out.println("Sunday");
                sum="Sunday";
              //break;
           default:
             //System.out.println("Wrong day");
               sum=("Wrong day");

        }
        
    }
}

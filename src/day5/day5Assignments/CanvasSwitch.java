package day5.day5Assignments;

public class CanvasSwitch {
    public static void main(String[] args) {

        //super tricky and we need no put sout in our imagine and think about the answer.
        // answer default bc they don't have break and the last line will be executed
        double discount;
        char code = 'C' ;

        switch ( code ) {
            case 'A':
                discount = 0.0;

            case 'B':
                discount = 0.1;

            case 'C':
                discount = 0.2;

            default:
                discount = 0.3;

                System.out.println(discount);//imagine to put sout

        }
    }
}

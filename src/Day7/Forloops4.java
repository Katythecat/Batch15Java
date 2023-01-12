package Day7;

public class Forloops4 {
    public static void main(String[] args) {

        // 1 2 4 5 7 8 10
        /*for(int i=1;i <=10;  i++){
            if(i==3 || i== 6|| i==9) {
                continue;
            } System.out.println(i);*/

            // 1 2 4 5 7 8 10 11 13 14 16 17 19

            for(int i=0 ;i < 20 ;i++){
                //all the numbers divides by 3 and the reminder is not 0
                if(i%3!=0){
                    System.out.println(i);
                }
            }

        }
    }

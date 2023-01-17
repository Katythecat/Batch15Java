package class5;

public class LogicalOperator2 {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);

       double mathScore=75;
       double historyScore=91.5;
       double scienceScore=93.5;

      /* if(mathScore>90){
           if(historyScore>90){
               if(scienceScore>90){
                   System.out.println("You are brilliant Student");
               }else {
                   System.out.println("You need work harder is Science");
               }
               }else{
               System.out.println("You need work harder is History");
           }
       }else{
           System.out.println("You need work harder is Math");
       }*/

       if(mathScore>90&&historyScore>90&&scienceScore>90){
                   System.out.println("Brilliant student");
               }else{
           System.out.println("You need to work hard");
       }
           }
       }



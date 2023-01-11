package class4;

public class IfElseIfCondition3 {
    public static void main(String[] args) {

        int day = 5; // = Assign a value to a variable

        if(day==1){ // == we compare two values
            System.out.println("Monday");// if block
        }else if(day==2){
            System.out.println("Tuesday"); // else block
        }else if(day==3){
            System.out.println("Wednesday"); // else block
        }else if(day==4){
            System.out.println("Thursday"); // else block
        }else if(day==5){
            System.out.println("Friday"); // else block
        }else if(day==7){
            System.out.println("Sunday"); // else block
        }else{
            System.out.println("Wrong day number");
        }
    }
}

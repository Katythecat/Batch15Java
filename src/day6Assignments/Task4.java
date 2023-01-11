package day6Assignments;

public class Task4 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        //1
        int num = 20;
        while (num>=1) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num--;
        }
        System.out.println("--------------------------");
        //2
       int number = 20;
        while (number>=1){
                System.out.println(number);
                number-=2;
            }
        }
    }

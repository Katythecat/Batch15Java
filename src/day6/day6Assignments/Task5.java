package day6.day6Assignments;
public class Task5 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        //1
        int num = 20;
        while(num<=50){
            if(num%2!=0) {
                System.out.println(num);
            }
            num++;
            }
        System.out.println("----------------");
        //2
        int number = 21;
        while (number<=50){
            System.out.println(number);
            number+=2;
        }
        }
    }


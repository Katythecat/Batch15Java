package Day7;

public class BreakTask {
    public static void main(String[] args) {

       // When you know exactly how many times you want to loop through a block of code,
      //  use the for loop instead of a while loop:

        //when we don't know how many times we need to repeat a block of code
        //we should be going with while loop
        //most of the time it happens when the user input is involved

//using a for loop print odd numbers from 1-20
        for (int i = 1; i<=20 ; i+=2) {
            System.out.println(i);
        }

        //even numbers
        for (int i = 1; i < 20 ; i++) {
            if(i%2==0){
                System.out.println(i);

            }

        }
    }
}

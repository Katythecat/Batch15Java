package randomPractice.JanTask;

public class BooleanWorkDay {
    public static void main(String[] args) {
        /*
Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”
         */
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            System.out.println("I need a day off");
            day++;

            if (day == 6) {
                System.out.println("I do not need a day off any more");
                workDay = false;
            }
        }
    }
}
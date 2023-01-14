package RandomPractice;

public class Workday {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if(day<=5) {
                System.out.println("I need a day off");

            }else{
                    System.out.println("I do not need a day off anymore");
                   workDay=false;//we make workday=false bc be need to get out of loop
                }
                day++;
            }

        }
    }








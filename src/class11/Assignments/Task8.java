package class11.Assignments;
public class Task8 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries,
        south america countries, europe countries, asian countries,
        african countries. Then print all values from that array
         using 2 different loops and calculate how many total countries been stored
         */

        String[][] countries={{"Mexico","Canada","USA","Panama"},
                {"Peru","Argentina","Chile","Venezuela"},
                {"Germany","United Kingdom","Ukraine","Denmark"},
                {"Thai","Japan","India","Nepal","Pakistan"},
                {"Egypt","Madagascar","Mali","Morocco","Chad"}};

        int count=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                    count++;
                }
            System.out.println();
            }
        System.out.println("Sum of countries is "+count);
        System.out.println();
        System.out.println("----------");

        int count1=0;
        for(String[] x:countries){
            for(String country:x){
                System.out.print(country+" ");
                count1++;
            }
            System.out.println();
        }
        System.out.println("Sum of countries is :"+count1);
        }



    }


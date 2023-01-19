package class11.Assignments;

public class Task5 {
    public static void main(String[] args) {
        /*
         Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops
         */

       String[][] grocery={{"Tomatoes","Broccoli","Asparagus"},
               {"Apple","Orange","cherry"},
               {"Milk","Cheese","Yogurt"},
               {"Candy","Chocolate"}};
        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        for( String[] store : grocery){
            for (String item : store){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

}

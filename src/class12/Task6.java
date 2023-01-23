package class12;

public class Task6 {
    public static void main(String[] args) {
        String[][] countries={{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Ukraine", "Germany", "France", "Italy", "Poland", "Portugal", "Spain"},
                {"China", "Japan", "India", "Philippines", "Pakistan"},
                {"Nigeria", "Egypt", "Kenya", "South Africa", "Sudan", "Morocco"}};


        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        for(String[] x: countries){
            for(String y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the countries is: "+counter);
    }
}

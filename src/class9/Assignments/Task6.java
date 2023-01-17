package class9.Assignments;

public class Task6 {
    public static void main(String[] args) {
        /*
         Create an array of countries. While retrieving all values from an array
          print capital city for each country choose any five countries.
         */
        String[] country = {"South Korea", "Japan", "France", "Peru", "Italy"};
        String capital;

        for (int i = 0; i < country.length; i++) {

                switch (country[i]) {
                    case "South Korea":
                        capital="Seoul";
                        System.out.println("Captital city of " + country[i] + " is " + capital);
                        break;
                    case "Japan":
                        capital="Tokyo";
                        System.out.println("Captital city of " + country[i] + " is " + capital);
                        break;
                    case "France":
                        capital="Paris";
                        System.out.println("Captital city of " + country[i] + " is " + capital);
                        break;
                    case "Peru":
                        capital="Lima";
                        System.out.println("Captital city of " + country[i] + " is " + capital);
                        break;
                    case "Italy":
                        capital="Rome";
                        System.out.println("Captital city of " + country[i] + " is " + capital);
                        break;
                    default:
                        System.out.println("Invalid country");
                }

            }
        }
    }


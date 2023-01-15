package day9.HW;

public class Task6 {
    public static void main(String[] args) {
        /*
         Create an array of countries. While retrieving all values from an array
          print capital city for each country choose any five countries.
         */
        String[] country={"South Korea","Japan","France","Peru","Italy"};

        switch (country[3]){
            case "South Korea" :
                System.out.println("Captital city of "+country[0]+" is Seoul");break;
            case "Japan" :
                System.out.println("Captital city of "+country[1]+" is Tokyo");break;
            case "France" :
                System.out.println("Captital city of "+country[2]+" is Paris");break;
            case "Peru" :
                System.out.println("Captital city of "+country[3]+" is Lima");break;
            default:
                System.out.println("Captital city of "+country[4]+" is Rome");
        }

    }
}

package class4.Assignments;

public class Mortgage {
    public static void main(String[] args) {
        double mortgageRate = 2.0;
        int housePrice = 198000;
        if(mortgageRate<4.5){
            System.out.println("I will buy a house");
            if(housePrice>200000){
                System.out.println("I will take a loan");
            }else{
                System.out.println("I will pay cash");
            }
        }else{
            System.out.println("I will NOT buy a house");
        }

    }
}

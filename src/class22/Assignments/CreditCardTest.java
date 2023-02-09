package class22.Assignments;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.sumInterest(1000);

        Visa visa=new Visa();
        visa.sumInterest(2500);

        AX ax=new AX();
        ax.sumInterest(1800);


    }
}

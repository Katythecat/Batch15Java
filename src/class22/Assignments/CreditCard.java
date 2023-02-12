package class22.Assignments;

public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }



    void sumInterest(){

        System.out.println("Interest "+(balance*interest)/100);
    }
}
class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    void sumInterest() {
        this.balance=balance;
        System.out.println("You monthly interest is "+((balance*interest)+20));
    }
}


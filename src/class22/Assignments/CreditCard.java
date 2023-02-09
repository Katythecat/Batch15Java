package class22.Assignments;

public class CreditCard {
    double balance;
    static double interest=15.50/100;

    void sumInterest(double balance){
        this.balance=balance;
        System.out.println("You monthly interest is "+(balance*interest)/12);
    }
}
class Visa extends CreditCard{

    }

class AX extends CreditCard{
    @Override
    void sumInterest(double balance) {
        this.balance=balance;
        System.out.println("You monthly interest is "+balance*(interest+(1.75/100))/12);
    }
}


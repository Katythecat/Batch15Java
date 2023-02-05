package class19;

public class BankTest {
    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.accountNumber=166576138;
        ba.money=1000000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer(); methods defined inside child
        //class not available to the parent class

        System.out.println("-- Creating an object from checking acc");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=167651646;
        check.money=888888888;
        //features from checking class itself
        check.interest=0;

        check.deposit();//from parent
        check.transfer();//from child

        System.out.println("-- Creating an object from saving acc");
        Savings save=new Savings();
        save.accountNumber=456731638;
        save.money=157684324;
        save.profit=100;
       //save.interest=0; siblings features are not available

        save.deposit();//come from parent
        save.takeProfit();//come from itself saving//save.transfer();//not available


        //finish creating SuperSavings object and see which feature available to the class
        System.out.println("--Creating an object from SuperSaving acc");
        SuperSavings supersave=new SuperSavings();
        supersave.accountNumber=484216753;//BankAcc
        supersave.money=5000;//from BankAccount
        supersave.profit=200;//from Saving
        supersave.loan="Eligible";//form saving
        supersave.interestRate=3.5;//Super itself

        supersave.deposit();//from BankAcc
        supersave.takeProfit();//from Saving
        supersave.superSaving();//from super itself


    }

}

package class26;
public class AccountEncap {
    private double balance;
    private String accountNumber;
    private String type;
    private String accountTitle;

    public void setBalance(double balance){
        //sanitizing the input meaning checking the values before we can assign them.
        if(balance<0){
            System.out.println("Negative balance is not allowed");
        }else{
            this.balance=this.balance+balance;
        }
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() != 16) {
            System.out.println("Wrong account number");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountTitle(){
        return accountTitle;
    }

    public AccountEncap(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}

class AccountTester{

    public static void main(String[] args) {
        AccountEncap accountEncap =new AccountEncap(-1000,"hlf","jga;","ngoer;");
        System.out.println(accountEncap.getAccountTitle());

        accountEncap.setBalance(-64564664);
        accountEncap.setAccountNumber("15476");
    }
}





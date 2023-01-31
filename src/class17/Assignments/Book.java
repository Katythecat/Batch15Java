package class17.Assignments;

public class Book {

    String bName;
    double bPrice;
    String bCode;

    Book(){
        bName="Atomic Habit";
        bPrice=14.11;
        bCode="Ah101";
    }

    Book(String name, double price, String code){
        bName=name;
        bPrice=price;
        bCode=code;
    }

    void print(){
        System.out.println("Book name "+bName+" price "+bPrice+" $ "+" code "+bCode);
    }


}

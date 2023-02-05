package class19;

public class Book {
    String bookName;
    double price;
    String writer;

    Book(String bookName, int price){
        this.bookName=bookName;
        this.price=price;
        System.out.println("This is a book");
    }

    Book(String bookName, int price, String writer){
        this(bookName,price);
        this.writer=writer;
        System.out.println("Reading is my routine");
    }
    void info(){
        System.out.println("Book name is "+bookName+" price "+price+" the writer is "+ writer);
    }
}
